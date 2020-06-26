package com.green.biz.insurance.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.biz.insurance.InsuranceVO;

@Repository
public class InsuranceDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	
	public InsuranceVO getInsur(int iseq) {
		System.out.println("Mybatis로 getInsur 기능 처리");
		
		return mybatis.selectOne("InsuranceDAO.getInsur", iseq);
	}
}
