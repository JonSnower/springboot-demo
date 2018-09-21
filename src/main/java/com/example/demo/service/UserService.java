package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {

	public List<User> likeName(String name);

	public User getById(String id);

	public void saveUser(User user);
	
}
