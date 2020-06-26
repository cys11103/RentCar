package com.green.biz.qna.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.biz.qna.QnaVO;

@Repository
public class QnaDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	public void insertQna(QnaVO vo) {
		System.out.println("Mybatis로 insertQna() 기능 처리");
		
		mybatis.insert("QnaDAO.insertQna", vo);
	}
	
	public List<QnaVO> qnaList(String id){
		System.out.println("Mybatis로 qnaList() 기능처리");
		
		return mybatis.selectList("QnaDAO.qnaList", id);
	}
	
	public QnaVO getQna(int qseq) {
		System.out.println("Mybatis로 getQna() 기능 처리");
		
		return mybatis.selectOne("QnaDAO.getQna", qseq);
	}
	
	public void deleteQna(int qseq) {
		System.out.println("Mybatis로 deleteQna() 기능 처리");
		
		mybatis.update("QnaDAO.deleteQna", qseq);
	}
	
	public List<QnaVO> qnaListAll(){
		System.out.println("Mybatis로 qnaListAll() 기능 처리");
		
		return mybatis.selectList("QnaDAO.qnaListAll");
	}
	
	public void updateReply(QnaVO vo) {
		System.out.println("Mybatis로 updateReply() 기능 처리");
		
		mybatis.update("QnaDAO.updateReply", vo);
	}
}
