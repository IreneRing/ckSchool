package ck.bean;

public class News {
	private int nid;
	private String nname;
	private String nmessage;
	private String ndate;
	private String npic;
	private int uid;
	private int ncid;
	
	
	public String getNpic() {
		return npic;
	}

	public void setNpic(String npic) {
		this.npic = npic;
	}

	public int getNcid() {
		return ncid;
	}

	public void setNcid(int ncid) {
		this.ncid = ncid;
	}

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String getNname() {
		return nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	public String getNmessage() {
		return nmessage;
	}

	public void setNmessage(String nmessage) {
		this.nmessage = nmessage;
	}

	public String getNdate() {
		return ndate;
	}

	public void setNdate(String ndate) {
		this.ndate = ndate;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "New [nid=" + nid + ", nname=" + nname + ", nmessage=" + nmessage + ", ndate=" + ndate + ", uid=" + uid
				+ "]";
	}

}
