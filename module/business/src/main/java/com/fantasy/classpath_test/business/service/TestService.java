package com.fantasy.classpath_test.business.service;


import com.fantasy.classpath_test.business.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    TestDao testDao;


    public Integer select() {
        return testDao.select();
    }

}
