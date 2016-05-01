package com.wb.timeline.dao;

import java.lang.annotation.Documented;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.wb.timeline.domain.User;

@Component
public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}

