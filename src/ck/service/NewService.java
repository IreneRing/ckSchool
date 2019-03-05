package ck.service;

import java.util.List;

import ck.bean.NewsEx;

/**
 * 新聞功能
 */
public interface NewService {
	//查找所有
	List<NewsEx> findAllNew();
	//首页展示数目
	List<NewsEx> findInNew();
}
