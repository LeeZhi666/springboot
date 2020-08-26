package com.qf.springboot.service;

import com.qf.springboot.pojo.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    void deleteById(Integer id);
    void deleteByIds(Integer[] ids);
    void insert(User user);
}
