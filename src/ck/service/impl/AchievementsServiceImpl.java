package ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ck.bean.AchievementsEx;
import ck.dao.AchievementsDao;
import ck.service.AchievementsService;
@Service("AchievementsService")
public class AchievementsServiceImpl implements AchievementsService{
	//dao层对象
	@Autowired
	private AchievementsDao achievementsDao;
	@Override
	public List<AchievementsEx> findAllAchievements() {
		// TODO Auto-generated method stub
		return achievementsDao.findAllAchievements();
	}

	@Override
	public List<AchievementsEx> findInAchievements() {
		// TODO Auto-generated method stub
		return achievementsDao.findInAchievements();
	}

}
