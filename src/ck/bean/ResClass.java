package ck.bean;

import java.util.List;

public class ResClass {
	private int rcid;
	private String rcclass;
	private List<Res> res;
	
	public List<Res> getRes() {
		return res;
	}
	public void setRes(List<Res> res) {
		this.res = res;
	}
	public int getRcid() {
		return rcid;
	}
	public void setRcid(int rcid) {
		this.rcid = rcid;
	}
	public String getRcclass() {
		return rcclass;
	}
	public void setRcclass(String rcclass) {
		this.rcclass = rcclass;
	}
}
