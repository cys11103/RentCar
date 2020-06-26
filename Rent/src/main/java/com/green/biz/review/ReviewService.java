package com.green.biz.review;

import java.util.List;

public interface ReviewService {

	public List<ReviewVO> reviewList();
	
	public ReviewVO getReview(int rseq);
	
	public void insertReview(ReviewVO vo);
	
	public void deleteReview(int rseq);
}
