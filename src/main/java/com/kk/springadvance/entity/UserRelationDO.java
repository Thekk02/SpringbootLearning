package com.kk.springadvance.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kk.springadvance.base.BaseDo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author kk
 * @description 用户关系DO
 * @date 2025-11-19 09:59:37
 */
@Data
@EqualsAndHashCode
@TableName("user_relation")
public class UserRelationDO extends BaseDo {
    private static final long serialVersionUID = 1L;
    /**
     * 主用户ID
     */
    private Long userId;
    /**
     * 粉丝用户ID
     */
    private Long followUserId;
    /**
     * 关注状态
     */
    private Integer followState;
}
