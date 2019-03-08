package ck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

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
	public String findAllEducation(ModelMap map,@RequestParam(value="currentPage",required=false,defaultValue="1") int currentPage){
		//设置分页
		PageHelper.startPage(currentPage,4);
		List list=educationService.findAllEducation();
		//调动分页
		PageInfo pageInfo=new PageInfo(list);
		map.addAttribute("pageInfo",pageInfo);
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
