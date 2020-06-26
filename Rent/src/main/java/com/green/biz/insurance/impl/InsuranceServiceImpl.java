package com.green.biz.insurance.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.biz.insurance.InsuranceService;
import com.green.biz.insurance.InsuranceVO;

@Service("insuranceService")
public class InsuranceServiceImpl implements InsuranceService {

	@Autowired
	InsuranceDAO iDao;
	
	@Override
	public InsuranceVO getInsur(int iseq) {
		
		return iDao.getInsur(iseq);
	}

}
