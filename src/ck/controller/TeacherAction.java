package ck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ck.bean.TeacherEx;
import ck.service.TeacherClassService;
import ck.service.TeacherService;

/**
 * teacher+class控制器
 */
@Controller
@RequestMapping("tea")
public class TeacherAction {
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private	TeacherClassService	teacherClassService;
	/**
	 * 查出所有
	 */
	@RequestMapping("findAllTeacher.action")
	public String findAllTeacher(ModelMap map,@RequestParam(value="currentPage",required=false,defaultValue="1") int currentPage){
		//设置分页
		PageHelper.startPage(currentPage,6);
		List list=teacherService.findAllTeacher();
		//调动分页
		PageInfo pageInfo=new PageInfo(list);
		//分类
		map.addAttribute("tcList",teacherClassService.findAllTeacherClass());
		map.addAttribute("pageInfo",pageInfo);
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
