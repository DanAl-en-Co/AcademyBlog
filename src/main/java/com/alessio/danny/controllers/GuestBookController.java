package com.alessio.danny.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alessio.danny.model.GuestBookEntry;
import com.alessio.danny.service.EntryService;
import com.alessio.danny.service.impl.EntryServiceImpl;

@Controller
@RequestMapping("/guestbook")
public class GuestBookController {
	private EntryService entryService = new EntryServiceImpl();
	
	@RequestMapping(method = RequestMethod.GET)
	public String addEntry(Model model) {
		model.addAttribute("guestBookEntry", new GuestBookEntry());
		if (entryService.getGuestBookEntries() != null) {			
			model.addAttribute("guestBookEntries",entryService.getGuestBookEntries());
		}
		return "guestbook";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String updateEntry(@Valid @ModelAttribute("guestBookEntry") GuestBookEntry guestBookEntry, BindingResult bindingResult) {
		System.out.println("Entry inserted: "+ guestBookEntry.getUserName());
		entryService.insertEntry(guestBookEntry.getUserName(), guestBookEntry.getMessage());		
		return "redirect:/guestbook";
	}
}

