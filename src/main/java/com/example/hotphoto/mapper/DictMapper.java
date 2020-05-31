package com.example.hotphoto.mapper;

import com.example.hotphoto.dao.Dict;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DictMapper {
    int delete(Long id);

    int insert(Dict record);

    int update(Dict record);

    List<Dict> findPage();

    List<Dict> findPageByLabel(@Param("label") String label);

    @Select("SELECT * FROM `dict`")
    List<Dict> findAll();
}
