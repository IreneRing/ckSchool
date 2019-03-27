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
	@Override
	public List<TeacherClass> findAllTeacherClassAndTeacher() {
		// TODO Auto-generated method stub
		return teacherClassDao.findAllTeacherClassAndTeacher();
	}
	@Override
	public TeacherClass findTeacherClassById(int tcid) {
		// TODO Auto-generated method stub
		return teacherClassDao.findTeacherClassById(tcid);
	}
	@Override
	public int addTeacherClass(TeacherClass teaClass) {
		// TODO Auto-generated method stub
		return teacherClassDao.addTeacherClass(teaClass);
	}
	@Override
	public int updTeacherClass(TeacherClass teaClass) {
		// TODO Auto-generated method stub
		return teacherClassDao.updTeacherClass(teaClass);
	}
	@Override
	public int delTeacherClass(int tcid) {
		// TODO Auto-generated method stub
		return teacherClassDao.delTeacherClass(tcid);
	}
	@Override
	public int delAllTeacherClass(List tcid) {
		// TODO Auto-generated method stub
		return teacherClassDao.delAllTeacherClass(tcid);
	}
	@Override
	public TeacherClass findTeacherClassByName(String tcclass) {
		// TODO Auto-generated method stub
		return teacherClassDao.findTeacherClassByName(tcclass);
	}
	
}
