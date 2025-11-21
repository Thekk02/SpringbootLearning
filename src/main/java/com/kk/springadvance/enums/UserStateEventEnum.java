package com.kk.springadvance.enums;

import lombok.Getter;

/**
 * @author kk
 * @description 用户状态变更事件枚举
 * @date 2025-11-21 11:30:45
 */
@Getter
public enum UserStateEventEnum {
    CREATE(0,"新建"),
    DELETE(1,"删除"),
    RESTORE(2,"恢复"),

    ;





    private int type;
    private String msg;

    UserStateEventEnum(int type,String msg){
        this.type = type;
        this.msg = msg;
    }
}
