package ck.controller;
/**
 * 资源控制器
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ck.service.ResClassService;
import ck.service.ResService;
@Controller
@RequestMapping("res")
public class ResAction {
	@Autowired
	private ResService resService;
	@Autowired
	private ResClassService resClassService;
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
	public String findAllRes(ModelMap map,@RequestParam(value="currentPage",required=false,defaultValue="1") int currentPage){
		//设置分页
		PageHelper.startPage(currentPage,6);
		//分类
		List list=resClassService.findResClassAndRes();
		//调动分页
		PageInfo pageInfo=new PageInfo(list);
		map.addAttribute("pageInfo",pageInfo);
		return "index/res";
	}
}
