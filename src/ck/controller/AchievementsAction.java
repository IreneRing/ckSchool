package ck.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import ck.service.AchievementsService;

/**
 * 成果控制器
 */
@Controller
@RequestMapping("achievements")
public class AchievementsAction {
	@Autowired
	private AchievementsService achievementsService;
	
	/**
	 * 查出所有
	 */
	@RequestMapping("findAllAchievements.action")
	public String findAllAchievements(ModelMap map){
		map.addAttribute("achievementsList",achievementsService.findAllAchievements());
		return "index/ach";
	}
	
	/**
	 * 查出首页展示
	 */
	@RequestMapping("findInAchievements.action")
	public String findInAchievements(ModelMap map){
		map.addAttribute("achievementsList",achievementsService.findInAchievements());
		return "index/ach";
	}
}
