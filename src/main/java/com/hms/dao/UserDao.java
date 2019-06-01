package com.hms.dao;

import com.hms.model.User;

public interface UserDao {

    User get(User user) throws Exception;
}
