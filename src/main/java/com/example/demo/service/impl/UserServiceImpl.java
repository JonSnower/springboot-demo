package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> likeName(String name) {
		return userMapper.likeName(name);
	}

	@Override
	public User getById(String id) {
		return userMapper.getById(id);
	}

	@Override
	public void saveUser(User user) {
		userMapper.saveUser(user);
	}

}
