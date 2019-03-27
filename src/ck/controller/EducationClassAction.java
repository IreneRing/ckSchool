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
import ck.service.EducationClassService;

@Controller
@RequestMapping("eduClass")
public class EducationClassAction {
	@Autowired
	private EducationClassService educationClassService;
	
	//user
	/**
	 * 查询所有分类
	 */
	@RequestMapping("findAllEducationClass.action")
	public String findAllEducationClass(ModelMap map) {
		map.addAttribute("ecList",educationClassService.findAllEducationClass());
		return "user/eduClass-list";
	}
	/**
	 * 添加内容
	 */
	@RequestMapping("eduClassPreAdd.action")
	public String eduClassPreAdd(){
		return "user/eduClass-add";
	}
	/**
	 * 添加操作
	 */
	@RequestMapping(value="eduClassAdd.action",method={RequestMethod.POST})
	public String eduClassAdd(EducationClass eduClass){
		
		int row=educationClassService.addEducationClass(eduClass);
		return "redirect:/eduClass/findAllEducationClass.action";
	}
	/**
	 * 编辑内容
	 */
	@RequestMapping("eduClassPreUpd.action")
	public String eduClassPreUpd(ModelMap map,int ecid){
		EducationClass eduClass = educationClassService.findEducationClassById(ecid);
		map.addAttribute("eduClass", eduClass);
		return "user/eduClass-upd";
	}
	/**
	 * 编辑操作
	 */
	@RequestMapping(value="eduClassUpd.action",method={RequestMethod.POST})
	public String eduClassUpd(ModelMap map,EducationClass eduClass){
		int row=educationClassService.updEducationClass(eduClass);
		return "redirect:/eduClass/findAllEducationClass.action";
	}
	/**
	 * 删除操作
	 */
	@RequestMapping("eduClassDel.action")
	public String eduClassDel(ModelMap map,
			@RequestParam(required=false, value="ecid") int ecid){
		int row=educationClassService.delEducationClass(ecid);
		return "redirect:/eduClass/findAllEducationClass.action";
	}
	/**
	 * 批量删除操作
	 */
	@RequestMapping("eduClassAllDel.action")
	@ResponseBody
	public Map<String,String> eduClassAllDel(@RequestParam(required=false, value="ids") String ids) {
		Map<String,String> map=new HashMap<>();
		String []s =ids.split(",");
		System.out.println("删除id："+Arrays.asList(s));
		List<String > list =Arrays.asList(s);
		List<Integer> ecid=new ArrayList();
		for (String string : list) {
			int id=Integer.parseInt(string);
			ecid.add(id);
		}
		try {
			educationClassService.delAllEducationClass(ecid);
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
	@RequestMapping("eduClassCheck.action")
	@ResponseBody
	public String eduClassCheck(ModelMap map,
			@RequestParam(required=false, value="ecclass") String ecclass){
		EducationClass eduClass=educationClassService.findEducationClassByName(ecclass);
		if(eduClass!=null) {
			return "yes";
		}
		else {
			return "no";
		}
	}
}
