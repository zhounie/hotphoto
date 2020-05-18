package com.example.hotphoto.mapper;


import com.example.hotphoto.dao.Menu;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper {
    @Insert("INSERT INTO `menu` (name, path, parentId) VALUES (#{name},#{path},#{parentId})")
    int insert(Menu menu);
}
