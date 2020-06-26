package com.green.biz.insurance;

public class InsuranceVO {
	private int iseq;
	private String iname;
	private String age;
	private String exp;
	private String p1;
	private String p2;
	private String p3;
	private int price;
	public int getIseq() {
		return iseq;
	}
	public void setIseq(int iseq) {
		this.iseq = iseq;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getP1() {
		return p1;
	}
	public void setP1(String p1) {
		this.p1 = p1;
	}
	public String getP2() {
		return p2;
	}
	public void setP2(String p2) {
		this.p2 = p2;
	}
	public String getP3() {
		return p3;
	}
	public void setP3(String p3) {
		this.p3 = p3;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "InsuranceVO [iseq=" + iseq + ", iname=" + iname + ", age=" + age + ", exp=" + exp + ", p1=" + p1
				+ ", p2=" + p2 + ", p3=" + p3 + ", price=" + price + "]";
	}
	
}
