package ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ck.bean.Teacher;
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

	@Override
	public TeacherEx findTeacherExById(int tid) {
		// TODO Auto-generated method stub
		return teacherDao.findTeacherExById(tid);
	}

	@Override
	public int addTeacherEx(Teacher tea) {
		// TODO Auto-generated method stub
		return teacherDao.addTeacherEx(tea);
	}

	@Override
	public int updTeacherEx(Teacher tea) {
		// TODO Auto-generated method stub
		return teacherDao.updTeacherEx(tea);
	}

	@Override
	public int delTeacherEx(int tid) {
		// TODO Auto-generated method stub
		return teacherDao.delTeacherEx(tid);
	}

	@Override
	public int delAllTeacher(List tid) {
		// TODO Auto-generated method stub
		return teacherDao.delAllTeacher(tid);
	}

	@Override
	public List<TeacherEx> findTeacherExByClass(int tcid) {
		// TODO Auto-generated method stub
		return teacherDao.findTeacherExByClass(tcid);
	}

	@Override
	public List<TeacherEx> findTeacherExByDate(String tdate) {
		// TODO Auto-generated method stub
		return teacherDao.findTeacherExByDate(tdate);
	}

}
