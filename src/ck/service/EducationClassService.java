package ck.service;

import java.util.List;

import ck.bean.EducationClass;

/**
 * 教育分类功能
 */
public interface EducationClassService {
	//查询所有
	List<EducationClass> findEducationClassAndEducation();
	//查询所有分类
	List<EducationClass> findAllEducationClass();
}
