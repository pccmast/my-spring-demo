package com.example.springboot.dao;

import com.example.springboot.entity.RankItem;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankDao {
    @Autowired
    private SqlSession sqlSession;

    public List<RankItem> doRank() {
        return sqlSession.selectList("MyMapper.selectRank");
    }
}
