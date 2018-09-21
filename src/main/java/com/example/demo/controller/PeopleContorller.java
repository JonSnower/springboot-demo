package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PeopleService;

@RestController
public class PeopleContorller {

	@Autowired
	private PeopleService peopleService;
	
	@RequestMapping("/getPeopleInfo")
	public Object getPeopleInfo() {
		return peopleService.getPeopleInfo();
	}
	
}