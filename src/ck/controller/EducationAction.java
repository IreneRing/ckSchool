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

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import ck.bean.Education;
import ck.bean.EducationEx;
import ck.service.EducationClassService;
import ck.service.EducationService;

/**
 * 教育+分类控制器
 */
@Controller
@RequestMapping("edu")
public class EducationAction {
	@Autowired
	private EducationService educationService;
	@Autowired
	private EducationClassService educationClassService;
	
	//user
	
	
	/**
	 * 查出所有list
	 * 
	 */
	@RequestMapping("findAllEducationAndClass.action")
	public String findAllEducationAndClass(ModelMap map) {
		map.addAttribute("ecList",educationClassService.findAllEducationClass());
		map.addAttribute("eList",educationService.findAllEducation());
		return "user/edu-list";
	}
	/**
	 * 添加内容
	 */
	@RequestMapping("eduPreAdd.action")
	public String eduPreAdd(ModelMap map){
		map.addAttribute("ecList",educationClassService.findAllEducationClass());
		return "user/edu-add";
	}
	/**
	 * 添加操作
	 */
	@RequestMapping(value="eduAdd.action",method={RequestMethod.POST})
	public String eduAdd(HttpServletRequest request,Education edu,
			@RequestParam(value="file",required=false) MultipartFile file)throws IOException{
		File destParentPath=new File("D:/workspace/ckSchool/WebContent/static/upload/edu");
		if(file!=null) {
			//目錄是否存在
			if(!destParentPath.exists()) {
				destParentPath.mkdirs();
			}
			//uuid國際隨機字符串
			String uuid=UUID.randomUUID().toString().replaceAll("-", "");
			//文件擴展名
			String extension = FilenameUtils.getExtension(file.getOriginalFilename());
			//保存文件名稱
			String newFile=uuid+"."+extension;
			System.out.println(newFile);
			System.out.println(destParentPath);
			//創建文件
			File destFile=new File(destParentPath,newFile);
			//保存文件
			file.transferTo(destFile);
			edu.setEpic("/static/upload/edu/"+newFile);
		}
		int row=educationService.addEducationEx(edu);
		return "redirect:/edu/findAllEducationAndClass.action";
	}
	/**
	 * 编辑内容
	 */
	@RequestMapping("eduPreUpd.action")
	public String eduPreUpd(ModelMap map,
			@RequestParam(required=false, value="eid") int eid){
		map.addAttribute("ecList",educationClassService.findAllEducationClass());
		map.addAttribute("eList",educationService.findEducationExById(eid));
		return "user/edu-upd";
	}
	/**
	 * 编辑操作
	 */
	@RequestMapping(value="eduUpd.action",method={RequestMethod.POST})
	public String eduUpd(HttpServletRequest request,Education edu,
			@RequestParam(value="newFile",required=false) MultipartFile file)throws IOException{
		
		File destParentPath=new File("D:/workspace/ckSchool/WebContent/static/upload/edu");
		if(file!=null)//file不为空
		{
			//目錄是否存在
			if(!destParentPath.exists()) {
				destParentPath.mkdirs();
			}
			//uuid國際隨機字符串
			String uuid=UUID.randomUUID().toString().replaceAll("-", "");
			//文件擴展名
			String extension = FilenameUtils.getExtension(file.getOriginalFilename());
			//保存文件名稱
			String newFile=uuid+"."+extension;
			System.out.println(newFile);
			System.out.println(destParentPath);
			//創建文件
			File destFile=new File(destParentPath,newFile);
			//当file存在，那么将这个file写入硬盘
			file.transferTo(destFile);
			//删除旧图片
			File oldFile=new File("D:/workspace/ckSchool/WebContent"+edu.getEpic());
			oldFile.delete();
			System.out.println(oldFile+"");
			//System.out.println("D:\\workspace\\ckSchool\\WebContent\\upload\\"+fileName);
			edu.setEpic("/static/upload/edu/"+newFile);
		}
		int row=educationService.updEducationEx(edu);
		return "redirect:/edu/findAllEducationAndClass.action";
	}
	/**
	 * 删除操作
	 */
	@RequestMapping("eduDel.action")
	public String eduDel(ModelMap map,
			@RequestParam(required=false, value="eid") int eid){
		String pic=educationService.findEducationExById(eid).getEpic();
		int row=educationService.delEducationEx(eid);
		if(row>0) {
			//删除旧图片
			File oldFile=new File("D:/workspace/ckSchool/WebContent"+pic);
			oldFile.delete();
			System.out.println(pic);
		}
		return "redirect:/edu/findAllEducationAndClass.action";
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
		List<Integer> eid=new ArrayList();
		List<String> pic=new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			int id=Integer.parseInt(list.get(i));
			eid.add(id);
			pic.add(educationService.findEducationExById(eid.get(i)).getEpic());
		}
		int row=0;
		
		try {
			row=educationService.delAllEducation(eid);
			map.put("data", "ok");
		}catch (Exception e) {
			// TODO: handle exception
			map.put("data", "");
		}
		
		if(row>0) {
			for (String string : pic) {
				if(string!=null && string!="") {
					//删除旧图片
					File oldFile=new File("D:/workspace/ckSchool/WebContent"+string);
					oldFile.delete();
					System.out.println(string);
				}
			}
		}
		return map;
	}
	/**
	 * 分类查询
	 */
	@RequestMapping("findEducationAndClassByClass.action")
	public String findEducationAndClassByClass(ModelMap map,@RequestParam(required=false, value="ecid") int ecid) {
		if(ecid==0) {
			return "redirect:/edu/findAllEducationAndClass.action";
		}
		else {
			int n=0;
			List<EducationEx> findEducationExByClass = educationService.findEducationExByClass(ecid);
			for (EducationEx educationEx : findEducationExByClass) {
				n=educationEx.getEcid();
			}
			map.addAttribute("ecid",n);
			map.addAttribute("ecList",educationClassService.findAllEducationClass());
			map.addAttribute("eList",findEducationExByClass);
			return "user/edu-list";
		}
	}
	/**
	 * 时期查询
	 */
	@RequestMapping("findEducationAndClassByDate.action")
	public String findEducationAndClassByDate(ModelMap map,@RequestParam(required=false, value="edate") String edate) {
		map.addAttribute("ecList",educationClassService.findAllEducationClass());
		map.addAttribute("eList",educationService.findEducationExByDate(edate));
		return "user/edu-list";
	}
	
	//index
	/**
	 * 查出所有
	 */
	@RequestMapping("findAllEducation.action")
	public String findAllEducation(ModelMap map,@RequestParam(value="currentPage",required=false,defaultValue="1") int currentPage){
		//设置分页
		PageHelper.startPage(currentPage,4);
		List list=educationService.findAllEducation();
		//调动分页
		PageInfo pageInfo=new PageInfo(list);
		map.addAttribute("pageInfo",pageInfo);
		return "index/edu";
	}
	
	/**
	 * 查出首页展示
	 */
	@RequestMapping("findInEducation.action")
	public String findInEducation(ModelMap map){
		map.addAttribute("eduList",educationService.findInEducation());
		return "index/edu";
	}
	
}
