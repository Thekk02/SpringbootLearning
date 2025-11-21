package com.kk.springadvance.enums.event;

import com.kk.springadvance.enums.UserStateEventEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Service;

/**
 * @author kk
 * @description 用户状态变更事件
 * @date 2025-11-21 11:26:54
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class UserStateEvent<T> extends ApplicationEvent {
    private T content;
    private UserStateEventEnum userStateEventEnum;
    public UserStateEvent(Object source, UserStateEventEnum userStateEventEnum,T content){
        super(source);
        this.userStateEventEnum = userStateEventEnum;
        this.content = content;
    }
}
