package com.kk.springadvance.service.Imp;

import com.kk.springadvance.util.EmailUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author kk
 * @description 邮件发送服务类
 * @date 2025-11-20 15:55:58
 */
@Service
@Slf4j
public class EmailSendService {

    /**
     * TODO:未完成，应该实现定时发送邮件判定人员在线人数
     */
    //定时为每天八点执行
    @Scheduled(cron = "0 0 8 * * ?")
    public static void sendNumberOfPeople(){
        EmailUtil.sendMail("在线人数提醒","13203208733@163.com","目前在线人数为：");

    }

}
