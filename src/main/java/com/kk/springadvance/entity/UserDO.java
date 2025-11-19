package com.kk.springadvance.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kk.springadvance.basedo.BaseDo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author kk
 * @description 用户Do
 * @date 2025-11-19 09:50:02
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("user")
public class UserDO extends BaseDo {
    private static final long serialVersionUID = 1L;

    /**
     * 用户状态
     */
    private Integer delete;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String password;
}
