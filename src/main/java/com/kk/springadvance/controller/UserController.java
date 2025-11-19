package com.kk.springadvance.controller;

import com.kk.springadvance.common.Result;
import com.kk.springadvance.service.Imp.UserServiceImp;
import com.kk.springadvance.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author kk
 * @description 用户控制层
 * @date 2025-11-19 09:36:32
 */
@Api(value = "用户接口",tags = "用户相关接口")
@RestController
@RequestMapping()
public class UserController {
    @Autowired
    private UserServiceImp userService;

    @PostMapping("/login")
    public Result<Boolean> login(HttpServletResponse response){
        return Result.ok(true);
    }


}
