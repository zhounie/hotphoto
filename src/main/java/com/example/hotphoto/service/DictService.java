package com.example.hotphoto.service;

import com.example.hotphoto.core.service.CurdService;
import com.example.hotphoto.dao.Dict;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DictService extends CurdService<Dict> {
    List<Dict> findAll();
}
