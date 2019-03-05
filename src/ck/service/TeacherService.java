package ck.service;
/**
 * Teacher功能
 */
import java.util.List;

import ck.bean.TeacherEx;

public interface TeacherService {
	//查找所有
	List<TeacherEx> findAllTeacher();
	//首页展示数目
	List<TeacherEx> findInTeacher();
}
