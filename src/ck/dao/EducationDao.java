package ck.dao;

import java.util.List;

import ck.bean.EducationEx;

/**
 * 教育操作类
 */
public interface EducationDao {
	//查找所有
	List<EducationEx> findAllEducation();
	//首页展示数目
	List<EducationEx> findInEducation();
}
