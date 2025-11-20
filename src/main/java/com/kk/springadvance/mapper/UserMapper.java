package com.kk.springadvance.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kk.springadvance.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author kk
 * @description 用户mapper层
 * @date 2025-11-19 10:03:19
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {
}
