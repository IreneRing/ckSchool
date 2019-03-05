package ck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import ck.service.EducationService;

/**
 * 教育控制器
 */
@Controller
@RequestMapping("edu")
public class EducationAction {
	@Autowired
	private EducationService educationService;
	/**
	 * 查出所有
	 */
	@RequestMapping("findAllEducation.action")
	public String findAllEducation(ModelMap map){
		map.addAttribute("eduList",educationService.findAllEducation());
		return "index/edu";
	}
	
	/**
	 * 查出首页展示
	 */
	@RequestMapping("findInEducation.action")
	public String findInEducation(ModelMap map){
		map.addAttribute("eduList",educationService.findInEducation());
		return "index/edu";
	}
}
