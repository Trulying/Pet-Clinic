package com.widera.petclinic.controller;

import com.widera.petclinic.domain.entities.User;
import com.widera.petclinic.service.OwnerService;
import com.widera.petclinic.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {
    OwnerService ownerService;
    UserManagementService userService;
    AuthenticationTrustResolver authenticationTrustResolver;

    @Autowired
    public LoginController(OwnerService ownerService,
                           UserManagementService userService,
                           AuthenticationTrustResolver authenticationTrustResolver) {
        this.ownerService = ownerService;
        this.userService = userService;
        this.authenticationTrustResolver = authenticationTrustResolver;
    }

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


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout";
    }

    @RequestMapping(value = "/owner-data", method = RequestMethod.GET)
    public String getUserForm(){
        if(isUserAnonymous()){
            return "login";
        }
        else {
            return "redirect:/home";
        }
    }

    private boolean isUserAnonymous() {
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authenticationTrustResolver.isAnonymous(authentication);
    }
}
