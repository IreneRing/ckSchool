package ck.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ck.bean.Case;
import ck.bean.CaseEx;

/**
 * 项目操作类
 */
public interface CaseDao {
	//查询所有
	List<Case> findAllCase();
	//首页展示
	List<Case> findInCase();
	//查询所有
	List<CaseEx> findAllCaseEx();
	//id查找
	CaseEx findCaseExById(@Param("cid") int cid);
	//添加
	int addCaseEx(Case c);
	//修改
	int updCaseEx(Case c);
	//删除
	int delCaseEx(@Param("cid") int cid);
	//批量删除
	int delAllCase(List cid);
	//按分类查询
	List<CaseEx> findCaseExByClass(@Param("ccid") int ccid);
	//按日期查询
	List<CaseEx> findCaseExByDate(@Param("cdate") String cdate);
}
