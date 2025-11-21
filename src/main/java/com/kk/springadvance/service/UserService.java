package com.kk.springadvance.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kk.springadvance.entity.UserDO;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

/**
 * @author kk
 * @description 用户服务层
 * @date 2025-11-19 10:06:13
 */
public interface UserService extends IService<UserDO> {
    UserDO getById(Integer id);
    Boolean getUserStateByUserId(Long userId);
    void deleteUserById(@Param("userId") Long userId);
}
