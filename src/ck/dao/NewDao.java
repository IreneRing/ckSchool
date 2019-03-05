package ck.dao;

import java.util.List;

import ck.bean.NewsEx;

/**
 * 新聞操作类
 */
public interface NewDao {
	//查找所有
	List<NewsEx> findAllNew();
	//首页展示数目
	List<NewsEx> findInNew();
}
