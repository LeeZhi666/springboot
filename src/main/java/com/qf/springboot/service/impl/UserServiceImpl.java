package com.qf.springboot.service.impl;

import com.qf.springboot.mapper.UserMapper;
import com.qf.springboot.pojo.User;
import com.qf.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.selectList(null);
    }

    @Override
    public void deleteById(Integer id) {
         userMapper.deleteById(id);
    }

    @Override
    public void deleteByIds(Integer[] ids) {
        userMapper.deleteBatchIds(Arrays.asList(ids));
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }


}
