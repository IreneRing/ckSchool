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
	@Override
	public int addEducationClass(EducationClass eduClass) {
		// TODO Auto-generated method stub
		return educationClassDao.addEducationClass(eduClass);
	}
	@Override
	public int updEducationClass(EducationClass eduClass) {
		// TODO Auto-generated method stub
		return educationClassDao.updEducationClass(eduClass);
	}
	@Override
	public int delEducationClass(int ecid) {
		// TODO Auto-generated method stub
		return educationClassDao.delEducationClass(ecid);
	}
	@Override
	public int delAllEducationClass(List ecid) {
		// TODO Auto-generated method stub
		return educationClassDao.delAllEducationClass(ecid);
	}
	@Override
	public EducationClass findEducationClassByName(String ecclass) {
		// TODO Auto-generated method stub
		return educationClassDao.findEducationClassByName(ecclass);
	}
	@Override
	public EducationClass findEducationClassById(int ecid) {
		// TODO Auto-generated method stub
		return educationClassDao.findEducationClassById(ecid);
	}
	
}
