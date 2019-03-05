package ck.dao;

import java.util.List;

import ck.bean.TeacherEx;

/**
 * teacher操作类
 */
public interface TeacherDao {
	//查找所有
	List<TeacherEx> findAllTeacher();
	//首页展示数目
	List<TeacherEx> findInTeacher();
}
