package com.green.biz.pay;

public class PayVO {
	private int gseq;
	private int gtotal;
	private String card_type;
	private String card_name;
	private int cardNum1;
	private int cardNum2;
	private int cardNum3;
	private int cardNum4;
	private int validY;
	private int validM;
	private int cardPwd;
	private int birth_first;
	public int getGseq() {
		return gseq;
	}
	public void setGseq(int gseq) {
		this.gseq = gseq;
	}
	public int getGtotal() {
		return gtotal;
	}
	public void setGtotal(int gtotal) {
		this.gtotal = gtotal;
	}
	public String getCard_type() {
		return card_type;
	}
	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}
	public String getCard_name() {
		return card_name;
	}
	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}
	public int getCardNum1() {
		return cardNum1;
	}
	public void setCardNum1(int cardNum1) {
		this.cardNum1 = cardNum1;
	}
	public int getCardNum2() {
		return cardNum2;
	}
	public void setCardNum2(int cardNum2) {
		this.cardNum2 = cardNum2;
	}
	public int getCardNum3() {
		return cardNum3;
	}
	public void setCardNum3(int cardNum3) {
		this.cardNum3 = cardNum3;
	}
	public int getCardNum4() {
		return cardNum4;
	}
	public void setCardNum4(int cardNum4) {
		this.cardNum4 = cardNum4;
	}
	public int getValidY() {
		return validY;
	}
	public void setValidY(int validY) {
		this.validY = validY;
	}
	public int getValidM() {
		return validM;
	}
	public void setValidM(int validM) {
		this.validM = validM;
	}
	public int getCardPwd() {
		return cardPwd;
	}
	public void setCardPwd(int cardPwd) {
		this.cardPwd = cardPwd;
	}
	public int getBirth_first() {
		return birth_first;
	}
	public void setBirth_first(int birth_first) {
		this.birth_first = birth_first;
	}
	@Override
	public String toString() {
		return "PayVO [gseq=" + gseq + ", gtotal=" + gtotal + ", card_type=" + card_type + ", card_name=" + card_name
				+ ", cardNum1=" + cardNum1 + ", cardNum2=" + cardNum2 + ", cardNum3=" + cardNum3 + ", cardNum4="
				+ cardNum4 + ", validY=" + validY + ", validM=" + validM + ", cardPwd=" + cardPwd + ", birth_first="
				+ birth_first + "]";
	}
	
}
