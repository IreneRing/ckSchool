package ck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import ck.bean.Case;
import ck.service.CaseService;

/**
 * 项目控制器
 */
@Controller
@RequestMapping("case")
public class CaseAction {
	@Autowired
	private CaseService caseService;
	
	public List<Case> findInCase(){
		return caseService.findInCase();
	}
	/**
	 * 查出所有
	 */
	@RequestMapping("findAllTeacher.action")
	public String findAllTeacher(ModelMap map){
		map.addAttribute("caseList",caseService.findAllCase());
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
