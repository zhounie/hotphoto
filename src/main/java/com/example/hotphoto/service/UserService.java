package com.example.hotphoto.service;

import com.example.hotphoto.dao.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface UserService {
    int insertUser(User user);

    List<User> findAll();

    User findByUsername(String username);

    Set<String> findPermissions(String username);
}
