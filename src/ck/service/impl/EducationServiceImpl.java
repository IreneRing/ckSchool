package ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ck.bean.EducationEx;
import ck.dao.EducationDao;
import ck.service.EducationService;
@Service("EducationService")
public class EducationServiceImpl implements EducationService{
	//dao层对象
	@Autowired
	private EducationDao educationDao;
	@Override
	public List<EducationEx> findAllEducation() {
		// TODO Auto-generated method stub
		return educationDao.findAllEducation();
	}

	@Override
	public List<EducationEx> findInEducation() {
		// TODO Auto-generated method stub
		return educationDao.findInEducation();
	}
	
}
