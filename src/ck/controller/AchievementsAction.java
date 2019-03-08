package ck.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

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
	public String findAllAchievements(ModelMap map,@RequestParam(value="currentPage",required=false,defaultValue="1") int currentPage){
		//设置分页
		PageHelper.startPage(currentPage,9);
		List list=achievementsService.findAllAchievements();
		//调动分页
		PageInfo pageInfo=new PageInfo(list);
		map.addAttribute("pageInfo",pageInfo);
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
