package com.kk.springadvance.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kk.springadvance.entity.UserRelationDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author kk
 * @description 用户关系mapper层
 * @date 2025-11-21 09:34:25
 */
@Mapper
public interface UserRelationMapper extends BaseMapper<UserRelationDO> {
    void deleteByUserId(@Param("userId") Long userId);

    @Update("update user_relation set deleted = 0 where user_id = #{userId} or follow_user_id = #{userId}")
    void restoreByUserId(@Param("userId") Long userId);
}
