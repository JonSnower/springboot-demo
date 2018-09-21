package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.People;
import com.example.demo.service.PeopleService;

@Service
public class PeopleServiceImpl implements PeopleService {

	@Autowired
	private People people;
	
	@Override
	public People getPeopleInfo() {
		return people;
	}

}
