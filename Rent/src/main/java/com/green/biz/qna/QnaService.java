package com.green.biz.qna;

import java.util.List;

public interface QnaService {

	public void insertQna(QnaVO vo);
	
	public List<QnaVO> qnaList(String id);
	
	public QnaVO getQna(int qseq);
	
	public void deleteQna(int qseq);
	
	public List<QnaVO> qnaListAll();
	
	public void updateReply(QnaVO vo);
}
