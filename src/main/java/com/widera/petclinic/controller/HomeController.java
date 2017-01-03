package com.widera.petclinic.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("helloMessage", "Welcome");
        model.addAttribute("user", getUsername());
        return "home";
    }


    @RequestMapping(value = "/about")
    public String aboutUs(){
        return "about";
    }

    private String getUsername(){
        String username = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
        } else {
          username = principal.toString();
        }
        return username;
    }

}
