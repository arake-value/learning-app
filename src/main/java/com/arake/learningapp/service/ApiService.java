package com.arake.learningapp.service;


import com.arake.learningapp.mapper.ApiMapper;
import com.arake.learningapp.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApiService {


    private final ApiMapper am;

    //idが無かたらnullが返る
    public UserEntity getUser(String id){
        System.out.println(am.getUser(id));
        return am.getUser(id);
    }

}
