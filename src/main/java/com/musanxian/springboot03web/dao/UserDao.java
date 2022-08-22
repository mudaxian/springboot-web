package com.musanxian.springboot03web.dao;

import com.musanxian.springboot03web.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    //查询密码
    User getUser(String username);
}
