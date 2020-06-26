package com.green.biz.booking;

import java.util.Date;

//import org.springframework.format.annotation.DateTimeFormat;

public class BookingVO {
	private int bseq;
	private String id;
	private Date regdate;
	private int bdseq;
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	//private Date start_date;
	private String start_date;
	private String start_time;
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	//private Date end_date;
	private String end_date;
	private String end_time;
	private String doo;
	private String si;
	private int pseq;
	private String pname;
	private int iseq;
	private int gseq;
	private String license;
	public int getBseq() {
		return bseq;
	}
	public void setBseq(int bseq) {
		this.bseq = bseq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getBdseq() {
		return bdseq;
	}
	public void setBdseq(int bdseq) {
		this.bdseq = bdseq;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getDoo() {
		return doo;
	}
	public void setDoo(String doo) {
		this.doo = doo;
	}
	public String getSi() {
		return si;
	}
	public void setSi(String si) {
		this.si = si;
	}
	public int getPseq() {
		return pseq;
	}
	public void setPseq(int pseq) {
		this.pseq = pseq;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getIseq() {
		return iseq;
	}
	public void setIseq(int iseq) {
		this.iseq = iseq;
	}
	public int getGseq() {
		return gseq;
	}
	public void setGseq(int gseq) {
		this.gseq = gseq;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	@Override
	public String toString() {
		return "BookingVO [bseq=" + bseq + ", id=" + id + ", regdate=" + regdate + ", bdseq=" + bdseq + ", start_date="
				+ start_date + ", start_time=" + start_time + ", end_date=" + end_date + ", end_time=" + end_time
				+ ", doo=" + doo + ", si=" + si + ", pseq=" + pseq + ", pname=" + pname + ", iseq=" + iseq + ", gseq="
				+ gseq + ", license=" + license + "]";
	}
	
	
}
