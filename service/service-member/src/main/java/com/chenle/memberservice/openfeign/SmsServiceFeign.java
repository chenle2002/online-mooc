package com.chenle.memberservice.openfeign;


import com.chenle.common.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient("service-sms")
public interface SmsServiceFeign {
    @RequestMapping( "/sms/mailsendCode")
    public R mailsendCode(@RequestParam("mail") String mail, @RequestParam("codeNum") String codeNum);

    @RequestMapping(value = "/sms/smssendCode")
    public R smssendCode(@RequestParam("phone") String phone, @RequestParam("codeNum") String codeNum);
}
