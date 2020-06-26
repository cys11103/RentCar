package com.green.biz.qna.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.biz.qna.QnaService;
import com.green.biz.qna.QnaVO;


@Service("qnaService")
public class QnaServiceImpl implements QnaService {

	@Autowired
	private QnaDAO qDao;
	
	@Override
	public void insertQna(QnaVO vo) {
		
		qDao.insertQna(vo);
	}

	@Override
	public List<QnaVO> qnaList(String id) {
		
		return qDao.qnaList(id);
	}

	@Override
	public QnaVO getQna(int qseq) {
		
		return qDao.getQna(qseq);
	}

	@Override
	public void deleteQna(int qseq) {
		
		qDao.deleteQna(qseq);
	}
	
	@Override
	public List<QnaVO> qnaListAll(){
		
		return qDao.qnaListAll();
	}
	
	@Override
	public void updateReply(QnaVO vo) {
		
		qDao.updateReply(vo);
	}

}
