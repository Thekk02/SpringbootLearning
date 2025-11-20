package com.kk.springadvance.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;

/**
 * @author kk
 * @description 邮件工具类
 * @date 2025-11-20 15:01:41
 */
@Slf4j
public class EmailUtil {
    private static volatile String from;

    public static String getFrom() {
        if (from == null) {
            synchronized (EmailUtil.class) {
                if (from == null) {
                    from = SpringUtil.getConfig("spring.mail.from", "xhhuiblog@163.com");
                }
            }
        }
        return from;
    }

    /**
     * Springboot-email封装的发送邮件
     */
    public static boolean sendMail(String title,String to,String content){
        try{
            JavaMailSender javaMailSender = SpringUtil.getBean(JavaMailSender.class);
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
            mimeMessageHelper.setFrom(getFrom());
            mimeMessageHelper.setTo(to);
            mimeMessageHelper.setSubject(title);
            mimeMessageHelper.setText(content,true);

            // 解决 JavaMailSender no object DCH for MIME type multipart/mixed 问题
            Thread.currentThread().setContextClassLoader(EmailUtil.class.getClassLoader());
            javaMailSender.send(mimeMessage);
            return true;
        }catch (Exception e){
            log.warn("sendEmail error {}@{} ",title,to,e);
            return false;
        }

    }
}
