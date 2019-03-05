package ck.bean;

public class Res {
	private int rid;
	private String rname;
	private String rmassage;
	private String link;
	private String rdate;
	private int uid;
	private int rcid;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRmassage() {
		return rmassage;
	}

	public void setRmassage(String rmassage) {
		this.rmassage = rmassage;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getRcid() {
		return rcid;
	}

	public void setRcid(int rcid) {
		this.rcid = rcid;
	}

	@Override
	public String toString() {
		return "Resources [rid=" + rid + ", rname=" + rname + ", rmassage=" + rmassage + ", link=" + link + ", rdate="
				+ rdate + ", uid=" + uid + ", rcid=" + rcid + "]";
	}

}
