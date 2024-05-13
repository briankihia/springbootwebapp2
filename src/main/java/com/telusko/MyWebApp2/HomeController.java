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
    public ModelAndView home(Alien alien)
    {
//here we want to accept data in an object because we are getting not just one but more data from the client side
        ModelAndView mv = new ModelAndView();
//        below I am passing a whole object not just a 1 value
        // below am putting all contents of alien in obj thus I access them contents of alien using obj. in html side/template side
        mv.addObject("obj", alien);
        mv.setViewName("home");

        return mv;
    }
}


