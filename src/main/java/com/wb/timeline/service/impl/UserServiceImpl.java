package com.wb.timeline.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wb.timeline.dao.IUserDao;
import com.wb.timeline.domain.User;
import com.wb.timeline.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{

	@Resource
	private IUserDao userDao;
	
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}
