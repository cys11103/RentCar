package com.green.biz.review.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.biz.review.ReviewService;
import com.green.biz.review.ReviewVO;

@Service("reviewService")
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewDAO rDao;
	
	@Override
	public List<ReviewVO> reviewList() {
		
		return rDao.reviewList();
	}

	@Override
	public ReviewVO getReview(int rseq) {
		
		return rDao.getReview(rseq);
	}

	@Override
	public void insertReview(ReviewVO vo) {
		
		rDao.insertReview(vo);
	}

	@Override
	public void deleteReview(int rseq) {
		
		rDao.deleteReview(rseq);
	}

}
