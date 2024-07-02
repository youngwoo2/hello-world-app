package com.sh.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/")
    @ResponseBody // 리턴한 객체를 바로 응답메세지에 써주세요
    public String index() {
        return "Welcome to Hello World Application ✨ : version " + appVersion;
    }
}
