package com.example.hotphoto.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.hotphoto.dao.Menu;
import com.example.hotphoto.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @PostMapping("/add")
    public int inster(@RequestBody String jsonParams) {
        JSONObject params = JSONObject.parseObject(jsonParams);
        Menu menu = new Menu();
        menu.setName(params.getString("name"));
        menu.setPath(params.getString("path"));
        return menuService.insertMenu(menu);
    }
}
