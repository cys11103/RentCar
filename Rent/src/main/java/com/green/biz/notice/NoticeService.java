package com.green.biz.notice;

import java.util.List;

public interface NoticeService {

	public List<NoticeVO> noticeList();
	
	public NoticeVO getNotice(int nseq);
	
	public void insertNotice(NoticeVO vo);
}
