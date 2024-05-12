package com.telusko.MyWebApp2;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController 
{

    @RequestMapping("home")
    public String home(HttpServletRequest req, HttpServletResponse res)
    {

        HttpSession session = req.getSession();
//        once we have ahold on session object now lets's add a name to session object
        String name = req.getParameter("name");
        session.setAttribute("name", name);
//        using request dispatcher to call home page
//        in request dispatcher, two or one servlet of one jsp share the same request object
        System.out.println("hi"+ name);

        return "home";
    }
}


