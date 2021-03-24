package com.example.springboot.service;

import com.example.springboot.dao.RankDao;
import com.example.springboot.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    RankDao rankDao;

    public void doService() {

    }
}
