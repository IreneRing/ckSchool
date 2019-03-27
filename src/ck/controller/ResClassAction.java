package ck.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ck.bean.ResClass;
import ck.service.ResClassService;

@Controller
@RequestMapping("resClass")
public class ResClassAction {
	@Autowired
	private ResClassService resClassService;
	
	//user
	/**
	 * 查询所有分类
	 */
	@RequestMapping("findAllResClass.action")
	public String findAllResClass(ModelMap map) {
		map.addAttribute("rcList",resClassService.findAllResClass());
		return "user/resClass-list";
	}
	
	/**
	 * 添加内容
	 */
	@RequestMapping("resClassPreAdd.action")
	public String resClassPreAdd(){
		return "user/resClass-add";
	}
	/**
	 * 添加操作
	 */
	@RequestMapping(value="resClassAdd.action",method={RequestMethod.POST})
	public String resClassAdd(ResClass resClass){
		int row=resClassService.addResClass(resClass);
		return "redirect:/resClass/findAllResClass.action";
	}
	
	/**
	 * 编辑内容
	 */
	@RequestMapping("resClassPreUpd.action")
	public String resClassPreUpd(ModelMap map,int rcid){
		ResClass resClass = resClassService.findResClassById(rcid);
		map.addAttribute("resClass", resClass);
		return "user/resClass-upd";
	}
	/**
	 * 编辑操作
	 */
	@RequestMapping(value="resClassUpd.action",method={RequestMethod.POST})
	public String resClassUpd(ModelMap map,ResClass resClass){
		int row=resClassService.updResClass(resClass);
		return "redirect:/resClass/findAllResClass.action";
	}
	/**
	 * 删除操作
	 */
	@RequestMapping("resClassDel.action")
	public String resClassDel(ModelMap map,
			@RequestParam(required=false, value="rcid") int rcid){
		int row=resClassService.delResClass(rcid);
		return "redirect:/resClass/findAllResClass.action";
	}
	/**
	 * 批量删除操作
	 */
	@RequestMapping("resClassAllDel.action")
	@ResponseBody
	public Map<String,String> resClassAllDel(@RequestParam(required=false, value="ids") String ids) {
		Map<String,String> map=new HashMap<>();
		String []s =ids.split(",");
		System.out.println("删除id："+Arrays.asList(s));
		List<String > list =Arrays.asList(s);
		List<Integer> rcid=new ArrayList();
		for (String string : list) {
			int id=Integer.parseInt(string);
			rcid.add(id);
		}
		try {
			resClassService.delAllResClass(rcid);
			map.put("data", "ok");
		}catch (Exception e) {
			// TODO: handle exception
			map.put("data", "");
		}
		return map;
	}
	/**
	 * 驗證是否重名
	 */
	@RequestMapping("resClassCheck.action")
	@ResponseBody
	public String resClassCheck(ModelMap map,
			@RequestParam(required=false, value="rcclass") String rcclass){
		ResClass resClass = resClassService.findResClassByName(rcclass);
		if(resClass!=null) {
			return "yes";
		}
		else {
			return "no";
		}
	}
}
