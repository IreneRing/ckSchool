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

import ck.bean.EducationClass;
import ck.bean.NewsClass;
import ck.service.NewClassService;

@Controller
@RequestMapping("newClass")
public class NewClassAction {
	@Autowired
	private NewClassService newClassService;
	
	//user
	/**
	 * 查询所有分类
	 */
	@RequestMapping("findAllNewsClass.action")
	public String findAllNewsClass(ModelMap map) {
		map.addAttribute("ncList",newClassService.findAllNewClass());
		return "user/newClass-list";
	}
	/**
	 * 添加内容
	 */
	@RequestMapping("newsClassPreAdd.action")
	public String newsClassPreAdd(){
		return "user/newClass-add";
	}
	/**
	 * 添加操作
	 */
	@RequestMapping(value="newsClassAdd.action",method={RequestMethod.POST})
	public String newsClassAdd(NewsClass newsClass){
		int row=newClassService.addNewClass(newsClass);
		return "redirect:/newClass/findAllNewsClass.action";
	}
	/**
	 * 编辑内容
	 */
	@RequestMapping("newsClassPreUpd.action")
	public String newsClassPreUpd(ModelMap map,int ncid){
		NewsClass newsClass = newClassService.findNewClassById(ncid);
		map.addAttribute("newsClass", newsClass);
		return "user/newClass-upd";
	}
	/**
	 * 编辑操作
	 */
	@RequestMapping(value="newsClassUpd.action",method={RequestMethod.POST})
	public String newsClassUpd(ModelMap map,NewsClass newsClass){
		int row=newClassService.updNewClass(newsClass);
		return "redirect:/newClass/findAllNewsClass.action";
	}
	/**
	 * 删除操作
	 */
	@RequestMapping("newsClassDel.action")
	public String newsClassDel(ModelMap map,
			@RequestParam(required=false, value="ncid") int ncid){
		int row=newClassService.delNewClass(ncid);
		return "redirect:/newClass/findAllNewsClass.action";
	}
	/**
	 * 批量删除操作
	 */
	@RequestMapping("newsClassAllDel.action")
	@ResponseBody
	public Map<String,String> newsClassAllDel(@RequestParam(required=false, value="ids") String ids) {
		Map<String,String> map=new HashMap<>();
		String []s =ids.split(",");
		System.out.println("删除id："+Arrays.asList(s));
		List<String > list =Arrays.asList(s);
		List<Integer> ncid=new ArrayList();
		for (String string : list) {
			int id=Integer.parseInt(string);
			ncid.add(id);
		}
		try {
			newClassService.delAllNewClass(ncid);
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
	@RequestMapping("newsClassCheck.action")
	@ResponseBody
	public String newsClassCheck(ModelMap map,
			@RequestParam(required=false, value="ncclass") String ncclass){
		NewsClass newsClass = newClassService.findNewClassByName(ncclass);
		if(newsClass!=null) {
			return "yes";
		}
		else {
			return "no";
		}
	}
}
