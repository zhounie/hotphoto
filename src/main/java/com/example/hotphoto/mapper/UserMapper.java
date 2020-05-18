package com.example.hotphoto.mapper;


import com.example.hotphoto.dao.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO `user` (username, password) VALUES (#{username},#{password})")
    int insert(User user);

    @Select("SELECT * FROM `user`")
    List<User> findAll();
}
