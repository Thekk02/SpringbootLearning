package com.kk.springadvance.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author kk
 * @description Spring工具类
 * @date 2025-11-20 15:28:35
 */
@Component
public class SpringUtil implements ApplicationContextAware, EnvironmentAware {
    private volatile static ApplicationContext context;

    private volatile static Environment environment;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringUtil.context = context;
    }

    @Override
    public void setEnvironment(Environment environment) {
        SpringUtil.environment = environment;
    }

    public static ApplicationContext getContext(){
        return context;
    }

    /**
     * 获取配置
     */
    public static String getConfig(String key,String val){
        return environment.getProperty(key,val);
    }

    public static Object getBean(String beanName){
        return context.getBean(beanName);
    }
    public static <T> T getBean(Class<T> bean){
        if(context != null){
            return context.getBean(bean);
        }else{
            throw new IllegalStateException("Spring ApplicationContext is not active or has been closed");
        }
    }


}
