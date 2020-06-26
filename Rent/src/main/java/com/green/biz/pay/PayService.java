package com.green.biz.pay;

public interface PayService {

	public void insertPay(PayVO vo);
	
	public PayVO getPayInfo(int gseq);
}
