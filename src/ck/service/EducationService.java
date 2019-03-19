package ck.service;
/**
 * 教育功能
 */
import java.util.List;

import org.apache.ibatis.annotations.Param;

import ck.bean.Education;
import ck.bean.EducationEx;

public interface EducationService {
	//查找所有
	List<EducationEx> findAllEducation();
	//首页展示数目
	List<EducationEx> findInEducation();
	//id查找
	EducationEx findEducationExById(int eid);
	//添加
	int addEducationEx(Education edu);
	//修改
	int updEducationEx(Education edu);
	//删除
	int delEducationEx(@Param("eid") int eid);
	//批量删除
	int delAllEducation(List eid);
	//按分类查询
	List<EducationEx> findEducationExByClass(@Param("ecid") int ecid);
	//按日期查询
	List<EducationEx> findEducationExByDate(@Param("edate") String edate);
}
