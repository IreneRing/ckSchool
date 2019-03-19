package ck.bean;

import java.util.List;

public class EducationClass {
	private int ecid;
	private String	ecclass;
	private List<Education> education;
	
	public List<Education> getEducation() {
		return education;
	}
	public void setEducation(List<Education> education) {
		this.education = education;
	}
	public int getEcid() {
		return ecid;
	}
	public void setEcid(int ecid) {
		this.ecid = ecid;
	}
	public String getEcclass() {
		return ecclass;
	}
	public void setEcclass(String ecclass) {
		this.ecclass = ecclass;
	}
	
}
