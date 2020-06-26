package com.green.biz.notice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.biz.notice.NoticeService;
import com.green.biz.notice.NoticeVO;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeDAO nDao;
	
	@Override
	public List<NoticeVO> noticeList() {
		System.out.println("리스트 확인");
		return nDao.noticeList();
	}

	@Override
	public NoticeVO getNotice(int nseq) {
		
		return nDao.getNotice(nseq);
	}

	@Override
	public void insertNotice(NoticeVO vo) {
		
		nDao.insertNotice(vo);
	}
}
