package com.alessio.danny.controllers;


import java.time.Year;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {


	@RequestMapping(value = "/")
    public String showPage(Model model) {
        model.addAttribute("greetings", "Welcome to the Osudio Blog!");
        model.addAttribute("currentYear", String.valueOf(Year.now().getValue()));
        return "pages/homepage";
    }

}
