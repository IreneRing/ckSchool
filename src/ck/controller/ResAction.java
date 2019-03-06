package ck.controller;
/**
 * 资源控制器
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ck.service.ResService;
@Controller
@RequestMapping("res")
public class ResAction {
	@Autowired
	private ResService resService;
	/**
	 * 按照种类查询
	 * @return
	 */
	@RequestMapping("findResBySort.action")
	public String findResBySort(ModelMap map,@RequestParam(required=false, value="rcid") int rcid) {
		
		return null;
	}
	/**
	 * 查出所有
	 */
	@RequestMapping("findAllRes.action")
	public String findAllRes(ModelMap map){
		map.addAttribute("resList",resService.findAllRes());
		return "index/res";
	}
}
