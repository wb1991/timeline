package com.wb.timeline.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wb.timeline.dao.IIdeaDao;
import com.wb.timeline.domain.Idea;
import com.wb.timeline.service.IIdeaService;

@Service("ideaService")
public class IdeaServiceImpl implements IIdeaService{

	@Resource
	private IIdeaDao ideaDao;
	
	public Idea getIdeaById(int ideaId) {
		return this.ideaDao.selectByPrimaryKey(ideaId);
	}

}
