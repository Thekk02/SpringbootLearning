package com.kk.springadvance.context;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.kk.springadvance.dto.UserDTO;
import lombok.Data;

import java.security.Principal;

/**
 * @author kk
 * @description 请求信息上下文具体实现
 * @date 2025-11-20 08:22:32
 */
public class ReqInfoContext {
    private static TransmittableThreadLocal<ReqInfo> contexts = new TransmittableThreadLocal<>();

    public static void addReqInfo(ReqInfo reqInfo) {
        contexts.set(reqInfo);
    }

    public static void clear() {
        contexts.remove();
    }

    public static ReqInfo getReqInfo() {
        return contexts.get();
    }

    @Data
    private static class ReqInfo implements Principal {

        /**
         * 访问路径
         */
        private String path;

        /**
         * post 表单参数
         */
        private String payload;
        /**
         * 登录的会话
         */
        private String session;

        /**
         * 用户id
         */
        private Long userId;
        /**
         * 用户信息
         */
        private UserDTO user;
        /**
         * 消息数量
         */
        private Integer msgNum;



        @Override
        public String getName() {
            return session;
        }
    }
}
