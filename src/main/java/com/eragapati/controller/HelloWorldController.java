package com.eragapati.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eragapati.repository.UserInfoRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class HelloWorldController {


    private final UserInfoRepository userInfoRepository;

    @GetMapping("api/hello")
    public String sayHello(){

        log.info(String.valueOf(userInfoRepository.count()));
        
        return "Hello Worlds";
    }

}
