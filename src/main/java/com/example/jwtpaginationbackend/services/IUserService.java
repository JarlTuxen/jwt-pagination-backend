package com.example.jwtpaginationbackend.services;

import com.example.jwtpaginationbackend.entity.User;

import java.util.List;

public interface IUserService extends ICrudService<User,Long>{
    List<User> findByName(String name);
}
