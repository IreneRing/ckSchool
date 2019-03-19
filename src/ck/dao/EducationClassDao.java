package ck.dao;

import java.util.List;

import ck.bean.EducationClass;
/**
 * 教育分类操作类
 */
public interface EducationClassDao {
	//查询所有
	List<EducationClass> findEducationClassAndEducation();
	//查询所有分类
	List<EducationClass> findAllEducationClass();
}
