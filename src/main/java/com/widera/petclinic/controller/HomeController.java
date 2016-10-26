package com.widera.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by macie_000 on 22.09.2016.
 */

@Controller
public class HomeController {
    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("helloMessage", "Welcome");
        model.addAttribute("hiMessage", "this is pet clinic");
        return "home";
    }

    @RequestMapping(value = "/about")
    public String aboutUs(){
        return "about";
    }

}
