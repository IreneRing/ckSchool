package ck.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ck.bean.Achievements;
import ck.bean.AchievementsEx;

/**
 * 成果功能
 */
public interface AchievementsService {
	//查找所有
	List<AchievementsEx> findAllAchievements();
	//首页展示数目
	List<AchievementsEx> findInAchievements();
	//id查找
	AchievementsEx findAchievementsExById(@Param("aid") int aid);
	//添加
	int addAchievementsEx(Achievements ach);
	//修改
	int updAchievementsEx(Achievements ach);
	//删除
	int delAchievementsEx(@Param("aid") int aid);
	//批量删除
	int delAllAchievements(List aid);
	//按分类查询
	List<AchievementsEx> findAchievementsExByTid(@Param("tid") int tid);
	//按日期查询
	List<AchievementsEx> findAchievementsExByDate(@Param("adate") String adate);
}
