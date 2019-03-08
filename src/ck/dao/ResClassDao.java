package ck.dao;

import java.util.List;

import ck.bean.ResClass;

public interface ResClassDao {
	//查询分类中的资源
	List<ResClass> findResClassAndRes();
}
