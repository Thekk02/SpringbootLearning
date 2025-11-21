package com.kk.springadvance.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kk.springadvance.entity.UserInfoDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
 * @author kk
 * @description 用户信息mapper层
 * @date 2025-11-21 11:45:53
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfoDO> {
    @Update("update user_info set deleted = 1 where user_id = #{userId}")
    void deleteInfoByUserId(Long userId);

    @Update("update user_info set deleted = 0 where user_id = #{userId}")
    void restoreInfoByuserId(Long userId);
}
