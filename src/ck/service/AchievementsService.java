package ck.service;

import java.util.List;

import ck.bean.AchievementsEx;

/**
 * 成果功能
 */
public interface AchievementsService {
	//查找所有
	List<AchievementsEx> findAllAchievements();
	//首页展示数目
	List<AchievementsEx> findInAchievements();
}
