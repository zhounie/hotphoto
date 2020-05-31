package com.example.hotphoto.mapper;


import com.example.hotphoto.dao.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO `user` (username, password, salt) VALUES (#{username},#{password},#{salt})")
    int insert(User user);

    @Select("SELECT * FROM `user`")
    List<User> findAll();

    @Select("SELECT * FROM `user` WHERE username=#{username}")
    User findByUsername(@Param(value="username") String username);

    int updateByPrimaryKeySelective(User user);

    @Select("SELECT * FROM `user`")
    List<User> findPage();
}
