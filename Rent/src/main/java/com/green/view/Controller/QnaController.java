package com.green.view.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.biz.booking.BookingService;
import com.green.biz.booking.BookingVO;
import com.green.biz.member.MemberVO;
import com.green.biz.pay.PayService;
import com.green.biz.pay.PayVO;
import com.green.biz.qna.QnaService;
import com.green.biz.qna.QnaVO;
import com.green.biz.review.ReviewService;
import com.green.biz.review.ReviewVO;

@Controller
public class QnaController {

	@Autowired
	QnaService qnaService;
	
	@Autowired
	BookingService bookingService;
	
	@Autowired
	PayService payService;
	
	@Autowired
	ReviewService reviewService;
	
	
	/*
	 * 예약 내역으로 이동
	 */
	@RequestMapping(value="BookingCheck")
	public String bookingList(HttpSession session, Model model, BookingVO vo) {
		
		MemberVO loginUser = (MemberVO)session.getAttribute("loginUser");
		
		if(loginUser == null) {
			return "member/login";
		}else {
			System.out.println("예약 리스트 출력");
			
			List<BookingVO> bookingList = bookingService.bookingListById(loginUser.getId());
			
			model.addAttribute("bookingList", bookingList);
			
			return "booking/bookingList";
		}
	}
	
	/*
	 * 예약 상세 내역보기
	 */
	@RequestMapping(value="bookingList_Detail")
	public String bookingDetail(@RequestParam(value="bseq") int bseq, @RequestParam(value="gseq") int gseq, Model model, HttpSession session) {
		
		MemberVO loginUser = (MemberVO)session.getAttribute("loginUser");
		
		if(loginUser == null) {
			return "member/login";
		}else {
		
			BookingVO booking = bookingService.getBookingList(bseq);
			model.addAttribute("booking", booking);
			
			PayVO pay = payService.getPayInfo(gseq);
			model.addAttribute("pay", pay);
			
			return "booking/bookingDetail";
		}
		
	}
	
	/*
	 * 예약내역에서 후기 작성 페이지로 넘어가기
	 */
	@RequestMapping(value="review_form")
	public String reviewForm(@RequestParam(value="bseq") int bseq, Model model, HttpSession session) {
		
		MemberVO loginUser = (MemberVO)session.getAttribute("loginUser");
		
		if(loginUser == null) {
			return "member/login";
		}else {
		
		System.out.println("리뷰 작성하기");
		
		BookingVO booking = bookingService.getBookingList(bseq);
		
		System.out.println("예약번호: "+bseq);
		model.addAttribute("booking", booking);
		
		return "review/reviewForm";
		
		}
	}
	
	/*
	 * 리뷰 작성 후 다시 예약 내역 페이지로 돌아가기
	 */
	@RequestMapping(value="insert_review", method=RequestMethod.POST)
	public String insertReview(ReviewVO vo , HttpSession session) {
		
		MemberVO loginUser = (MemberVO)session.getAttribute("loginUser");
		
		if(loginUser == null) {
			return "member/login";
		}else {
			System.out.println("리뷰 등록");
			
			reviewService.insertReview(vo);
			
			return "redirect:/BookingCheck";
		}
	}
	
	
	
	/*
	 * 큐앤에이 목록 가져오기
	 */
	@RequestMapping(value="QnA")
	public String qna_main(HttpSession session, Model model) {
		
		//로그인
		MemberVO loginUser = (MemberVO)session.getAttribute("loginUser");
		
		if(loginUser == null) {
			return "member/login";
		}else {
			System.out.println("qna 목록 출력");
			
			List<QnaVO> qnaList = qnaService.qnaList(loginUser.getId());
			
			model.addAttribute("qnaList", qnaList);
			
			return "qna/qnaList";
		}
	}
	/*
	 * 큐앤에이 글쓰기
	 */
	@RequestMapping(value="/qnaWrite")
	public String qnaWriteForm() {
		
		return "qna/qnaForm";
	}
	
	/*
	 * 큐앤에이 글 등록
	 */
	@RequestMapping(value="/qna_insert")
	public String qnaInsert(QnaVO vo) {
		
		qnaService.insertQna(vo);
		
		return "redirect:/QnA";
	}
	
	
	/*
	 * 큐앤에이 글 읽기
	 */
	@RequestMapping(value="/getQna")
	public String qnaView(@RequestParam(value="qseq") int qseq, Model model) {
		
		QnaVO qna = qnaService.getQna(qseq);
		
		model.addAttribute("qna", qna);
		
		return "qna/qnaView";
	}
	
	/*
	 * 큐앤에이 삭제하기
	 */
	@RequestMapping(value="/qna_delete")
	public String qnaDelete(int qseq) {
		
		qnaService.deleteQna(qseq);
		
		return "redirect:/QnA";
	}
}
