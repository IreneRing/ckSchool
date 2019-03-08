package ck.bean;

import java.util.List;

public class CaseClass {
	private int ccid;
	private String ccclass;
	private List<Case> caseList;
	public int getCcid() {
		return ccid;
	}
	public void setCcid(int ccid) {
		this.ccid = ccid;
	}
	public String getCcclass() {
		return ccclass;
	}
	public void setCcclass(String ccclass) {
		this.ccclass = ccclass;
	}
	public List<Case> getCaseList() {
		return caseList;
	}
	public void setCaseList(List<Case> caseList) {
		this.caseList = caseList;
	}	
	
}
