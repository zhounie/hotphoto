package com.example.hotphoto.service;

import com.example.hotphoto.dao.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    int insertUser(User user);

    List<User> findAll();
}
