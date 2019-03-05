package ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ck.bean.TeacherEx;
import ck.dao.TeacherDao;
import ck.service.TeacherService;
@Service("TeacherService")
public class TeacherServiceImpl implements TeacherService{
	//dao层对象
	@Autowired
	private TeacherDao teacherDao;
	
	@Override
	public List<TeacherEx> findAllTeacher() {
		return teacherDao.findAllTeacher();
	}

	@Override
	public List<TeacherEx> findInTeacher() {
		// TODO Auto-generated method stub
		return teacherDao.findInTeacher();
	}

}
