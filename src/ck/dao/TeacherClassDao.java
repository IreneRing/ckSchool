package ck.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ck.bean.TeacherClass;

/**
 * teacher操作类
 */
public interface TeacherClassDao {
	//查询所有分类
	List<TeacherClass> findAllTeacherClass();
	//查询所有分类和教师
	List<TeacherClass> findAllTeacherClassAndTeacher();
	//查询分类
	TeacherClass findTeacherClassById(int tcid);
	//添加
	int addTeacherClass(TeacherClass teaClass);
	//修改
	int updTeacherClass(TeacherClass teaClass);
	//删除
	int delTeacherClass(@Param("tcid") int tcid);
	//批量删除
	int delAllTeacherClass(List tcid);
	//驗證是否重名
	TeacherClass findTeacherClassByName(String tcclass);
}
