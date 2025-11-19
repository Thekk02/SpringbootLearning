package com.kk.springadvance.common;

import com.kk.springadvance.enums.StatusEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @author kk
 * @description 结果返回类
 * @date 2025-11-19 10:14:22
 */
@Data
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private Status status;

    private T result;
    public Result(){}

    public Result(Status status){
        this.status = status;
    }
    public Result(T t){
        status = Status.newStatus(StatusEnum.SUCESS);
        this.result = t;
    }
    public static <T> Result<T> ok(T t){
        return new Result<>(t);
    }
    private static final String OK_DEFAULT_MESSAGE = "ok";

    public static Result<String> ok(){
        return ok(OK_DEFAULT_MESSAGE);
    }
    public static <T> Result<T> fail(StatusEnum status,Object... args){
        return new Result<>(Status.newStatus(status,args));
    }
    public static <T> Result<T> fail(Status status) {
        return new Result<>(status);
    }
}
