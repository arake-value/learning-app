package com.arake.learningapp.service;


import com.arake.learningapp.mapper.ApiMapper;
import com.arake.learningapp.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApiService {

    private static final Logger logger = LoggerFactory.getLogger(ApiService.class);
    private final ApiMapper am;

    //idが無かたらnullが返る
    public UserEntity getUser(String id){
        logger.debug("id: {}", id);
        return am.getUser(id);
    }

}
