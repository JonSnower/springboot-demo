package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.example.demo.config.mybatis.MyMapper;
import com.example.demo.entity.User;

@Mapper
public interface UserMapper extends MyMapper<User> {

    List<User> likeName(String name);

    User getById(String id);

    void saveUser(User user);

}