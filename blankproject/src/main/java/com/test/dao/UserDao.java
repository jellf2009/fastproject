package com.test.dao;

import com.test.pojo.User;

public interface UserDao {
    User findById(Long id);
}
