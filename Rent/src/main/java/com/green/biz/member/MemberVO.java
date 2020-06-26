package com.green.biz.member;

public class MemberVO {
	private String id;
	private String pwd;
	private String name;
	private String birth;
	private String ename1;
	private String ename2;
	private String phone;
	private String email;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEname1() {
		return ename1;
	}
	public void setEname1(String ename1) {
		this.ename1 = ename1;
	}
	public String getEname2() {
		return ename2;
	}
	public void setEname2(String ename2) {
		this.ename2 = ename2;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", birth=" + birth + ", ename1=" + ename1
				+ ", ename2=" + ename2 + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
}
