package ck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ck.bean.Case;
import ck.service.CaseClassService;
import ck.service.CaseService;

/**
 * 项目+class控制器
 */
@Controller
@RequestMapping("case")
public class CaseAction {
	@Autowired
	private CaseService caseService;
	@Autowired
	private	CaseClassService caseClassService;
	
	//index
	/**
	 * 查出所有
	 */
	@RequestMapping("findAllTeacher.action")
	public String findAllTeacher(ModelMap map,@RequestParam(value="currentPage",required=false,defaultValue="1") int currentPage){
		//设置分页
		PageHelper.startPage(currentPage,8);
		List list=caseService.findAllCase();
		//调动分页
		PageInfo pageInfo=new PageInfo(list);
		//分类
		map.addAttribute("ccList",caseClassService.findAllCaseClass());
		map.addAttribute("pageInfo",pageInfo);
		return "index/case";
	}
	
	/**
	 * 查出首页展示
	 */
	@RequestMapping("findInTeacher.action")
	public String findInTeacher(ModelMap map){
		map.addAttribute("caseList",caseService.findInCase());
		return "index/case";
	}
}
