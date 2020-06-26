package com.green.biz.guide;

import java.util.List;

public interface GuideService {

	public List<GuideVO> guideList();
	
	public GuideVO getGuide(int eseq);
}
