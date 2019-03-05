package ck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import ck.service.NewService;

/**
 * 新聞控制器
 */
@Controller
@RequestMapping("new")
public class NewAction {
	@Autowired
	private NewService newService;
	
	/**
	 * 查出所有
	 */
	@RequestMapping("findAllNew.action")
	public String findAllNew(ModelMap map){
		map.addAttribute("newList",newService.findAllNew());
		return "index/new";
	}
	
	/**
	 * 查出首页展示
	 */
	@RequestMapping("findInNew.action")
	public String findInNew(ModelMap map){
		map.addAttribute("newList",newService.findInNew());
		return "index/new";
	}
}
