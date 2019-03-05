package ck.bean;

public class Achievements {
	private int aid;
	private String aname;
	private String amessage;
	private String adate;
	private String apic;
	private int uid;
	private int tid;
	
	
	public String getApic() {
		return apic;
	}
	public void setApic(String apic) {
		this.apic = apic;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAmessage() {
		return amessage;
	}
	public void setAmessage(String amessage) {
		this.amessage = amessage;
	}
	public String getAdate() {
		return adate;
	}
	public void setAdate(String adate) {
		this.adate = adate;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "Achievements [aid=" + aid + ", aname=" + aname + ", amessage=" + amessage + ", adate=" + adate
				+ ", uid=" + uid + ", tid=" + tid + "]";
	}
	
}
