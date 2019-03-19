package ck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ck.service.NewService;

/**
 * 新聞控制器
 */
@Controller
@RequestMapping("new")
public class NewAction {
	@Autowired
	private NewService newService;
	
	//index
	/**
	 * 查出所有
	 */
	@RequestMapping("findAllNew.action")
	public String findAllNew(ModelMap map,@RequestParam(value="currentPage",required=false,defaultValue="1") int currentPage){
		//设置分页
		PageHelper.startPage(currentPage,4);
		List list=newService.findAllNew();
		//调动分页
		PageInfo pageInfo=new PageInfo(list);
		map.addAttribute("pageInfo",pageInfo);
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
