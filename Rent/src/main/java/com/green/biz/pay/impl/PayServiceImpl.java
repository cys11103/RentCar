package com.green.biz.pay.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.biz.pay.PayService;
import com.green.biz.pay.PayVO;

@Service("payService")
public class PayServiceImpl implements PayService {

	@Autowired
	PayDAO pDao;
	
	@Override
	public void insertPay(PayVO vo) {
		
		pDao.insertPay(vo);
	}

	@Override
	public PayVO getPayInfo(int gseq) {
		
		return pDao.getPayInfo(gseq);
	}

}
