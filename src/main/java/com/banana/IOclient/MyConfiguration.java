package com.banana.IOclient;

import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.*;
import org.springframework.http.converter.*;

@Configuration
public class MyConfiguration {

    @Bean
    public HttpMessageConverters customConverters() {
//        HttpMessageConverter<?> additional = ...
//        HttpMessageConverter<?> another = ...
        return new HttpMessageConverters();
    }
}
