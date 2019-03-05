package ck.service;
/**
 * 教育功能
 */
import java.util.List;

import ck.bean.EducationEx;

public interface EducationService {
	//查找所有
	List<EducationEx> findAllEducation();
	//首页展示数目
	List<EducationEx> findInEducation();
}
