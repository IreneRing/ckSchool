package ck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import ck.bean.TeacherEx;
import ck.service.TeacherService;

/**
 * teacher控制器
 */
@Controller
@RequestMapping("tea")
public class TeacherAction {
	@Autowired
	private TeacherService teacherService;
	
	public List<TeacherEx> findInTeacher(){
		return teacherService.findInTeacher();
	}
	/**
	 * 查出所有
	 */
	@RequestMapping("findAllTeacher.action")
	public String findAllTeacher(ModelMap map){
		map.addAttribute("teaList",teacherService.findAllTeacher());
		return "index/teacher";
	}
	
	/**
	 * 查出首页展示
	 */
	@RequestMapping("findInTeacher.action")
	public String findInTeacher(ModelMap map){
		map.addAttribute("teaList",teacherService.findInTeacher());
		return "index/teacher";
	}
}
