package com.green.azuredemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 모든 엔드포인트에 대해 적용
            .allowedOrigins("http://localhost:5173") // 허용할 프론트엔드 주소
            .allowedMethods("GET", "POST", "PUT", "DELETE") // 허용할 HTTP 메서드
            .allowedHeaders("*") // 모든 헤더 허용
            .allowCredentials(true); // 쿠키/인증 정보 허용 여부
    }
}