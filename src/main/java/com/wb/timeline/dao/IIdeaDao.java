package com.wb.timeline.dao;

import org.springframework.stereotype.Component;

import com.wb.timeline.domain.Idea;

@Component
public interface IIdeaDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Idea idea);

    int insertSelective(Idea idea);

    Idea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Idea idea);

    int updateByPrimaryKey(Idea idea);
}

