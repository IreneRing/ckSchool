package ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ck.bean.NewsClass;
import ck.dao.NewClassDao;
import ck.service.NewClassService;
@Service("NewClassService")
public class NewClassServiceImpl implements NewClassService {
	
	//dao层对象
	@Autowired
	private NewClassDao newClassDao;

	@Override
	public List<NewsClass> findNewsClassAndNew() {
		// TODO Auto-generated method stub
		return newClassDao.findNewsClassAndNew();
	}

	@Override
	public List<NewsClass> findAllNewClass() {
		// TODO Auto-generated method stub
		return newClassDao.findAllNewClass();
	}

	@Override
	public NewsClass findNewClassById(int ncid) {
		// TODO Auto-generated method stub
		return newClassDao.findNewClassById(ncid);
	}

	@Override
	public int addNewClass(NewsClass newsClass) {
		// TODO Auto-generated method stub
		return newClassDao.addNewClass(newsClass);
	}

	@Override
	public int updNewClass(NewsClass newsClass) {
		// TODO Auto-generated method stub
		return newClassDao.updNewClass(newsClass);
	}

	@Override
	public int delNewClass(int ncid) {
		// TODO Auto-generated method stub
		return newClassDao.delNewClass(ncid);
	}

	@Override
	public int delAllNewClass(List ncid) {
		// TODO Auto-generated method stub
		return newClassDao.delAllNewClass(ncid);
	}

	@Override
	public NewsClass findNewClassByName(String ncclass) {
		// TODO Auto-generated method stub
		return newClassDao.findNewClassByName(ncclass);
	}

	

}
