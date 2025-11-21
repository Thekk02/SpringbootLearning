package com.kk.springadvance.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author kk
 * @description 关注用户DTO
 * @date 2025-11-21 08:34:41
 */
@Data
public class FollowUserDTO implements Serializable {
    private static final long serialVerionUID = 1L;

    /**
     * 当前登陆的用户与这个用户之间的关系id
     */
    private Long relationId;

    /**
     * 标识当前用户有没有关注这个用户
     * true为有，false为没有
     */
    private Boolean followed;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户名
     */
    private String userName;

}
