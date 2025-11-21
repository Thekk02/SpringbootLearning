package com.kk.springadvance.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kk.springadvance.entity.UserInfoDO;

/**
 * @author kk
 * @description 用户信息service层
 * @date 2025-11-21 11:47:51
 */
public interface UserInfoService extends IService<UserInfoDO> {
    void deleteInfoByUserId(Long userId);

    void restoreInfoByUserId(Long userId);
}
