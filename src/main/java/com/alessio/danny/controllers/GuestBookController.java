package com.alessio.danny.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alessio.danny.model.GuestBookEntry;

@Controller
public class GuestBookController {
	
	@RequestMapping(value = "guestbook", method = RequestMethod.GET)
	public String addGoal(Model model) {

		return "guestbook";
	}
	
	@RequestMapping(value = "guestbook" , method = RequestMethod.POST)
	public String updateGoal(@Valid @ModelAttribute("guestbookentry") GuestBookEntry guestBookEntry, BindingResult result) {
		
		System.out.println("result had errors: " + result.hasErrors());
		
		if(result.hasErrors()) {
			return "guestbook";
		}
		
		System.out.println("Entry inserted: "+ guestBookEntry.getUserName());

		return "guestbook";
	}
}

