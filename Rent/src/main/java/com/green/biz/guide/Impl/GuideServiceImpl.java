package com.green.biz.guide.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.biz.guide.GuideService;
import com.green.biz.guide.GuideVO;

@Service("guideService")
public class GuideServiceImpl implements GuideService {

	@Autowired
	GuideDAO gDao;
	
	@Override
	public List<GuideVO> guideList() {
		
		return gDao.guideList();
	}

	@Override
	public GuideVO getGuide(int eseq) {
		
		return gDao.getGuide(eseq);
	}

}
