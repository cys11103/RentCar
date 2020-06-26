package com.green.biz.car;

import java.util.Date;

public class CarVO {
	private int pseq;
	private String kind1;
	private String kind2;
	private String pname;
	private int price;
	private String image;
	private Date regdate;
	private String info1;
	private String info2;
	private String doo;
	private String si;
	private int iseq;
	private String license;
	public int getPseq() {
		return pseq;
	}
	public void setPseq(int pseq) {
		this.pseq = pseq;
	}
	public String getKind1() {
		return kind1;
	}
	public void setKind1(String kind1) {
		this.kind1 = kind1;
	}
	public String getKind2() {
		return kind2;
	}
	public void setKind2(String kind2) {
		this.kind2 = kind2;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getInfo1() {
		return info1;
	}
	public void setInfo1(String info1) {
		this.info1 = info1;
	}
	public String getInfo2() {
		return info2;
	}
	public void setInfo2(String info2) {
		this.info2 = info2;
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
	public int getIseq() {
		return iseq;
	}
	public void setIseq(int iseq) {
		this.iseq = iseq;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	@Override
	public String toString() {
		return "CarVO [pseq=" + pseq + ", kind1=" + kind1 + ", kind2=" + kind2 + ", pname=" + pname + ", price=" + price
				+ ", image=" + image + ", regdate=" + regdate + ", info1=" + info1 + ", info2=" + info2 + ", doo=" + doo
				+ ", si=" + si + ", iseq=" + iseq + ", license=" + license + "]";
	}
	
	
}
