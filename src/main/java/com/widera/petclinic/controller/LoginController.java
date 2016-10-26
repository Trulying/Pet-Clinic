package com.widera.petclinic.controller;

import com.widera.petclinic.domain.entities.Owner;
import com.widera.petclinic.domain.entities.User;
import com.widera.petclinic.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @Autowired
    private OwnerService ownerService;

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String getCreateAccountForm(Model model){
        User user = new User();
        Owner owner = new Owner();

        model.addAttribute("owner", owner);
        model.addAttribute("user", user);

        return "createAccountForm";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String processCreateAccountForm(@ModelAttribute("owner") Owner petOwner,
                                           @ModelAttribute("user") User user) {
            user.setOwner(petOwner);
            ownerService.addNewOwner(petOwner);

        return "redirect:/login";
    }

}
