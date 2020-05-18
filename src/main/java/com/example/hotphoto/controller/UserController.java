package com.example.hotphoto.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.hotphoto.dao.User;
import com.example.hotphoto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
//    @RequestParam String username, @RequestParam String password

    @PostMapping("/add")
    public int add (@RequestBody String jsonString) {
        JSONObject params = JSONObject.parseObject(jsonString);
        User user = new User();
        user.setUsername(params.getString("username"));
        user.setPassword(params.getString("password"));
        return userService.insertUser(user);
    }


    @PostMapping("/findAll")
    public List<User> findAll () {
        return userService.findAll();
    }
}
