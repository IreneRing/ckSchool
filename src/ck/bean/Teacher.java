package ck.bean;

public class Teacher {
	private int tid;
	private String tname;
	private String ttitle;
	private String tdate;
	private String tpic;
	private String temail;
	private String tqq;
	private String tphone;
	private String tcid;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTtitle() {
		return ttitle;
	}
	public void setTtitle(String ttitle) {
		this.ttitle = ttitle;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
	public String getTpic() {
		return tpic;
	}
	public void setTpic(String tpic) {
		this.tpic = tpic;
	}
	public String getTemail() {
		return temail;
	}
	public void setTemail(String temail) {
		this.temail = temail;
	}
	public String getTqq() {
		return tqq;
	}
	public void setTqq(String tqq) {
		this.tqq = tqq;
	}
	public String getTphone() {
		return tphone;
	}
	public void setTphone(String tphone) {
		this.tphone = tphone;
	}
	public String getTcid() {
		return tcid;
	}
	public void setTcid(String tcid) {
		this.tcid = tcid;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", ttitle=" + ttitle + ", tdate=" + tdate + ", tpic=" + tpic
				+ ", temail=" + temail + ", tqq=" + tqq + ", tphone=" + tphone + ", tcid=" + tcid + "]";
	}
	
}
