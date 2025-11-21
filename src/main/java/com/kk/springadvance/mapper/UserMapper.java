package com.kk.springadvance.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kk.springadvance.dto.FollowUserDTO;
import com.kk.springadvance.entity.UserDO;
import com.kk.springadvance.vo.PageParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author kk
 * @description 用户mapper层
 * @date 2025-11-19 10:03:19
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {
    //根据用户Id查询用户状态
    @Select("select deleted from user where id = #{userId}")
    Boolean getUserStateByUserId(Long userId);
    //根据用户名判断用户是否存在
    @Select("select exist(select 1 from user where user_name = #{userName} ) ")
    Boolean isExistByUserId(Long userName);
    //根据用户ID查询用户
    @Select("select * from user where id = #{userId}")
    UserDO getById(@Param("userId") Long userId);

    @Select("select * from user where id > #{userId} limit #{size} order by id asc ")
    List<UserDO> getByIdOrderByIdAsc(@Param("userId") Long useId,@Param("size") Long size);

    //查询用户关注的所有用户列表
    List<FollowUserDTO> getUserFollowList(@Param("followUserId") Long followuserId, @Param("pageParam")PageParam pageParam);

    //获取用户的所有粉丝列表
    List<FollowUserDTO> getUserFansList(@Param("userId") Long userId,@Param("pageParam") PageParam pageParam);

    //删除用户，并清空所有相关的关系（这里实际操作为把所有相关的deleted字段设置为0）
    void deleteUserById(@Param("userId") Long userId);


}
