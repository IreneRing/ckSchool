package ck.bean;

import java.util.List;

public class TeacherClass {
	private int tcid;
	private String tcclass;
	private List<Teacher> teacher;
	
	public List<Teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}
	public int getTcid() {
		return tcid;
	}
	public void setTcid(int tcid) {
		this.tcid = tcid;
	}
	public String getTcclass() {
		return tcclass;
	}
	public void setTcclass(String tcclass) {
		this.tcclass = tcclass;
	}
	
}
