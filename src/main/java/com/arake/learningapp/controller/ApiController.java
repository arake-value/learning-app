package com.arake.learningapp.controller;

import com.arake.learningapp.service.ApiService;
import com.arake.learningapp.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class ApiController {

    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);
    private final ApiService as;

    @GetMapping("get")
    public ResponseEntity<UserEntity> getUser(@RequestParam String id){

        logger.debug("パラメーター: {}", id);
        UserEntity user = as.getUser(id);
        logger.debug("戻り値: {}", user);
        return ResponseEntity.ok(user);

    }



}
