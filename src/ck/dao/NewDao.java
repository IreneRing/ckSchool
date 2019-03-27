package ck.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ck.bean.Education;
import ck.bean.EducationEx;
import ck.bean.News;
import ck.bean.NewsEx;

/**
 * 新聞操作类
 */
public interface NewDao {
	//查找所有
	List<NewsEx> findAllNew();
	//首页展示数目
	List<NewsEx> findInNew();
	//id查找
	NewsEx findNewsExById(@Param("nid") int nid);
	//添加
	int addNewsEx(News news);
	//修改
	int updNewsEx(News news);
	//删除
	int delNewsEx(@Param("nid") int nid);
	//批量删除
	int delAllNews(List nid);
	//按分类查询
	List<NewsEx> findNewsExByClass(@Param("ncid") int ncid);
	//按日期查询
	List<NewsEx> findNewsExByDate(@Param("ndate") String ndate);
}
