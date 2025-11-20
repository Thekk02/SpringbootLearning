package com.kk.springadvance.exception;

import com.kk.springadvance.common.Status;
import com.kk.springadvance.enums.StatusEnum;
import lombok.Getter;

/**
 * @author kk
 * @description 业务通知异常
 * @date 2025-11-20 08:45:56
 */
public class ForumAdviceException extends RuntimeException{
    @Getter
    private Status status;

    public ForumAdviceException(Status status){
        this.status = status;
    }
    public ForumAdviceException(int code,String msg){
        this.status.setCode(code);
        this.status.setMsg(msg);
    }
    public ForumAdviceException(StatusEnum statusEnum,Object... args){
        this.status = Status.newStatus(statusEnum,args);
    }
}
