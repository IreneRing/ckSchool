package ck.controller;
/**
 * 资源控制器
 */

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
import ck.bean.Res;
import ck.bean.ResEx;
import ck.service.ResClassService;
import ck.service.ResService;
@Controller
@RequestMapping("res")
public class ResAction {
	@Autowired
	private ResService resService;
	@Autowired
	private ResClassService resClassService;
	
	//user
	
	
	/**
	 * 查出所有list
	 * 
	 */
	@RequestMapping("findAllResAndClass.action")
	public String findAllResAndClass(ModelMap map) {
		map.addAttribute("rcList",resClassService.findAllResClass());
		map.addAttribute("rList",resService.findAllRes());
		return "user/res-list";
	}
	/**
	 * 添加内容
	 */
	@RequestMapping("resPreAdd.action")
	public String resPreAdd(ModelMap map){
		map.addAttribute("rcList",resClassService.findAllResClass());
		return "user/res-add";
	}
	/**
	 * 添加操作
	 */
	@RequestMapping(value="resAdd.action",method={RequestMethod.POST})
	public String resAdd(HttpServletRequest request,Res res,
			@RequestParam(value="file",required=false) MultipartFile file)throws IOException{
		File destParentPath=new File("D:/workspace/ckSchool/WebContent/static/upload/res");
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
			res.setLink("/static/upload/res/"+newFile);
		}
		int row=resService.addResEx(res);
		return "redirect:/res/findAllResAndClass.action";
	}
	/**
	 * 编辑内容
	 */
	@RequestMapping("resPreUpd.action")
	public String resPreUpd(ModelMap map,
			@RequestParam(required=false, value="rid") int rid){
		map.addAttribute("rcList",resClassService.findAllResClass());
		map.addAttribute("rList",resService.findResExById(rid));
		return "user/res-upd";
	}
	/**
	 * 编辑操作
	 */
	@RequestMapping(value="resUpd.action",method={RequestMethod.POST})
	public String resUpd(HttpServletRequest request,Res res,
			@RequestParam(value="newFile",required=false) MultipartFile file)throws IOException{
		
		File destParentPath=new File("D:/workspace/ckSchool/WebContent/static/upload/res");
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
			File oldFile=new File("D:/workspace/ckSchool/WebContent"+res.getLink());
			oldFile.delete();
			System.out.println(oldFile+"");
			//System.out.println("D:\\workspace\\ckSchool\\WebContent\\upload\\"+fileName);
			res.setLink("/static/upload/res/"+newFile);
		}
		int row=resService.updResEx(res);
		return "redirect:/res/findAllResAndClass.action";
	}
	/**
	 * 删除操作
	 */
	@RequestMapping("resDel.action")
	public String resDel(ModelMap map,
			@RequestParam(required=false, value="rid") int rid){
		String pic=resService.findResExById(rid).getLink();
		int row=resService.delResEx(rid);
		
		if(row>0) {
			//删除旧图片
			File oldFile=new File("D:/workspace/ckSchool/WebContent"+pic);
			oldFile.delete();
			System.out.println(pic);
		}
		return "redirect:/res/findAllResAndClass.action";
	}
	/**
	 * 批量删除操作
	 */
	@RequestMapping("resAllDel.action")
	@ResponseBody
	public Map<String,String> resAllDel(@RequestParam(required=false, value="ids") String ids) {
		Map<String,String> map=new HashMap<>();
		String []s =ids.split(",");
		System.out.println("删除id："+Arrays.asList(s));
		List<String > list =Arrays.asList(s);
		List<Integer> rid=new ArrayList();
		List<String> pic=new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			int id=Integer.parseInt(list.get(i));
			rid.add(id);
			pic.add(resService.findResExById(rid.get(i)).getLink());
		}
		int row=0;
		
		try {
			row = resService.delAllRes(rid);
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
	@RequestMapping("findResAndClassByClass.action")
	public String findResAndClassByClass(ModelMap map,@RequestParam(required=false, value="rcid") int rcid) {
		if(rcid==0) {
			return "redirect:/res/findAllResAndClass.action";
		}
		else {
			int n=0;
			List<ResEx> findResExByClass = resService.findResExByClass(rcid);
			for (ResEx resEx : findResExByClass) {
				n=resEx.getRcid();
			}
			map.addAttribute("rcid",n);
			map.addAttribute("rcList",resClassService.findAllResClass());
			map.addAttribute("rList",findResExByClass);
			return "user/res-list";
		}
	}
	/**
	 * 时期查询
	 */
	@RequestMapping("findResAndClassByDate.action")
	public String findResAndClassByDate(ModelMap map,@RequestParam(required=false, value="rdate") String rdate) {
		map.addAttribute("rcList",resClassService.findAllResClass());
		map.addAttribute("rList",resService.findResExByDate(rdate));
		return "user/res-list";
	}
	
	
	//index
	/**
	 * 按照种类查询
	 * @return
	 */
	@RequestMapping("findResBySort.action")
	public String findResBySort(ModelMap map,@RequestParam(required=false, value="rcid") int rcid) {
		
		return null;
	}
	/**
	 * 查出所有
	 */
	@RequestMapping("findAllRes.action")
	public String findAllRes(ModelMap map,@RequestParam(value="currentPage",required=false,defaultValue="1") int currentPage){
		//设置分页
		PageHelper.startPage(currentPage,6);
		//分类
		List list=resClassService.findResClassAndRes();
		//调动分页
		PageInfo pageInfo=new PageInfo(list);
		map.addAttribute("pageInfo",pageInfo);
		return "index/res";
	}
}
