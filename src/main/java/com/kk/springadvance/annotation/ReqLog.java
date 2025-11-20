package com.kk.springadvance.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author kk
 * @description 请求日志注解类
 * @date 2025-11-20 08:59:42
 */
@Target({ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ReqLog {
    String title() default "";
    String content() default "";
    String parameters() default "";
}
