package com.kk.springadvance.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kk.springadvance.basedo.BaseDo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author kk
 * @description 用户信息DO表格
 * @date 2025-11-19 09:54:05
 */
@Data
@EqualsAndHashCode
@TableName(value = "user_info",autoResultMap = true)
public class UserInfoDO extends BaseDo {
    private static final long serialVersionUID = 1L;
    /**
     * 用户id
     */
    private int userId;

    /**
     * 用户名
     */
    private String userName;
    /**
     *职位
     */
    private String position;
    /**
     * 公司
     */
    private String company;
    /**
     * 简介
     */
    private String profile;
    /**
     * 扩展字段
     */
    private String extend;
    /**
     * 是否删除
     */
    private Integer delete;
    /**
     * 用户角色
     */
    private Integer userRole;
    /**
     * 邮箱地址
     */
     private String email;
}
