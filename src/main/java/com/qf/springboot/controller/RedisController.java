package com.qf.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "redis接口")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @ApiOperation("测试redis")
    @RequestMapping("/testRedis")
    @ResponseBody
    public String testRedis(){

        //redisTemplate.opsForValue();//操作字符串
        //redisTemplate.opsForList();//操作List
        //redisTemplate.opsForSet();//操作Set
        //redisTemplate.opsForZSet();//操作ZSet
        //redisTemplate.opsForHash();//操作Map

        redisTemplate.opsForValue().set("username","jack");
        String username = (String) redisTemplate.opsForValue().get("username");

        System.out.println(username);

        stringRedisTemplate.opsForValue().set("password","12340");
        String password = stringRedisTemplate.opsForValue().get("password");
        System.out.println(password);
        return "success";
    }
}
