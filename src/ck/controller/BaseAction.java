package ck.controller;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * 页面调动类
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import ck.service.CaseService;
import ck.service.TeacherService;

@Controller
@RequestMapping("base")
public class BaseAction {
	@Autowired
	private CaseService caseService;
	@Autowired
	private TeacherService teacherService;
	/**
	 * 首页
	 */
	@RequestMapping("index.action")
	public String index(ModelMap map) {
		map.addAttribute("caseList",caseService.findInCase());
		map.addAttribute("teaList",teacherService.findInTeacher());
		return "index/index";
	}
}
