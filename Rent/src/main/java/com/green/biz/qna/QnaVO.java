package com.green.biz.qna;

import java.util.Date;

public class QnaVO {
	private int qseq;
	private String title;
	private String content;
	private String reply;
	private String id;
	private String rep_yn;
	private Date indate;
	public int getQseq() {
		return qseq;
	}
	public void setQseq(int qseq) {
		this.qseq = qseq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRep_yn() {
		return rep_yn;
	}
	public void setRep_yn(String rep_yn) {
		this.rep_yn = rep_yn;
	}
	public Date getIndate() {
		return indate;
	}
	public void setIndate(Date indate) {
		this.indate = indate;
	}
	@Override
	public String toString() {
		return "QnaVO [qseq=" + qseq + ", title=" + title + ", content=" + content + ", reply=" + reply + ", id=" + id
				+ ", rep_yn=" + rep_yn + ", indate=" + indate + "]";
	}
	
	
}
