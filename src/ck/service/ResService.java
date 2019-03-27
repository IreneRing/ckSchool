package ck.service;
/**
 * 资源功能
 */

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ck.bean.Res;
import ck.bean.ResEx;

public interface ResService {
	//查出所有
	List<ResEx> findAllRes();
	//按種類查找資源
	List<ResEx> findResBySort(@Param("rcid") int rcid);
	//id查找
	ResEx findResExById(@Param("rid") int rid);
	//添加
	int addResEx(Res res);
	//修改
	int updResEx(Res res);
	//删除
	int delResEx(@Param("rid") int rid);
	//批量删除
	int delAllRes(List rid);
	//按分类查询
	List<ResEx> findResExByClass(@Param("rcid") int rcid);
	//按日期查询
	List<ResEx> findResExByDate(@Param("rdate") String rdate);
}
