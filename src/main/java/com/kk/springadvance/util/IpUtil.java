package com.kk.springadvance.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @author kk
 * @description IP工具类
 * @date 2025-11-20 09:15:25
 */
public class IpUtil {
    public static String getIp(HttpServletRequest request){
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unkonwn".equalsIgnoreCase(ip)){
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unkonwn".equalsIgnoreCase(ip)){
            ip = request.getHeader("WL-Proxy-Client_IP");
        }
        if(ip == null || ip.length() == 0 || "unkonwn".equalsIgnoreCase(ip)){
            ip = request.getHeader("HTTTP-Client_IP");
        }
        if(ip == null || ip.length() == 0 || "unkonwn".equalsIgnoreCase(ip)){
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if(ip == null || ip.length() == 0 || "unkonwn".equalsIgnoreCase(ip)){
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
