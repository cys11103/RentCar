package com.green.biz.review;

import java.util.Date;


public class ReviewVO {
	private int rseq;
	private int score;
	private float avg_score;
	private String id;
	private Date indate;
	private int pseq;
	private String pname;
	private String content;
	private String image;
	public int getRseq() {
		return rseq;
	}
	public void setRseq(int rseq) {
		this.rseq = rseq;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public float getAvg_score() {
		return avg_score;
	}
	public void setAvg_score(float avg_score) {
		this.avg_score = avg_score;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getIndate() {
		return indate;
	}
	public void setIndate(Date indate) {
		this.indate = indate;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "ReviewVO [rseq=" + rseq + ", score=" + score + ", avg_score=" + avg_score + ", id=" + id + ", indate="
				+ indate + ", pseq=" + pseq + ", pname=" + pname + ", content=" + content + ", image=" + image + "]";
	}
	
}
