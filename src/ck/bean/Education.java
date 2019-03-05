package ck.bean;

public class Education {
	private int eid;
	private String ename;
	private String emessage;
	private String edate;
	private String epic;
	private int uid;
	private int ecid;
	
	public int getEcid() {
		return ecid;
	}
	public void setEcid(int ecid) {
		this.ecid = ecid;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmessage() {
		return emessage;
	}
	public void setEmessage(String emessage) {
		this.emessage = emessage;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getEpic() {
		return epic;
	}
	public void setEpic(String epic) {
		this.epic = epic;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "Education [eid=" + eid + ", ename=" + ename + ", emassage=" + emessage + ", edate=" + edate + ", epic="
				+ epic + ", uid=" + uid + "]";
	}
	
}
