package ck.service;
/**
 * 资源功能
 */

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ck.bean.ResEx;

public interface ResService {
	//查出所有
	List<ResEx> findAllRes();
	//按種類查找資源
	List<ResEx> findResBySort(@Param("rcid") int rcid);
}
