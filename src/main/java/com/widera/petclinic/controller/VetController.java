package com.widera.petclinic.controller;

import com.widera.petclinic.domain.entities.ContactDetails;
import com.widera.petclinic.domain.entities.Vet;
import com.widera.petclinic.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

/**
 * Created by maciek on 30.09.16.
 */
@Controller
public class VetController {
	@Autowired
	private VetService vetService;

	@RequestMapping(value = "/vets", method = RequestMethod.GET)
	public String vetList(Model model) {
		Collection<Vet> vets = vetService.getAllVets();
		model.addAttribute("vets", vets);

		return "vets";
	}

	@RequestMapping(value = "/vets/vet", method = RequestMethod.GET)
	public String getVetDetailsById(Model model, @RequestParam ("id") Long vetId) {
		Vet vet = vetService.getVetById(vetId);
		model.addAttribute("vet", vet);
		ContactDetails vetContactDetails = vet.getContactDetails();
		model.addAttribute("vetNumber", vetContactDetails.getPhoneNumber());
		model.addAttribute("vetMail", vetContactDetails.getEMail());

		return "vet";
	}
}
