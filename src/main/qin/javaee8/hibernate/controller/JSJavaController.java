package qin.javaee8.hibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/j")
public class JSJavaController
{
    @RequestMapping(value = "/ava")
    public void ava(HttpServletRequest request) throws Exception
    {
        //System.out.println(request.getAttribute("texx"));
        System.out.println(request.getParameter("texx"));
    }

}