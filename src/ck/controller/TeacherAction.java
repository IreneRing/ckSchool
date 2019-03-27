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
import ck.bean.Teacher;
import ck.bean.TeacherEx;
import ck.service.TeacherClassService;
import ck.service.TeacherService;

/**
 * teacher+class控制器
 */
@Controller
@RequestMapping("tea")
public class TeacherAction {
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private	TeacherClassService	teacherClassService;
	
	//user
	
	
	/**
	 * 查出所有list
	 * 
	 */
	@RequestMapping("findAllTeacherAndClass.action")
	public String findAllTeacherAndClass(ModelMap map) {
		map.addAttribute("tcList",teacherClassService.findAllTeacherClass());
		map.addAttribute("tList",teacherService.findAllTeacher());
		return "user/tea-list";
	}
	/**
	 * 添加内容
	 */
	@RequestMapping("teaPreAdd.action")
	public String teaPreAdd(ModelMap map){
		map.addAttribute("tcList",teacherClassService.findAllTeacherClass());
		return "user/tea-add";
	}
	/**
	 * 添加操作
	 */
	@RequestMapping(value="teaAdd.action",method={RequestMethod.POST})
	public String teaAdd(HttpServletRequest request,Teacher tea,
			@RequestParam(value="file",required=false) MultipartFile file)throws IOException{
		File destParentPath=new File("D:/workspace/ckSchool/WebContent/static/upload/tea");
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
			tea.setTpic("/static/upload/tea/"+newFile);
		}
		int row=teacherService.addTeacherEx(tea);
		return "redirect:/tea/findAllTeacherAndClass.action";
	}
	/**
	 * 编辑内容
	 */
	@RequestMapping("teaPreUpd.action")
	public String teaPreUpd(ModelMap map,
			@RequestParam(required=false, value="tid") int tid){
		map.addAttribute("tcList",teacherClassService.findAllTeacherClass());
		map.addAttribute("tList",teacherService.findTeacherExById(tid));
		return "user/tea-upd";
	}
	/**
	 * 编辑操作
	 */
	@RequestMapping(value="teaUpd.action",method={RequestMethod.POST})
	public String teaUpd(HttpServletRequest request,Teacher tea,
			@RequestParam(value="newFile",required=false) MultipartFile file)throws IOException{
		
		File destParentPath=new File("D:/workspace/ckSchool/WebContent/static/upload/tea");
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
			File oldFile=new File("D:/workspace/ckSchool/WebContent"+tea.getTpic());
			oldFile.delete();
			System.out.println(oldFile+"");
			//System.out.println("D:\\workspace\\ckSchool\\WebContent\\upload\\"+fileName);
			tea.setTpic("/static/upload/tea/"+newFile);
		}
		int row=teacherService.updTeacherEx(tea);
		return "redirect:/tea/findAllTeacherAndClass.action";
	}
	/**
	 * 删除操作
	 */
	@RequestMapping("teaDel.action")
	public String teaDel(ModelMap map,
			@RequestParam(required=false, value="tid") int tid){
		String pic=teacherService.findTeacherExById(tid).getTpic();
		int row=teacherService.delTeacherEx(tid);
		if(row>0) {
			//删除旧图片
			File oldFile=new File("D:/workspace/ckSchool/WebContent"+pic);
			oldFile.delete();
			System.out.println(pic);
		}
		return "redirect:/tea/findAllTeacherAndClass.action";
	}
	/**
	 * 批量删除操作
	 */
	@RequestMapping("teaAllDel.action")
	@ResponseBody
	public Map<String,String> teaAllDel(@RequestParam(required=false, value="ids") String ids) {
		Map<String,String> map=new HashMap<>();
		String []s =ids.split(",");
		System.out.println("删除id："+Arrays.asList(s));
		List<String > list =Arrays.asList(s);
		List<Integer> tid=new ArrayList();
		List<String> pic=new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			int id=Integer.parseInt(list.get(i));
			tid.add(id);
			pic.add(teacherService.findTeacherExById(tid.get(i)).getTpic());
		}
		int row=0;
		
		try {
			row=teacherService.delAllTeacher(tid);
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
	@RequestMapping("findTeacherAndClassByClass.action")
	public String findTeacherAndClassByClass(ModelMap map,@RequestParam(required=false, value="tcid") int tcid) {
		if(tcid==0) {
			return "redirect:/tea/findAllTeacherAndClass.action";
		}
		else {
			int n=0;
			List<TeacherEx> findTeacherExByClass = teacherService.findTeacherExByClass(tcid);
			for (TeacherEx teacherEx : findTeacherExByClass) {
				n=teacherEx.getTcid();
			}
			map.addAttribute("tcid",n);
			map.addAttribute("tcList",teacherClassService.findAllTeacherClass());
			map.addAttribute("tList",findTeacherExByClass);
			return "user/tea-list";
		}
	}
	/**
	 * 时期查询
	 */
	@RequestMapping("findTeacherAndClassByDate.action")
	public String findTeacherAndClassByDate(ModelMap map,@RequestParam(required=false, value="tdate") String tdate) {
		map.addAttribute("tcList",teacherClassService.findAllTeacherClass());
		map.addAttribute("tList",teacherService.findTeacherExByDate(tdate));
		return "user/tea-list";
	}
	
	
	//index
	/**
	 * 查出所有
	 */
	@RequestMapping("findAllTeacher.action")
	public String findAllTeacher(ModelMap map,@RequestParam(value="currentPage",required=false,defaultValue="1") int currentPage){
		//设置分页
		PageHelper.startPage(currentPage,6);
		List list=teacherService.findAllTeacher();
		//调动分页
		PageInfo pageInfo=new PageInfo(list);
		//分类
		map.addAttribute("tcList",teacherClassService.findAllTeacherClass());
		map.addAttribute("pageInfo",pageInfo);
		return "index/teacher";
	}
	
	/**
	 * 查出首页展示
	 */
	@RequestMapping("findInTeacher.action")
	public String findInTeacher(ModelMap map){
		map.addAttribute("teaList",teacherService.findInTeacher());
		return "index/teacher";
	}
}
