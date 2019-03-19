package ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ck.bean.Education;
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

	@Override
	public EducationEx findEducationExById(int eid) {
		// TODO Auto-generated method stub
		return educationDao.findEducationExById(eid);
	}

	@Override
	public int addEducationEx(Education edu) {
		// TODO Auto-generated method stub
		return educationDao.addEducationEx(edu);
	}

	@Override
	public int updEducationEx(Education edu) {
		// TODO Auto-generated method stub
		return educationDao.updEducationEx(edu);
	}

	@Override
	public int delEducationEx(int eid) {
		// TODO Auto-generated method stub
		return educationDao.delEducationEx(eid);
	}
	
	@Override
	public int delAllEducation(List eid) {
		return educationDao.delAllEducation(eid);
	}

	@Override
	public List<EducationEx> findEducationExByClass(int ecid) {
		// TODO Auto-generated method stub
		return educationDao.findEducationExByClass(ecid);
	}

	@Override
	public List<EducationEx> findEducationExByDate(String edate) {
		// TODO Auto-generated method stub
		return educationDao.findEducationExByDate(edate);
	}
	
}
