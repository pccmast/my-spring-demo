package com.example.springboot.dao;

import com.example.springboot.entity.RankItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RankDao {
    public List<RankItem> doRank() {
        List<RankItem> rankItemResult = new ArrayList<>();
        return rankItemResult;
    }
}
