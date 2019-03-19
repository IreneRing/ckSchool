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
			@RequestParam(value="file") MultipartFile[] partFiles)throws IOException{
		for(MultipartFile partFile:partFiles)
		{
			if(!partFile.isEmpty())//file不为空
			{
				//设置服务端上传文件的目录
				//  /uploadfile
				String uploadfilePath=request.getServletContext().getRealPath("/static/upload/edu");
				
				System.out.println("上传文件目录="+uploadfilePath);
				
				//获取上传文件名
				String fileName=UUID.randomUUID().toString().replaceAll("-","")+"."+partFile.getOriginalFilename();
				//新建File对象，作为目标文件对象
				//  路径名/fileName
				File destFile=new File(uploadfilePath+File.separator+fileName);
				//判断这个file是否存在
				if(!destFile.exists())
				{
					destFile.createNewFile();//不存在则重新创建
				}
				//当file存在，那么将这个file写入硬盘
				partFile.transferTo(destFile);
				System.out.println(destFile+"");
				
				//System.out.println("D:\\workspace\\ckSchool\\WebContent\\upload\\"+fileName);
				edu.setEpic("static/upload/edu/"+fileName);
			}
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
	public String eduUpd(HttpServletRequest request,ModelMap map,Education edu,
			@RequestParam(value="newFile") MultipartFile newFile)throws IOException{
		if(!newFile.isEmpty())//file不为空
		{
			//设置服务端上传文件的目录
			//  /uploadfile
			String uploadfilePath=request.getServletContext().getRealPath("/static/upload/edu");
			
			System.out.println("上传文件目录="+uploadfilePath);
			
			//获取上传文件名
			String fileName=UUID.randomUUID().toString().replaceAll("-","")+"."+newFile.getOriginalFilename();
			//新建File对象，作为目标文件对象
			//  路径名/fileName
			File destFile=new File(uploadfilePath+File.separator+fileName);
			//判断这个file是否存在
			if(!destFile.exists())
			{
				destFile.createNewFile();//不存在则重新创建
			}
			//当file存在，那么将这个file写入硬盘
			newFile.transferTo(destFile);
			System.out.println(destFile+"");
			
			//System.out.println("D:\\workspace\\ckSchool\\WebContent\\upload\\"+fileName);
			edu.setEpic("static/upload/edu/"+fileName);
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
		int row=educationService.delEducationEx(eid);
		System.out.println("1111111111111");
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
		for (String string : list) {
			int id=Integer.parseInt(string);
			eid.add(id);
		}
		try {
			educationService.delAllEducation(eid);
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
