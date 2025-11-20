package com.kk.springadvance.exception;

import com.kk.springadvance.common.Status;
import com.kk.springadvance.enums.StatusEnum;
import lombok.Getter;
/**
 * @author kk
 * @description 自定义异常
 * @date 2025-11-20 08:41:01
 */
public class ForumException extends RuntimeException {
    @Getter
    private Status status;
    public ForumException(Status status){
        this.status = status;
    }
    public ForumException(int code,String msg){
        this.status.setCode(code);
        this.status.setMsg(msg);
    }
    public ForumException(StatusEnum statusEnum,Object... args){
        this.status = Status.newStatus(statusEnum,args);
    }

}
