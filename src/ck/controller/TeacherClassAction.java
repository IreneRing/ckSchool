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
import ck.bean.TeacherClass;
import ck.service.TeacherClassService;

@Controller
@RequestMapping("teaClass")
public class TeacherClassAction {
	@Autowired
	private TeacherClassService teacherClassService;
	
	//user
	/**
	 * 查询所有分类
	 */
	@RequestMapping("findAllTeacherClass.action")
	public String findAllTeacherClass(ModelMap map) {
		map.addAttribute("tcList",teacherClassService.findAllTeacherClass());
		return "user/teaClass-list";
	}
	/**
	 * 添加内容
	 */
	@RequestMapping("teaClassPreAdd.action")
	public String teaClassPreAdd(){
		return "user/teaClass-add";
	}
	/**
	 * 添加操作
	 */
	@RequestMapping(value="teaClassAdd.action",method={RequestMethod.POST})
	public String teaClassAdd(TeacherClass teaClass){
		int row=teacherClassService.addTeacherClass(teaClass);
		return "redirect:/teaClass/findAllTeacherClass.action";
	}
	/**
	 * 编辑内容
	 */
	@RequestMapping("teaClassPreUpd.action")
	public String teaClassPreUpd(ModelMap map,int tcid){
		TeacherClass teaClass = teacherClassService.findTeacherClassById(tcid);
		map.addAttribute("teaClass", teaClass);
		return "user/teaClass-upd";
	}
	/**
	 * 编辑操作
	 */
	@RequestMapping(value="teaClassUpd.action",method={RequestMethod.POST})
	public String teaClassUpd(ModelMap map,TeacherClass teaClass){
		int row = teacherClassService.updTeacherClass(teaClass);
		return "redirect:/teaClass/findAllTeacherClass.action";
	}
	/**
	 * 删除操作
	 */
	@RequestMapping("teaClassDel.action")
	public String teaClassDel(ModelMap map,
			@RequestParam(required=false, value="tcid") int tcid){
		int row = teacherClassService.delTeacherClass(tcid);
		return "redirect:/teaClass/findAllTeacherClass.action";
	}
	/**
	 * 批量删除操作
	 */
	@RequestMapping("teaClassAllDel.action")
	@ResponseBody
	public Map<String,String> teaClassAllDel(@RequestParam(required=false, value="ids") String ids) {
		Map<String,String> map=new HashMap<>();
		String []s =ids.split(",");
		System.out.println("删除id："+Arrays.asList(s));
		List<String > list =Arrays.asList(s);
		List<Integer> tcid=new ArrayList();
		for (String string : list) {
			int id=Integer.parseInt(string);
			tcid.add(id);
		}
		try {
			teacherClassService.delAllTeacherClass(tcid);
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
	@RequestMapping("teaClassCheck.action")
	@ResponseBody
	public String teaClassCheck(ModelMap map,
			@RequestParam(required=false, value="tcclass") String tcclass){
		TeacherClass teaClass = teacherClassService.findTeacherClassByName(tcclass);
		if(teaClass!=null) {
			return "yes";
		}
		else {
			return "no";
		}
	}
}
