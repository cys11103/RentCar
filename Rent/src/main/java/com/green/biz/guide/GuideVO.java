package com.green.biz.guide;

public class GuideVO {
	private int eseq;
	private String title;
	private String content;
	public int getEseq() {
		return eseq;
	}
	public void setEseq(int eseq) {
		this.eseq = eseq;
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
	@Override
	public String toString() {
		return "GuideVO [eseq=" + eseq + ", title=" + title + ", content=" + content + "]";
	}
	
}
