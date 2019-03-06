package ck.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ck.bean.ResEx;

/**
 * 资源操作类
 */
public interface ResDao {
	//查出所有
	List<ResEx> findAllRes();
	//按種類查找資源
	List<ResEx> findResBySort(@Param("rcid") int rcid);
}
