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

import ck.bean.EducationEx;
import ck.bean.News;
import ck.bean.NewsEx;
import ck.service.NewClassService;
import ck.service.NewService;

/**
 * 新聞控制器
 */
@Controller
@RequestMapping("new")
public class NewAction {
	@Autowired
	private NewService newService;
	@Autowired
	private NewClassService newClassService;
	
	//user
	/**
	 * 查出所有list
	 * 
	 */
	@RequestMapping("findAllNewsAndClass.action")
	public String findAllNewsAndClass(ModelMap map) {
		map.addAttribute("ncList",newClassService.findAllNewClass());
		map.addAttribute("nList",newService.findAllNew());
		return "user/new-list";
	}
	/**
	 * 添加内容
	 */
	@RequestMapping("newsPreAdd.action")
	public String newsPreAdd(ModelMap map){
		map.addAttribute("ncList",newClassService.findAllNewClass());
		return "user/new-add";
	}
	/**
	 * 添加操作
	 */
	@RequestMapping(value="newsAdd.action",method={RequestMethod.POST})
	public String newsAdd(HttpServletRequest request,News news,
			@RequestParam(value="file",required=false) MultipartFile file)throws IOException{
		File destParentPath=new File("D:/workspace/ckSchool/WebContent/static/upload/new");
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
			news.setNpic("/static/upload/new/"+newFile);
		}
		int row=newService.addNewsEx(news);
		return "redirect:/new/findAllNewsAndClass.action";
	}
	/**
	 * 编辑内容
	 */
	@RequestMapping("newsPreUpd.action")
	public String newsPreUpd(ModelMap map,
			@RequestParam(required=false, value="nid") int nid){
		map.addAttribute("ncList",newClassService.findAllNewClass());
		map.addAttribute("nList",newService.findNewsExById(nid));
		return "user/new-upd";
	}
	/**
	 * 编辑操作
	 */
	@RequestMapping(value="newsUpd.action",method={RequestMethod.POST})
	public String newsUpd(HttpServletRequest request,ModelMap map,News news,
			@RequestParam(value="newFile",required=false) MultipartFile file)throws IOException{
		File destParentPath=new File("D:/workspace/ckSchool/WebContent/static/upload/new");
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
			File oldFile=new File("D:/workspace/ckSchool/WebContent"+news.getNpic());
			oldFile.delete();
			System.out.println(oldFile+"");
			//System.out.println("D:\\workspace\\ckSchool\\WebContent\\upload\\"+fileName);
			news.setNpic("/static/upload/new/"+newFile);
		}
		
		int row=newService.updNewsEx(news);
		return "redirect:/new/findAllNewsAndClass.action";
	}
	/**
	 * 删除操作
	 */
	@RequestMapping("newsDel.action")
	public String newsDel(ModelMap map,
			@RequestParam(required=false, value="nid") int nid){
		String pic=newService.findNewsExById(nid).getNpic();
		int row=newService.delNewsEx(nid);
		if(row>0) {
			//删除旧图片
			File oldFile=new File("D:/workspace/ckSchool/WebContent"+pic);
			oldFile.delete();
			System.out.println(pic);
		}
		return "redirect:/new/findAllNewsAndClass.action";
	}
	/**
	 * 批量删除操作
	 */
	@RequestMapping("newsAllDel.action")
	@ResponseBody
	public Map<String,String> newsAllDel(@RequestParam(required=false, value="ids") String ids) {
		Map<String,String> map=new HashMap<>();
		String []s =ids.split(",");
		System.out.println("删除id："+Arrays.asList(s));
		List<String > list =Arrays.asList(s);
		List<Integer> nid=new ArrayList();
		List<String> pic=new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			int id=Integer.parseInt(list.get(i));
			nid.add(id);
			pic.add(newService.findNewsExById(nid.get(i)).getNpic());
		}
		int row=0;
		
		try {
			row=newService.delAllNews(nid);
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
	@RequestMapping("findNewsAndClassByClass.action")
	public String findNewsAndClassByClass(ModelMap map,@RequestParam(required=false, value="ncid") int ncid) {
		if(ncid==0) {
			return "redirect:/new/findAllNewsAndClass.action";
		}
		else {
			int n=0;
			List<NewsEx> findNewsExByClass = newService.findNewsExByClass(ncid);
			for (NewsEx newsEx : findNewsExByClass) {
				n=newsEx.getNcid();
			}
			map.addAttribute("ncid",n);
			map.addAttribute("ncList",newClassService.findAllNewClass());
			map.addAttribute("nList",findNewsExByClass);
			return "user/new-list";
		}
	}
	/**
	 * 时期查询
	 */
	@RequestMapping("findNewsAndClassByDate.action")
	public String findNewsAndClassByDate(ModelMap map,@RequestParam(required=false, value="ndate") String ndate) {
		map.addAttribute("ncList",newClassService.findAllNewClass());
		map.addAttribute("nList",newService.findNewsExByDate(ndate));
		return "user/new-list";
	}
	
	
	//index
	/**
	 * 查出所有
	 */
	@RequestMapping("findAllNew.action")
	public String findAllNew(ModelMap map,@RequestParam(value="currentPage",required=false,defaultValue="1") int currentPage){
		//设置分页
		PageHelper.startPage(currentPage,4);
		List list=newService.findAllNew();
		//调动分页
		PageInfo pageInfo=new PageInfo(list);
		map.addAttribute("pageInfo",pageInfo);
		return "index/new";
	}
	
	/**
	 * 查出首页展示
	 */
	@RequestMapping("findInNew.action")
	public String findInNew(ModelMap map){
		map.addAttribute("newList",newService.findInNew());
		return "index/new";
	}
}
