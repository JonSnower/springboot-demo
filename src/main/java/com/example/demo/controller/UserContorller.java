package com.example.demo.controller;


import com.example.demo.common.exception.ValidationException;
import com.example.demo.common.response.ResponseContent;
import com.example.demo.common.response.ResponseUtil;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

import io.swagger.annotations.Api;

@Api("userCon")
@RestController
public class UserContorller {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/likeName")
    public ResponseContent likeName(@Validated @RequestBody User user, BindingResult bindingResult) throws Exception {

        if (bindingResult.hasErrors()) {
            throw new ValidationException(bindingResult);
        }

        String name = user.getName();
        return ResponseUtil.success(userService.likeName(name));
    }

    @PostMapping(value = "/saveUser")
    public ResponseContent saveUser(@RequestBody User user) throws Exception {
        userService.saveUser(user);
        return ResponseUtil.success();
    }

    @RequestMapping("/getById")
    public ResponseContent getById(@RequestParam String id) {
        return ResponseUtil.success(userService.getById(id));
    }

}