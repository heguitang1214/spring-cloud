package com.tang.microservice.provider.service;

import com.tang.microservice.provider.dao.UserDao;
import com.tang.microservice.provider.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User findUser(Long id){
        return userDao.findOne(id);
    }
}
