package ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ck.bean.Res;
import ck.bean.ResEx;
import ck.dao.ResDao;
import ck.service.ResService;
@Service("ResService")
public class ResServiceImpl implements ResService{
	//dao层对象
	@Autowired
	private ResDao resDao;
	//按種類查找資源
	@Override
	public List<ResEx> findResBySort(int rcid) {
		// TODO Auto-generated method stub
		return resDao.findResBySort(rcid);
	}
	//查出所有
	@Override
	public List<ResEx> findAllRes() {
		// TODO Auto-generated method stub
		return resDao.findAllRes();
	}
	@Override
	public ResEx findResExById(int rid) {
		// TODO Auto-generated method stub
		return resDao.findResExById(rid);
	}
	@Override
	public int addResEx(Res res) {
		// TODO Auto-generated method stub
		return resDao.addResEx(res);
	}
	@Override
	public int updResEx(Res res) {
		// TODO Auto-generated method stub
		return resDao.updResEx(res);
	}
	@Override
	public int delResEx(int rid) {
		// TODO Auto-generated method stub
		return resDao.delResEx(rid);
	}
	@Override
	public int delAllRes(List rid) {
		// TODO Auto-generated method stub
		return resDao.delAllRes(rid);
	}
	@Override
	public List<ResEx> findResExByClass(int rcid) {
		// TODO Auto-generated method stub
		return resDao.findResExByClass(rcid);
	}
	@Override
	public List<ResEx> findResExByDate(String rdate) {
		// TODO Auto-generated method stub
		return resDao.findResExByDate(rdate);
	}

}
