package com.kk.springadvance.exception;

import com.kk.springadvance.enums.StatusEnum;

/**
 * @author kk
 * @description 异常工具类
 * @date 2025-11-20 08:44:21
 */
public class ExceptionUtil {
    public static ForumException of(StatusEnum status,Object... args){
        return new ForumException(status,args);
    }
}
