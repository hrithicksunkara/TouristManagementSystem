package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
@RequestMapping(value = "/addTourist")
public class TouristController {
	
	@GetMapping
	public ModelAndView display() {
		System.out.println("tourist1");
		ModelAndView mv = new ModelAndView();
		return mv;
	}
	
}
