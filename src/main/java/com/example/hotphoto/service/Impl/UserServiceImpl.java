package com.example.hotphoto.service.Impl;

import com.example.hotphoto.core.page.MybatisPageHelper;
import com.example.hotphoto.core.page.PageRequest;
import com.example.hotphoto.core.page.PageResult;
import com.example.hotphoto.dao.User;
import com.example.hotphoto.mapper.UserMapper;
import com.example.hotphoto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    @Override
    public Set<String> findPermissions(String username) {
        Set<String> permissions = new HashSet<>();
        permissions.add("sys:user:view");
        permissions.add("sys:user:add");
        permissions.add("sys:user:edit");
        permissions.add("sys:user:delete");
        return permissions;
    }

    @Transactional
    @Override
    public int save(User record) {
        Long id = null;
        if (record.getId() == null || record.getId() == 0) {
            userMapper.insert(record);
            id = record.getId();
        } else {
            userMapper.updateByPrimaryKeySelective(record);
        }
        if (id != null && id == 0) {
            return 1;
        }
        return 1;
    }

    @Override
    public int delete(User record) {
        return 0;
    }

    @Override
    public int delete(List<User> records) {
        return 0;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        PageResult pageResult = null;
        Object name = pageRequest.getParams();

        pageResult = MybatisPageHelper.findPage(pageRequest, userMapper);
        return pageResult;
    }
}
