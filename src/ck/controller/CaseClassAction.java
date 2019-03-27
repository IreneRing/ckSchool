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

import ck.bean.CaseClass;
import ck.service.CaseClassService;

@Controller
@RequestMapping("caseClass")
public class CaseClassAction {
	@Autowired
	private CaseClassService caseClassService;
	
	//user
	/**
	 * 查询所有分类
	 */
	@RequestMapping("findAllCaseClass.action")
	public String findAllCaseClass(ModelMap map) {
		map.addAttribute("ccList",caseClassService.findAllCaseClass());
		return "user/caseClass-list";
	}
	/**
	 * 添加内容
	 */
	@RequestMapping("caseClassPreAdd.action")
	public String caseClassPreAdd(){
		return "user/caseClass-add";
	}
	/**
	 * 添加操作
	 */
	@RequestMapping(value="caseClassAdd.action",method={RequestMethod.POST})
	public String caseClassAdd(CaseClass caseClass){
		
		int row=caseClassService.addCaseClass(caseClass);
		return "redirect:/caseClass/findAllCaseClass.action";
	}
	/**
	 * 编辑内容
	 */
	@RequestMapping("caseClassPreUpd.action")
	public String caseClassPreUpd(ModelMap map,int ccid){
		CaseClass caseClass = caseClassService.findCaseClassById(ccid);
		map.addAttribute("caseClass", caseClass);
		return "user/caseClass-upd";
	}
	/**
	 * 编辑操作
	 */
	@RequestMapping(value="caseClassUpd.action",method={RequestMethod.POST})
	public String caseClassUpd(ModelMap map,CaseClass caseClass){
		int row = caseClassService.updCaseClass(caseClass);
		return "redirect:/caseClass/findAllCaseClass.action";
	}
	/**
	 * 删除操作
	 */
	@RequestMapping("caseClassDel.action")
	public String caseClassDel(ModelMap map,
			@RequestParam(required=false, value="ccid") int ccid){
		int row=caseClassService.delCaseClass(ccid);
		return "redirect:/caseClass/findAllCaseClass.action";
	}
	/**
	 * 批量删除操作
	 */
	@RequestMapping("caseClassAllDel.action")
	@ResponseBody
	public Map<String,String> caseClassAllDel(@RequestParam(required=false, value="ids") String ids) {
		Map<String,String> map=new HashMap<>();
		String []s =ids.split(",");
		System.out.println("删除id："+Arrays.asList(s));
		List<String > list =Arrays.asList(s);
		List<Integer> ccid=new ArrayList();
		for (String string : list) {
			int id=Integer.parseInt(string);
			ccid.add(id);
		}
		try {
			caseClassService.delAllCaseClass(ccid);
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
	@RequestMapping("caseClassCheck.action")
	@ResponseBody
	public String caseClassCheck(ModelMap map,
			@RequestParam(required=false, value="ccclass") String ccclass){
		CaseClass caseClass = caseClassService.findCaseClassByName(ccclass);
		if(caseClass!=null) {
			return "yes";
		}
		else {
			return "no";
		}
	}
}
