package com.touristManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.touristManagementSystem.model.TouristMaster;
import com.touristManagementSystem.service.TouristService;

@RestController
public class TouristController {
	
	@Autowired
	TouristService touristService;
	
	@RequestMapping(value = "/addTourist")
	public ModelAndView display(Model Model) {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("Tourist", touristService.getData());
		return mv;
	}
	
	@GetMapping(value="/TouristDetails")
	public ModelAndView touristDetails(Model model) {
		ModelAndView mv = new ModelAndView("TouristDetails");
		mv.addObject("Tourist",touristService.getData());
		return mv;
	}
	
	
	
}
