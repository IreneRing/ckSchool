package ck.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ck.bean.EducationClass;

/**
 * 教育分类功能
 */
public interface EducationClassService {
	//查询所有
	List<EducationClass> findEducationClassAndEducation();
	//查询所有分类
	List<EducationClass> findAllEducationClass();
	//查询分类
	EducationClass findEducationClassById(int ecid);
	//添加
	int addEducationClass(EducationClass eduClass);
	//修改
	int updEducationClass(EducationClass eduClass);
	//删除
	int delEducationClass(@Param("ecid") int ecid);
	//批量删除
	int delAllEducationClass(List ecid);
	//驗證是否重名
	EducationClass findEducationClassByName(String ecclass);
}
