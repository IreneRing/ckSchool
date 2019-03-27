package ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ck.bean.ResClass;
import ck.dao.ResClassDao;
import ck.service.ResClassService;
@Service("ResClassService")
public class ResClassServiceImpl implements ResClassService {
	//dao层对象
	@Autowired
	private ResClassDao resClassDao;
	//查询分类中的资源
	@Override
	public List<ResClass> findResClassAndRes() {
		// TODO Auto-generated method stub
		return resClassDao.findResClassAndRes();
	}
	@Override
	public List<ResClass> findAllResClass() {
		// TODO Auto-generated method stub
		return resClassDao.findAllResClass();
	}
	@Override
	public ResClass findResClassById(int rcid) {
		// TODO Auto-generated method stub
		return resClassDao.findResClassById(rcid);
	}
	@Override
	public int addResClass(ResClass resClass) {
		// TODO Auto-generated method stub
		return resClassDao.addResClass(resClass);
	}
	@Override
	public int updResClass(ResClass resClass) {
		// TODO Auto-generated method stub
		return resClassDao.updResClass(resClass);
	}
	@Override
	public int delResClass(int rcid) {
		// TODO Auto-generated method stub
		return resClassDao.delResClass(rcid);
	}
	@Override
	public int delAllResClass(List rcid) {
		// TODO Auto-generated method stub
		return resClassDao.delAllResClass(rcid);
	}
	@Override
	public ResClass findResClassByName(String rcclass) {
		// TODO Auto-generated method stub
		return resClassDao.findResClassByName(rcclass);
	}

}
