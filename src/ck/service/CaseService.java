package ck.service;

import java.util.List;

import ck.bean.Case;

/**
 * 项目功能
 */
public interface CaseService {
	//查询所有
	List<Case> findAllCase();
	//首页展示
	List<Case> findInCase();
}
