package ck.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ck.bean.NewsClass;

public interface NewClassService {
	//查询所有
	List<NewsClass> findNewsClassAndNew();
	//查询所有分类
	List<NewsClass> findAllNewClass();
	//查询分类
	NewsClass findNewClassById(int ncid);
	//添加
	int addNewClass(NewsClass newsClass);
	//修改
	int updNewClass(NewsClass newsClass);
	//删除
	int delNewClass(@Param("ncid") int ncid);
	//批量删除
	int delAllNewClass(List ncid);
	//驗證是否重名
	NewsClass findNewClassByName(String ncclass);
}
