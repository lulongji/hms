package com.hms.service.impl;

import com.hms.dao.UserDao;
import com.hms.model.User;
import com.hms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;


    @Override
    public User get(User user) throws Exception {
        return userDao.get(user);
    }
}
