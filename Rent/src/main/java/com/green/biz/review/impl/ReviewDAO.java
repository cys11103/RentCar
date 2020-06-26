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
		System.out.println("Mybatis�� reviewList() ��� ó��");
		
		return mybatis.selectList("ReviewDAO.reviewList");
	}
	
	public ReviewVO getReview(int rseq) {
		System.out.println("Mybatis�� getReview() ��� ó��");
		
		return mybatis.selectOne("ReviewDAO.getReview", rseq);
	}
	
	public void insertReview(ReviewVO vo) {
		System.out.println("Mybatis�� insertReview() ��� ó��");
		
		mybatis.insert("ReviewDAO.insertReview", vo);
	}
	
	public void deleteReview(int rseq) {
		System.out.println("Mybatis�� deleteReview()��� ó��");
		
		mybatis.delete("ReviewDAO.deleteReview", rseq);
	}
}
