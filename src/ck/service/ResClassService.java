package ck.service;

import java.util.List;

import ck.bean.ResClass;

/**
 * 资源分类功能
 */

public interface ResClassService {
	//查询分类中的资源
	List<ResClass> findResClassAndRes();
}
