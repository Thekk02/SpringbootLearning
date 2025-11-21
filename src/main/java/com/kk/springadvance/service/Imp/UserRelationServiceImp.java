package com.kk.springadvance.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kk.springadvance.entity.UserRelationDO;
import com.kk.springadvance.mapper.UserRelationMapper;
import com.kk.springadvance.service.UserRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kk
 * @description 用户关系服务层
 * @date 2025-11-21 09:53:55
 */
@Service
public class UserRelationServiceImp extends ServiceImpl<UserRelationMapper, UserRelationDO> implements UserRelationService {
    @Autowired
    private UserRelationMapper userRelationMapper;
    @Override
    public void deleteByUserId(Long userId) {
        userRelationMapper.deleteByUserId(userId);
    }

    @Override
    public void restoreByUserId(Long userId) {
        userRelationMapper.restoreByUserId(userId);
    }

}
