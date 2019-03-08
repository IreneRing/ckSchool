package ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ck.bean.TeacherClass;
import ck.dao.TeacherClassDao;
import ck.service.TeacherClassService;
@Service("TeacherServiceClass")
public class TeacherClassServiceImpl implements TeacherClassService {
	//dao层对象
	@Autowired
	private TeacherClassDao teacherClassDao;
	//查询所有分类
	@Override
	public List<TeacherClass> findAllTeacherClass() {
		// TODO Auto-generated method stub
		return teacherClassDao.findAllTeacherClass();
	}
	
}
