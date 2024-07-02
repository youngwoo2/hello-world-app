package com.sh.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class AppController {

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/")
    @ResponseBody // 리턴한 객체를 바로 응답메세지에 써주세요
    public String index() {
        log.info("GET / : appVersion = {}", appVersion);
        return """
            <h1>🎃Welcome to Hello World Application🎃</h1>
            <h4>version %s</h4>
            """.formatted(appVersion);
    }
}
