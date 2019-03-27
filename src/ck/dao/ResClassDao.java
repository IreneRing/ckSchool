package ck.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ck.bean.ResClass;

public interface ResClassDao {
	//查询分类中的资源
	List<ResClass> findResClassAndRes();
	//查询所有分类
	List<ResClass> findAllResClass();
	//查询分类
	ResClass findResClassById(int rcid);
	//添加
	int addResClass(ResClass resClass);
	//修改
	int updResClass(ResClass resClass);
	//删除
	int delResClass(@Param("rcid") int rcid);
	//批量删除
	int delAllResClass(List rcid);
	//驗證是否重名
	ResClass findResClassByName(String rcclass);
}
