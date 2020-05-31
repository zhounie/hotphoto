package com.example.hotphoto.controller;

import com.example.hotphoto.core.page.PageRequest;
import com.example.hotphoto.dao.Dict;
import com.example.hotphoto.service.DictService;
import com.example.hotphoto.vo.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("dict")
public class DictController {
    @Autowired
    private DictService dictService;

    @PostMapping("/del")
    public HttpResult delete(@RequestBody List<Dict> records) {
        return HttpResult.ok(dictService.delete(records));
    }

    @PostMapping("/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(dictService.findPage(pageRequest));
    }

    @PostMapping("/findAll")
    public HttpResult findAll() {
        return HttpResult.ok(dictService.findAll());
    }
}
