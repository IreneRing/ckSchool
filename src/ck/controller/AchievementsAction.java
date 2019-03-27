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

import ck.bean.Achievements;
import ck.bean.AchievementsEx;
import ck.service.AchievementsService;
import ck.service.TeacherService;

/**
 * 成果控制器
 */
@Controller
@RequestMapping("achievements")
public class AchievementsAction {
	@Autowired
	private AchievementsService achievementsService;
	@Autowired
	private TeacherService teacherService;
	
	
	//user
	/**
	 * 查出所有list
	 * 
	 */
	@RequestMapping("findAllAchievementsAndClass.action")
	public String findAllAchievementsAndClass(ModelMap map) {
		map.addAttribute("tList",teacherService.findAllTeacher());
		map.addAttribute("aList",achievementsService.findAllAchievements());
		return "user/ach-list";
	}
	/**
	 * 添加内容
	 */
	@RequestMapping("achPreAdd.action")
	public String achPreAdd(ModelMap map){
		map.addAttribute("tList",teacherService.findAllTeacher());
		return "user/ach-add";
	}
	/**
	 * 添加操作
	 */
	@RequestMapping(value="achAdd.action",method={RequestMethod.POST})
	public String achAdd(HttpServletRequest request,Achievements ach,
			@RequestParam(value="file",required=false) MultipartFile file)throws IOException{
		File destParentPath=new File("D:/workspace/ckSchool/WebContent/static/upload/ach");
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
			ach.setApic("/static/upload/ach/"+newFile);
		}
		int row=achievementsService.addAchievementsEx(ach);
		return "redirect:/achievements/findAllAchievementsAndClass.action";
	}
	/**
	 * 编辑内容
	 */
	@RequestMapping("achPreUpd.action")
	public String achPreUpd(ModelMap map,
			@RequestParam(required=false, value="aid") int aid){
		map.addAttribute("tList",teacherService.findAllTeacher());
		map.addAttribute("aList",achievementsService.findAchievementsExById(aid));
		return "user/ach-upd";
	}
	/**
	 * 编辑操作
	 */
	@RequestMapping(value="achUpd.action",method={RequestMethod.POST})
	public String achUpd(HttpServletRequest request,Achievements ach,
			@RequestParam(value="newFile",required=false) MultipartFile file)throws IOException{
		
		File destParentPath=new File("D:/workspace/ckSchool/WebContent/static/upload/ach");
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
			
			File oldFile=new File("D:/workspace/ckSchool/WebContent"+ach.getApic());
			oldFile.delete();
			System.out.println(oldFile+"");
			//System.out.println("D:\\workspace\\ckSchool\\WebContent\\upload\\"+fileName);
			ach.setApic("/static/upload/ach/"+newFile);
		}
		int row=achievementsService.updAchievementsEx(ach);
		return "redirect:/achievements/findAllAchievementsAndClass.action";
	}
	/**
	 * 删除操作
	 */
	@RequestMapping("achDel.action")
	public String achDel(ModelMap map,
			@RequestParam(required=false, value="aid") int aid){
		String pic=achievementsService.findAchievementsExById(aid).getApic();
		int row=achievementsService.delAchievementsEx(aid);
		if(row>0) {
			//删除旧图片
			File oldFile=new File("D:/workspace/ckSchool/WebContent"+pic);
			oldFile.delete();
			System.out.println(pic);
		}
		return "redirect:/achievements/findAllAchievementsAndClass.action";
	}
	/**
	 * 批量删除操作
	 */
	@RequestMapping("achAllDel.action")
	@ResponseBody
	public Map<String,String> achAllDel(@RequestParam(required=false, value="ids") String ids) {
		Map<String,String> map=new HashMap<>();
		String []s =ids.split(",");
		System.out.println("删除id："+Arrays.asList(s));
		List<String > list =Arrays.asList(s);
		List<Integer> aid=new ArrayList();
		List<String> pic=new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			int id=Integer.parseInt(list.get(i));
			aid.add(id);
			pic.add(achievementsService.findAchievementsExById(aid.get(i)).getApic());
		}
		int row=0;
		
		try {
			row=achievementsService.delAllAchievements(aid);
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
	@RequestMapping("findAchievementsAndClassByClass.action")
	public String findAchievementsAndClassByClass(ModelMap map,@RequestParam(required=false, value="tid") int tid) {
		if(tid==0) {
			return "redirect:/achievements/findAllAchievementsAndClass.action";
		}
		else {
			int n=0;
			List<AchievementsEx> findAchievementsExByTid = achievementsService.findAchievementsExByTid(tid);
			for (AchievementsEx achievementsEx : findAchievementsExByTid) {
				n=achievementsEx.getTid();
			}
			map.addAttribute("tid",n);
			map.addAttribute("tList",teacherService.findAllTeacher());
			map.addAttribute("aList",findAchievementsExByTid);
			return "user/ach-list";
		}
	}
	/**
	 * 时期查询
	 */
	@RequestMapping("findAchievementsAndClassByDate.action")
	public String findAchievementsAndClassByDate(ModelMap map,@RequestParam(required=false, value="adate") String adate) {
		map.addAttribute("tList",teacherService.findAllTeacher());
		map.addAttribute("aList",achievementsService.findAchievementsExByDate(adate));
		return "user/ach-list";
	}
	
	//index
	/**
	 * 查出所有
	 */
	@RequestMapping("findAllAchievements.action")
	public String findAllAchievements(ModelMap map,@RequestParam(value="currentPage",required=false,defaultValue="1") int currentPage){
		//设置分页
		PageHelper.startPage(currentPage,9);
		List list=achievementsService.findAllAchievements();
		//调动分页
		PageInfo pageInfo=new PageInfo(list);
		map.addAttribute("pageInfo",pageInfo);
		return "index/ach";
	}
	
	/**
	 * 查出首页展示
	 */
	@RequestMapping("findInAchievements.action")
	public String findInAchievements(ModelMap map){
		map.addAttribute("achievementsList",achievementsService.findInAchievements());
		return "index/ach";
	}
}
