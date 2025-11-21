package com.kk.springadvance.service.Imp;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kk.springadvance.entity.UserInfoDO;
import com.kk.springadvance.enums.UserStateEventEnum;
import com.kk.springadvance.enums.event.UserStateEvent;
import com.kk.springadvance.mapper.UserInfoMapper;
import com.kk.springadvance.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author kk
 * @description 用户信息服务实现层
 * @date 2025-11-21 11:48:35
 */
@Service
public class UserInfoServiceImp extends ServiceImpl<UserInfoMapper, UserInfoDO> implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public void deleteInfoByUserId(Long userId) {
        userInfoMapper.deleteInfoByUserId(userId);
    }

    @Override
    public void restoreInfoByUserId(Long userId) {
        userInfoMapper.restoreInfoByuserId(userId);
    }

    @EventListener(UserStateEvent.class)
    public void autoUpdateUserInfo(UserStateEvent<Long> event){
        UserStateEventEnum userStateEventEnum = event.getUserStateEventEnum();
        if(userStateEventEnum == UserStateEventEnum.DELETE){
            userInfoMapper.deleteInfoByUserId(event.getContent());
        }else if(userStateEventEnum == UserStateEventEnum.RESTORE){
            userInfoMapper.restoreInfoByuserId(event.getContent());
        }

    }
}
