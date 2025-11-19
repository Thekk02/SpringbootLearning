package com.kk.springadvance.controller;

import com.kk.springadvance.common.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author kk
 * @description 测试controller层
 * @date 2025-11-19 10:48:35
 */
@Api(value = "测试接口",tags = "仅供测试使用")
@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("/demo1")
    @ApiOperation(value = "demo",notes = "demo")
    public Result<Boolean> getDemo1(HttpServletResponse response){
        return Result.ok(true);
    }
}
