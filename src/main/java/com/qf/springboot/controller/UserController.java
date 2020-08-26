package com.qf.springboot.controller;


import com.qf.springboot.pojo.User;
import com.qf.springboot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.beanutils.ConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(tags = "User接口")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("查所有")
    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll(){
        return userService.findAll();
    }
    @ApiOperation("根据id 删除")
    @RequestMapping("/deleteById")
    @ResponseBody
    public String deleteById(@RequestParam("id") String id){
        int ids = Integer.parseInt(id);
        userService.deleteById(ids);
        return "success";
    }
    @ApiOperation("根据id批量删除")
    @RequestMapping("deleteByIds")
    @ResponseBody
    public String deleteByIds(@RequestParam("ids") String[] ids){

        Integer[] id = (Integer[]) ConvertUtils.convert(ids, Integer.class);

        userService.deleteByIds(id);

        return "success";
    }
    @ApiOperation("插入User")
    @RequestMapping("/insertUser")
    @ResponseBody
    public String insertUser(){
        User user = new User(1, "jack", "1234");
        userService.insert(user);
        return "success";
    }
}
