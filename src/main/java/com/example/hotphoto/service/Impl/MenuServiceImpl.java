package com.example.hotphoto.service.Impl;


import com.example.hotphoto.dao.Menu;
import com.example.hotphoto.mapper.MenuMapper;
import com.example.hotphoto.service.MenuService;
import com.example.hotphoto.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;

    @Override
    public int insertMenu(Menu menu) {
        return menuMapper.insert(menu);
    }
}
