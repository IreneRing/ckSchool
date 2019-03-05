package ck.dao;

import java.util.List;

import ck.bean.AchievementsEx;

/**
 * 成果操作类
 */
public interface AchievementsDao {
	//查找所有
	List<AchievementsEx> findAllAchievements();
	//首页展示数目
	List<AchievementsEx> findInAchievements();
}
