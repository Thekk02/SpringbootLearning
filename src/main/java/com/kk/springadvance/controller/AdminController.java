package com.kk.springadvance.controller;

import com.kk.springadvance.common.Result;
import com.kk.springadvance.common.Status;
import com.kk.springadvance.service.Imp.UserServiceImp;
import com.kk.springadvance.service.UserRelationService;
import com.kk.springadvance.service.UserService;
import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kk
 * @description 管理员控制类
 * @date 2025-11-21 10:17:58
 */
@Api(value = "管理员接口",tags = "管理员相关接口实现")
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRelationService userRelationService;

    /**
     *
     * @param userId
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @RequestMapping("/deleteuserById")
    public Result<Boolean> deleteUserById(@Param("userId") Long userId){
        if(userService.getUserStateByUserId(userId)){
            userService.deleteUserById(userId);
            userRelationService.deleteByUserId(userId);
            return Result.ok(Boolean.TRUE);
        }
        return Result.fail(Status.newStatus(401,"用户不存在"));
    }

}
