package com.green.view.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.green.biz.car.CarService;
import com.green.biz.review.ReviewService;
import com.green.biz.review.ReviewVO;

@Controller
public class ReviewController {

	@Autowired
	ReviewService reviewService;
	
	@Autowired
	CarService carService;
	
	/*
	 * 후기 탭 누르면 후기 화면으로 이동
	 */
	@RequestMapping(value="/Review", method=RequestMethod.GET)
	public String ReviewList(Model model) {
		
		List<ReviewVO> reviewList = reviewService.reviewList();
		
		model.addAttribute("reviewList", reviewList);
		
		return "review/reviewList";
	}
	
	/*
	 * 후기 상세보기
	 */
	@RequestMapping(value="/review_detail", method=RequestMethod.GET)
	public String ReviewDetail(int rseq, Model model) {
		
		ReviewVO review = reviewService.getReview(rseq);
		model.addAttribute("review", review);
		
		return "review/reviewDetail";
	}
	
}
