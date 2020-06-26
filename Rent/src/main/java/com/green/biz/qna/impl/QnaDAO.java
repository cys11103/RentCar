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
		System.out.println("Mybatis�� insertQna() ��� ó��");
		
		mybatis.insert("QnaDAO.insertQna", vo);
	}
	
	public List<QnaVO> qnaList(String id){
		System.out.println("Mybatis�� qnaList() ���ó��");
		
		return mybatis.selectList("QnaDAO.qnaList", id);
	}
	
	public QnaVO getQna(int qseq) {
		System.out.println("Mybatis�� getQna() ��� ó��");
		
		return mybatis.selectOne("QnaDAO.getQna", qseq);
	}
	
	public void deleteQna(int qseq) {
		System.out.println("Mybatis�� deleteQna() ��� ó��");
		
		mybatis.update("QnaDAO.deleteQna", qseq);
	}
	
	public List<QnaVO> qnaListAll(){
		System.out.println("Mybatis�� qnaListAll() ��� ó��");
		
		return mybatis.selectList("QnaDAO.qnaListAll");
	}
	
	public void updateReply(QnaVO vo) {
		System.out.println("Mybatis�� updateReply() ��� ó��");
		
		mybatis.update("QnaDAO.updateReply", vo);
	}
}
