package com.example.hotphoto.service;

import com.example.hotphoto.core.service.CurdService;
import com.example.hotphoto.dao.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface UserService extends CurdService<User> {
    int insertUser(User user);

    List<User> findAll();

    User findByUsername(String username);

    /**
     * 查询用户的菜单权限标识集合
     * @param username
     * @return
     */
    Set<String> findPermissions(String username);
}
