package com.widera.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by maviek on 21.10.16.
 */
@Controller
public class UserController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {

        return "login";
    }
}
