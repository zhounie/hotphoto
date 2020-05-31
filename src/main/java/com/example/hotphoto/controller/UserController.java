package com.example.hotphoto.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.hotphoto.core.page.PageRequest;
import com.example.hotphoto.dao.User;
import com.example.hotphoto.service.UserService;
import com.example.hotphoto.utils.PasswordUtils;
import com.example.hotphoto.vo.HttpResult;
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
    public HttpResult add (@RequestBody User user) {
        if (user.getPassword() != null) {
            String salt = PasswordUtils.getSalt();
            if (userService.findByUsername(user.getUsername()) != null) {
                return HttpResult.error("用户名已存在");
            }
            String password = PasswordUtils.encode(user.getPassword(), salt);
            user.setSalt(salt);
            user.setPassword(password);
        }
        return HttpResult.ok(userService.insertUser(user));
    }

    @PostMapping("/findAll")
    public List<User> findAll () {
        return userService.findAll();
    }

    @PostMapping("/findByUsername")
    public User findByUsername(@RequestBody String jsonString) {
        JSONObject params = JSONObject.parseObject(jsonString);
        User user = new User();
        user.setUsername(params.getString("username"));
        return userService.findByUsername(user.getUsername());
    }

    @PostMapping("/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(userService.findPage(pageRequest));
    }
}
