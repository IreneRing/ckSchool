package ck.bean;

public class Case {
	private int cid;
	private String cname;
	private String sort;
	private String members;
	private String cmessage;
	private String cdate;
	private int tid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getMembers() {
		return members;
	}
	public void setMembers(String members) {
		this.members = members;
	}
	public String getCmessage() {
		return cmessage;
	}
	public void setCmessage(String cmessage) {
		this.cmessage = cmessage;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "Case [cid=" + cid + ", cname=" + cname + ", sort=" + sort + ", members=" + members + ", cmessage="
				+ cmessage + ", cdate=" + cdate + ", tid=" + tid + "]";
	}
	
}
