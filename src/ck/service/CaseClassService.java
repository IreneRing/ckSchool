package ck.service;

import java.util.List;

import ck.bean.CaseClass;
/**
 * 项目分类功能
 */
public interface CaseClassService {
	//查询所有分类
	List<CaseClass> findAllCaseClass();
}
