package com.green.biz.notice.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.biz.notice.NoticeVO;

@Repository
public class NoticeDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	
	public List<NoticeVO> noticeList(){
		System.out.println("Mybatis로 noticeList 출력");
		
		return mybatis.selectList("NoticeDAO.noticeList");
		
	}
	
	public NoticeVO getNotice(int nseq) {
		System.out.println("Mybatis로 getNotice 출력");
		
		return mybatis.selectOne("NoticeDAO.getNotice", nseq);
	}
	
	public void insertNotice(NoticeVO vo) {
		System.out.println("Mybatis로 insertNotice() 기능 처리");
		
		mybatis.insert("NoticeDAO.insertNotice", vo);
	}
}
