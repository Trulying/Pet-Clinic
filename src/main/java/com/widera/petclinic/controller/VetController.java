package com.widera.petclinic.controller;

import com.widera.petclinic.domain.entities.Vet;
import com.widera.petclinic.service.interfaces.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * Created by macie_000 on 24.09.2016.
 */
@Controller
public class VetController {
    @Autowired
    private VetService vetService;

    @RequestMapping("/vets")
    public String getListOfVets(Model model) {
        Collection<Vet> vets = vetService.getAllVets();
        model.addAttribute("vets", vets);
        return "vets";
    }

}
