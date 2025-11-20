package com.kk.springadvance.service.Imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kk.springadvance.mapper.UserMapper;
import com.kk.springadvance.entity.UserDO;
import com.kk.springadvance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kk
 * @description 用户服务实现层
 * @date 2025-11-19 10:07:30
 */
@Service
public class UserServiceImp extends ServiceImpl<UserMapper, UserDO> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDO getById(Integer id) {
        UserDO user = userMapper.selectById(id);
        return user;
    }
}
