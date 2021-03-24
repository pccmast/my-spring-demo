package com.example.springboot.dao;

import com.example.springboot.entity.RankItem;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RankDao {
    @Autowired
    private SqlSession sqlSession;

    public List<RankItem> doRank() {
        List<RankItem> rankItemResult = new ArrayList<>();
        return sqlSession.selectList("MyMapper.selectRank");
    }
}
