package ck.dao;

import java.util.List;

import ck.bean.Case;

/**
 * 项目操作类
 */
public interface CaseDao {
	//查询所有
	List<Case> findAllCase();
	//首页展示
	List<Case> findInCase();
}
