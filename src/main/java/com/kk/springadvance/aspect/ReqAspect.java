package com.kk.springadvance.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author kk
 * @description 请求切面
 * @date 2025-11-20 09:02:19
 */
@Component
@Aspect
public class ReqAspect {
    ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("@annotation(com.kk.springadvance.annotation.ReqLog)")
    public void ReqPointcut(){
    }

    @Around("ReqPointcut()")
    public Object Handle(ProceedingJoinPoint joinPoint) throws Throwable{
        return null;
    }
}
