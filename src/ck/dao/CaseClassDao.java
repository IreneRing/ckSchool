package ck.dao;

import java.util.List;

import ck.bean.CaseClass;

public interface CaseClassDao {
	//查询所有分类
	List<CaseClass> findAllCaseClass();
	//查询所有分类和案例
	List<CaseClass> findAllCaseAndClass();
}
