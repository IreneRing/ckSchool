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

}
