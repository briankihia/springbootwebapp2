package com.telusko.MyWebApp2;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController 
{

    @RequestMapping("home")
    public ModelAndView home(@RequestParam("name") String myName)
    {
//        if you have different name from the one getting passed in client side , use annotation RequestParam
//        so whenever client side sends name assign it to myName

//        we are using session to access our data in our page, home.jsp
//        whatever data we return from this method it is going to dispatcher servlet
//        dispatcherServlet is a special thing in mvc
//        dispatcherServlet needs a 1.data and  2.View name
//        here we are passing  1. view name= home(where we have return "home")   and 2. data= name
//        below we have the object
//        ModelAndView is a class that can hold two things, 1. view name, 2. data
        ModelAndView mv = new ModelAndView();
//        we wanna send the data myName and we wanna specify the view name
//        below is powerful because you can add a couple of objects
        mv.addObject("name", myName);

//        now the view name
        mv.setViewName("home");


        return mv;
    }
}


