package ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ck.bean.NewsEx;
import ck.dao.NewDao;
import ck.service.NewService;
@Service("NewService")
public class NewServiceImpl implements NewService{
	//dao层对象
	@Autowired
	private NewDao newDao;
	@Override
	public List<NewsEx> findAllNew() {
		// TODO Auto-generated method stub
		return newDao.findAllNew();
	}

	@Override
	public List<NewsEx> findInNew() {
		// TODO Auto-generated method stub
		return newDao.findInNew();
	}

}
