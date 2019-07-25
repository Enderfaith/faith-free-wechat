package com.faith.wechat.message;

import com.faith.wechat.commons.listener.ApplicationListenerReady;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WechatMessageApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(WechatMessageApplication.class);
        springApplication.addListeners(new ApplicationListenerReady());
        springApplication.run(args);

    }
}
