package com.example.hotphoto.core.service;

import com.example.hotphoto.core.page.PageRequest;
import com.example.hotphoto.core.page.PageResult;

import java.util.List;

public interface CurdService<T> {

    int save(T record);

    int delete(T record);

    /**
     * 批量删除
     * @param records
     * @return
     */
    int delete(List<T> records);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    T findById(Long id);

    /**
     * 分页查询
     * 统一封装了分页请求和结果，避免直接引入具体框架的分页对象
     * 如MyBatis或JPA的分页对象从而避免因为替换ORM框架而导致服务层
     * 控制层的分页接口也需要变动的情况，替换ORM框架也不会影响服务层
     * 以上的分页接口起到了解耦的作用
     * @param pageRequest
     * @return
     */
    PageResult findPage(PageRequest pageRequest);
}
