package com.musanxian.springboot03web.service;


import com.musanxian.springboot03web.dao.UserDao;
import com.musanxian.springboot03web.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public User getUser(String username) {
        return userDao.getUser(username);
    }
}
