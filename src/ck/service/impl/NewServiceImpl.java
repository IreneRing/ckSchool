package ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ck.bean.News;
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

	@Override
	public NewsEx findNewsExById(int nid) {
		// TODO Auto-generated method stub
		return newDao.findNewsExById(nid);
	}

	@Override
	public int addNewsEx(News news) {
		// TODO Auto-generated method stub
		return newDao.addNewsEx(news);
	}

	@Override
	public int updNewsEx(News news) {
		// TODO Auto-generated method stub
		return newDao.updNewsEx(news);
	}

	@Override
	public int delNewsEx(int nid) {
		// TODO Auto-generated method stub
		return newDao.delNewsEx(nid);
	}

	@Override
	public int delAllNews(List nid) {
		// TODO Auto-generated method stub
		return newDao.delAllNews(nid);
	}

	@Override
	public List<NewsEx> findNewsExByClass(int ncid) {
		// TODO Auto-generated method stub
		return newDao.findNewsExByClass(ncid);
	}

	@Override
	public List<NewsEx> findNewsExByDate(String ndate) {
		// TODO Auto-generated method stub
		return newDao.findNewsExByDate(ndate);
	}

}
