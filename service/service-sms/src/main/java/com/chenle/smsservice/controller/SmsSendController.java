package com.chenle.smsservice.controller;


import com.chenle.common.util.R;
import com.chenle.smsservice.component.QQMailComponent;
import com.chenle.smsservice.component.SmsComponent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/sms")
public class SmsSendController {

    @Resource
    private QQMailComponent qqMailComponent;

    @Resource
    private SmsComponent smsComponent;


    @GetMapping(value = "/mailsendCode")
    public R mailsendCode(@RequestParam("mail") String mail, @RequestParam("codeNum") String codeNum) {

        qqMailComponent.sendSimpleMail(mail,codeNum);
        return R.ok();
    }


    @GetMapping(value = "/smssendCode")
    public R smssendCode(@RequestParam("phone") String phone, @RequestParam("codeNum") String codeNum) {

        //发送验证码
        smsComponent.sendCode(phone,codeNum);

        return R.ok();
    }
}
