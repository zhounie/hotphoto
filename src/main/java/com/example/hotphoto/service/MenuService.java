package com.example.hotphoto.service;


import com.example.hotphoto.dao.Menu;
import org.springframework.stereotype.Service;

@Service
public interface MenuService {
    int insertMenu(Menu menu);
}
