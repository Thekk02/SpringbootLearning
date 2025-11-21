package com.kk.springadvance.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

/**
 * @author kk
 * @description 用户密码解码器
 * @date 2025-11-21 15:15:56
 */
@Component
public class UserPwdEncoder {

    @Value("${security.salt}")
    private String salt;

    @Value("${security.salt_index}")
    private Integer saltIndex;


    private String encPwd(String pwd){
        if(pwd.length() > saltIndex){
            pwd = pwd.substring(0,saltIndex) + salt + pwd.substring(saltIndex);
        }else{
            pwd = pwd + salt;
        }
        return DigestUtils.md5DigestAsHex(pwd.getBytes(StandardCharsets.UTF_8));
    }
}
