package ck.controller;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * 页面调动类
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ck.service.CaseService;
import ck.service.TeacherService;

@Controller
@RequestMapping("base")
public class BaseAction {
	@Autowired
	private CaseService caseService;
	@Autowired
	private TeacherService teacherService;
	
	//后台登陆
	@RequestMapping("login.action")
	public String login(ModelMap map,@RequestParam(required=false, value="msg") String msg) {
		if(msg==null) {
			msg="";
		}
		map.addAttribute("msg",msg);
		return "login";
	}
	/**
	 * 首页展示
	 */
	@RequestMapping("index.action")
	public String index(ModelMap map) {
		map.addAttribute("caseList",caseService.findInCase());
		map.addAttribute("teaList",teacherService.findInTeacher());
		return "index/index";
	}
	
}
