package com.example.springboot.service;

import com.example.springboot.dao.RankDao;
import com.example.springboot.dao.UserMapper;
import com.example.springboot.entity.RankItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    RankDao rankDao;

    public List<RankItem> doService() {
        return rankDao.doRank();
    }
}
