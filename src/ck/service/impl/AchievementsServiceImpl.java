package ck.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ck.bean.Achievements;
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

	@Override
	public AchievementsEx findAchievementsExById(int aid) {
		// TODO Auto-generated method stub
		return achievementsDao.findAchievementsExById(aid);
	}

	@Override
	public int addAchievementsEx(Achievements ach) {
		// TODO Auto-generated method stub
		return achievementsDao.addAchievementsEx(ach);
	}

	@Override
	public int updAchievementsEx(Achievements ach) {
		// TODO Auto-generated method stub
		return achievementsDao.updAchievementsEx(ach);
	}

	@Override
	public int delAchievementsEx(int aid) {
		// TODO Auto-generated method stub
		return achievementsDao.delAchievementsEx(aid);
	}

	@Override
	public int delAllAchievements(List aid) {
		// TODO Auto-generated method stub
		return achievementsDao.delAllAchievements(aid);
	}

	@Override
	public List<AchievementsEx> findAchievementsExByTid(int tid) {
		// TODO Auto-generated method stub
		return achievementsDao.findAchievementsExByTid(tid);
	}

	@Override
	public List<AchievementsEx> findAchievementsExByDate(String adate) {
		// TODO Auto-generated method stub
		return achievementsDao.findAchievementsExByDate(adate);
	}

}
