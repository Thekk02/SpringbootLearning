package com.kk.springadvance.Interceptor;

import com.kk.springadvance.util.IpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description ip地址拦截器
 * @date 2025-11-20 09:31:54
 */
@Component
@Slf4j
public class IpAccessInterceptor implements HandlerInterceptor {

    private Set<String> blackIpList = new HashSet<>();

    private Set<String> whiteIpList;

    private final static String LOCAL = "127.0.0.1";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("拦截器启动");
        IpUtil ipUtil = new IpUtil();
        String ip = ipUtil.getIp(request);
        if(blackIpList.contains(ip) || ip.equals(LOCAL)){
            return false;
        }
        return true;
    }





}
