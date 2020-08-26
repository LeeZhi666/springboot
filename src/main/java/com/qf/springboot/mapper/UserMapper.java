package com.qf.springboot.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qf.springboot.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
