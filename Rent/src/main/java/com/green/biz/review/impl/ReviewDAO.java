package com.green.biz.review.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.biz.review.ReviewVO;

@Repository
public class ReviewDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	
	public List<ReviewVO> reviewList(){
		System.out.println("Mybatis로 reviewList() 기능 처리");
		
		return mybatis.selectList("ReviewDAO.reviewList");
	}
	
	public ReviewVO getReview(int rseq) {
		System.out.println("Mybatis로 getReview() 기능 처리");
		
		return mybatis.selectOne("ReviewDAO.getReview", rseq);
	}
	
	public void insertReview(ReviewVO vo) {
		System.out.println("Mybatis로 insertReview() 기능 처리");
		
		mybatis.insert("ReviewDAO.insertReview", vo);
	}
	
	public void deleteReview(int rseq) {
		System.out.println("Mybatis로 deleteReview()기능 처리");
		
		mybatis.delete("ReviewDAO.deleteReview", rseq);
	}
}
