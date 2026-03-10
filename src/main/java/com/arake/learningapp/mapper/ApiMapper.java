package com.arake.learningapp.mapper;

import com.arake.learningapp.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ApiMapper {

    @Select("""
SELECT *
FROM users
WHERE id=#{id}
""")
    UserEntity getUser(String id);

}
