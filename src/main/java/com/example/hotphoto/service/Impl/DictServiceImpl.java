package com.example.hotphoto.service.Impl;

import com.example.hotphoto.core.page.PageRequest;
import com.example.hotphoto.core.page.PageResult;
import com.example.hotphoto.dao.Dict;
import com.example.hotphoto.mapper.DictMapper;
import com.example.hotphoto.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DictServiceImpl implements DictService {
    @Resource
    private DictMapper dictMapper;

    @Override
    public int delete(Dict record) {
        return dictMapper.delete(record.getId());
    }

    @Override
    public int save(Dict record) {
        return 0;
    }

    @Override
    public int delete(List<Dict> records) {
        return 0;
    }

    @Override
    public Dict findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }

    @Override
    public List<Dict> findAll() {
        return dictMapper.findAll();
    }
}
