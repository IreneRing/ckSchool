package ck.service;

import java.util.List;

import ck.bean.TeacherClass;

/**
 * TeacherClass功能
 */
public interface TeacherClassService {
	//查询所有分类
	List<TeacherClass> findAllTeacherClass();
}
