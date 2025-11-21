package com.kk.springadvance.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kk.springadvance.entity.UserRelationDO;

/**
 * @author kk
 * @description 用户关系服务层
 * @date 2025-11-21 09:45:03
 */
public interface UserRelationService extends IService<UserRelationDO> {
    void deleteByUserId(Long userId);

    void restoreByUserId(Long userId);
}
