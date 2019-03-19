package ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ck.bean.EducationClass;
import ck.dao.EducationClassDao;
import ck.service.EducationClassService;
@Service("EducationClassService")
public class EducationClassServiceImpl implements EducationClassService {
	//dao层对象
	@Autowired
	private EducationClassDao educationClassDao;
	@Override
	public List<EducationClass> findEducationClassAndEducation() {
		// TODO Auto-generated method stub
		return educationClassDao.findEducationClassAndEducation();
	}
	@Override
	public List<EducationClass> findAllEducationClass() {
		// TODO Auto-generated method stub
		return educationClassDao.findAllEducationClass();
	}
	
}
