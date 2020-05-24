package com.example.hotphoto.controller;


import com.example.hotphoto.security.JwtAuthenticatioToken;
import com.example.hotphoto.utils.SecurityUtils;
import com.example.hotphoto.vo.HttpResult;
import com.example.hotphoto.vo.LoginBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class LoginController {
    @Autowired
    private AuthenticationManager authenticationManager;


    /**
     * 登录接口
     * @param loginBean
     * @param request
     * @return
     * @throws IOException
     */
    @PostMapping(value = "/login")
    public HttpResult login(@RequestBody LoginBean loginBean, HttpServletRequest request) throws IOException {
        String username = loginBean.getUsername();
        String password = loginBean.getPassword();

//        系统登录认证
//        JwtAuthenticatioToken token = SecurityUtils.login(request, username, password, authenticationManager);

        return HttpResult.ok();
    }
}
