package ck.service;
/**
 * Teacher功能
 */
import java.util.List;

import org.apache.ibatis.annotations.Param;

import ck.bean.Teacher;
import ck.bean.TeacherEx;

public interface TeacherService {
	//查找所有
	List<TeacherEx> findAllTeacher();
	//首页展示数目
	List<TeacherEx> findInTeacher();
	//id查找
	TeacherEx findTeacherExById(@Param("tid") int tid);
	//添加
	int addTeacherEx(Teacher tea);
	//修改
	int updTeacherEx(Teacher tea);
	//删除
	int delTeacherEx(@Param("tid") int tid);
	//批量删除
	int delAllTeacher(List tid);
	//按分类查询
	List<TeacherEx> findTeacherExByClass(@Param("tcid") int tcid);
	//按日期查询
	List<TeacherEx> findTeacherExByDate(@Param("tdate") String tdate);
}
