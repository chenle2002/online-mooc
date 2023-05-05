package com.chenle.smsservice.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Random;

@Component
public class QQMailComponent {

    @Resource
    private JavaMailSender javaMailSender;

    //读取yml文件中username的值并赋值给form
    @Value("${spring.mail.username}")
    private String from;

    public String sendSimpleMail(String mail,String coderece) {
        // 构建一个邮件对象
        SimpleMailMessage message = new SimpleMailMessage();
        // 设置邮件发送者
        message.setFrom(from);
        // 设置邮件接收者
        message.setTo(mail);
        // 设置邮件的主题
        message.setSubject("登录验证码");
        // 设置邮件的正文
        Random random = new Random();
        StringBuilder code = new StringBuilder();

        code= new StringBuilder(coderece);
        String text = "邮箱号："+mail+",您的验证码为：" + code + ",请勿泄露给他人。";
        message.setText(text);
        // 发送邮件
        try {
            javaMailSender.send(message);
            return "发送成功";
        } catch (MailException e) {
            e.printStackTrace();
        }
        return "发送失败";
    }
}
