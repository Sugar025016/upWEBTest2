package com.example.upwebtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//繼承SpringBootServletInitializer
public class UpWebTestApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(UpWebTestApplication.class, args);
    }

    //重寫一個父類中的方法configure(),執行初始化的項目啟動類(UpWebTestApplication)
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(UpWebTestApplication.class);
    }
}
