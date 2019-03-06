package ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
