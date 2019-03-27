package ck.bean;

import java.util.List;

public class NewsClass {
	private int ncid;
	private String ncclass;
	private List<News> news;
	
	
	
	public List<News> getNews() {
		return news;
	}
	public void setNews(List<News> news) {
		this.news = news;
	}
	public int getNcid() {
		return ncid;
	}
	public void setNcid(int ncid) {
		this.ncid = ncid;
	}
	public String getNcclass() {
		return ncclass;
	}
	public void setNcclass(String ncclass) {
		this.ncclass = ncclass;
	}
	
}
