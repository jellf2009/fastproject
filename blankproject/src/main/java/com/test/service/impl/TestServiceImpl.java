package com.test.service.impl;

import com.test.dao.UserDao;
import com.test.pojo.User;
import com.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UserDao userDao;

    public User findUserById(Long id) {
        User user = null;
        if (id != null && id > 0) {
            user = userDao.findById(id);
        }
        return user;
    }
}
