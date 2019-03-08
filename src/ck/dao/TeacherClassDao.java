package ck.dao;

import java.util.List;

import ck.bean.TeacherClass;

/**
 * teacher操作类
 */
public interface TeacherClassDao {
	//查询所有分类
	List<TeacherClass> findAllTeacherClass();
	//查询所有分类和教师
	List<TeacherClass> findAllTeacherClassAndTeacher();
}
