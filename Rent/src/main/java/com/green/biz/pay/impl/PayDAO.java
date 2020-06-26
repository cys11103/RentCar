package com.green.biz.pay.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.green.biz.pay.PayVO;

@Repository
public class PayDAO {

	@Autowired
	SqlSessionTemplate mybtis;
	
	public void insertPay(PayVO vo) {
		System.out.println("Mybatis�� insertPay ��� ó��");
		
		mybtis.insert("PayDAO.insertPay", vo);
	}
	
	public PayVO getPayInfo(int gseq) {
		System.out.println("Mybatis��  getPayInfo ��� ó��");
		
		return mybtis.selectOne("PayDAO.getPayInfo", gseq);
	}
}
