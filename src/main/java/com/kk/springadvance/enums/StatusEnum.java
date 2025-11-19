package com.kk.springadvance.enums;

import lombok.Getter;

/**
 * @author kk
 * @description 返回状态枚举
 * @date 2025-11-19 10:16:38
 */
public enum StatusEnum {
    SUCESS(0,"成功"),
    USER_NOT_EXISTS(400,"用户不存在")
    ;
    @Getter
    private int code;
    @Getter
    private String msg;

    StatusEnum(int code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
