package ck.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ck.bean.Case;
import ck.bean.CaseEx;
import ck.service.CaseClassService;
import ck.service.CaseService;
import ck.service.TeacherService;

/**
 * 项目+class控制器
 */
@Controller
@RequestMapping("case")
public class CaseAction {
	@Autowired
	private CaseService caseService;
	@Autowired
	private	CaseClassService caseClassService;
	@Autowired
	private	TeacherService teacherService;
	//user
	/**
	 * 查出所有list
	 * 
	 */
	@RequestMapping("findAllCaseAndClass.action")
	public String findAllCaseAndClass(ModelMap map) {
		map.addAttribute("ccList",caseClassService.findAllCaseClass());
		map.addAttribute("cList",caseService.findAllCaseEx());
		return "user/case-list";
	}
	/**
	 * 添加内容
	 */
	@RequestMapping("casePreAdd.action")
	public String casePreAdd(ModelMap map){
		map.addAttribute("ccList",caseClassService.findAllCaseClass());
		map.addAttribute("tList", teacherService.findAllTeacher());
		return "user/case-add";
	}
	/**
	 * 添加操作
	 */
	@RequestMapping(value="caseAdd.action",method={RequestMethod.POST})
	public String caseAdd(HttpServletRequest request,Case c)throws IOException{
		int row=caseService.addCaseEx(c);
		return "redirect:/case/findAllCaseAndClass.action";
	}
	/**
	 * 编辑内容
	 */
	@RequestMapping("casePreUpd.action")
	public String casePreUpd(ModelMap map,
			@RequestParam(required=false, value="cid") int cid){
		map.addAttribute("ccList",caseClassService.findAllCaseClass());
		map.addAttribute("tList", teacherService.findAllTeacher());
		map.addAttribute("cList",caseService.findCaseExById(cid));
		return "user/case-upd";
	}
	/**
	 * 编辑操作
	 */
	@RequestMapping(value="caseUpd.action",method={RequestMethod.POST})
	public String caseUpd(HttpServletRequest request,Case c)throws IOException{
		int row=caseService.updCaseEx(c);
		return "redirect:/case/findAllCaseAndClass.action";
	}
	/**
	 * 删除操作
	 */
	@RequestMapping("caseDel.action")
	public String caseDel(ModelMap map,
			@RequestParam(required=false, value="cid") int cid){
		int row=caseService.delCaseEx(cid);
		return "redirect:/case/findAllCaseAndClass.action";
	}
	/**
	 * 批量删除操作
	 */
	@RequestMapping("eduAllDel.action")
	@ResponseBody
	public Map<String,String> eduAllDel(@RequestParam(required=false, value="ids") String ids) {
		Map<String,String> map=new HashMap<>();
		String []s =ids.split(",");
		System.out.println("删除id："+Arrays.asList(s));
		List<String > list =Arrays.asList(s);
		List<Integer> cid=new ArrayList();
		for(int i=0;i<list.size();i++) {
			int id=Integer.parseInt(list.get(i));
			cid.add(id);
		}
		try {
			caseService.delAllCase(cid);
			map.put("data", "ok");
		}catch (Exception e) {
			// TODO: handle exception
			map.put("data", "");
		}
		return map;
	}
	/**
	 * 分类查询
	 */
	@RequestMapping("findCaseAndClassByClass.action")
	public String findCaseAndClassByClass(ModelMap map,@RequestParam(required=false, value="ccid") int ccid) {
		if(ccid==0) {
			return "redirect:/case/findAllCaseAndClass.action";
		}
		else {
			int n=0;
			List<CaseEx> findCaseExByClass = caseService.findCaseExByClass(ccid);
			for (CaseEx caseEx : findCaseExByClass) {
				n=caseEx.getCcid();
			}
			map.addAttribute("ccid",n);
			map.addAttribute("ccList",caseClassService.findAllCaseClass());
			map.addAttribute("cList",findCaseExByClass);
			/*List<EducationEx> findEducationExByClass = educationService.findEducationExByClass(ecid);
			for (EducationEx educationEx : findEducationExByClass) {
				n=educationEx.getEcid();
			}
			map.addAttribute("ecid",n);
			map.addAttribute("ecList",educationClassService.findAllEducationClass());
			map.addAttribute("eList",findEducationExByClass);*/
			return "user/case-list";
		}
	}
	/**
	 * 时期查询
	 */
	@RequestMapping("findCaseAndClassByDate.action")
	public String findCaseAndClassByDate(ModelMap map,@RequestParam(required=false, value="cdate") String cdate) {
		map.addAttribute("ccList",caseClassService.findAllCaseClass());
		map.addAttribute("cList",caseService.findCaseExByDate(cdate));
		return "user/case-list";
	}
	
	
	//index
	/**
	 * 查出所有
	 */
	@RequestMapping("findAllTeacher.action")
	public String findAllTeacher(ModelMap map,@RequestParam(value="currentPage",required=false,defaultValue="1") int currentPage){
		//设置分页
		PageHelper.startPage(currentPage,8);
		List list=caseService.findAllCase();
		//调动分页
		PageInfo pageInfo=new PageInfo(list);
		//分类
		map.addAttribute("ccList",caseClassService.findAllCaseClass());
		map.addAttribute("pageInfo",pageInfo);
		return "index/case";
	}
	
	/**
	 * 查出首页展示
	 */
	@RequestMapping("findInTeacher.action")
	public String findInTeacher(ModelMap map){
		map.addAttribute("caseList",caseService.findInCase());
		return "index/case";
	}
}
