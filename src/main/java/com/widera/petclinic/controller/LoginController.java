package com.widera.petclinic.controller;

import com.widera.petclinic.domain.entities.User;
import com.widera.petclinic.service.OwnerService;
import com.widera.petclinic.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @Autowired
    private OwnerService ownerService;
    @Autowired
    private UserRegisterService userService;

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String getCreateAccountForm(Model model){
        User user = new User();
        model.addAttribute("user", user);

        return "createAccountForm";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String processCreateAccountForm(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/login";
    }

    @RequestMapping(value = "/owner-data", method = RequestMethod.GET)
    public String getOwnerDataForm(Model model){

        return "redirect:/login";
    }

}
