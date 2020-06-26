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
	 * ���� �������� �̵�
	 */
	@RequestMapping(value="BookingCheck")
	public String bookingList(HttpSession session, Model model, BookingVO vo) {
		
		MemberVO loginUser = (MemberVO)session.getAttribute("loginUser");
		
		if(loginUser == null) {
			return "member/login";
		}else {
			System.out.println("���� ����Ʈ ���");
			
			List<BookingVO> bookingList = bookingService.bookingListById(loginUser.getId());
			
			model.addAttribute("bookingList", bookingList);
			
			return "booking/bookingList";
		}
	}
	
	/*
	 * ���� �� ��������
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
	 * ���೻������ �ı� �ۼ� �������� �Ѿ��
	 */
	@RequestMapping(value="review_form")
	public String reviewForm(@RequestParam(value="bseq") int bseq, Model model, HttpSession session) {
		
		MemberVO loginUser = (MemberVO)session.getAttribute("loginUser");
		
		if(loginUser == null) {
			return "member/login";
		}else {
		
		System.out.println("���� �ۼ��ϱ�");
		
		BookingVO booking = bookingService.getBookingList(bseq);
		
		System.out.println("�����ȣ: "+bseq);
		model.addAttribute("booking", booking);
		
		return "review/reviewForm";
		
		}
	}
	
	/*
	 * ���� �ۼ� �� �ٽ� ���� ���� �������� ���ư���
	 */
	@RequestMapping(value="insert_review", method=RequestMethod.POST)
	public String insertReview(ReviewVO vo , HttpSession session) {
		
		MemberVO loginUser = (MemberVO)session.getAttribute("loginUser");
		
		if(loginUser == null) {
			return "member/login";
		}else {
			System.out.println("���� ���");
			
			reviewService.insertReview(vo);
			
			return "redirect:/BookingCheck";
		}
	}
	
	
	
	/*
	 * ť�ؿ��� ��� ��������
	 */
	@RequestMapping(value="QnA")
	public String qna_main(HttpSession session, Model model) {
		
		//�α���
		MemberVO loginUser = (MemberVO)session.getAttribute("loginUser");
		
		if(loginUser == null) {
			return "member/login";
		}else {
			System.out.println("qna ��� ���");
			
			List<QnaVO> qnaList = qnaService.qnaList(loginUser.getId());
			
			model.addAttribute("qnaList", qnaList);
			
			return "qna/qnaList";
		}
	}
	/*
	 * ť�ؿ��� �۾���
	 */
	@RequestMapping(value="/qnaWrite")
	public String qnaWriteForm() {
		
		return "qna/qnaForm";
	}
	
	/*
	 * ť�ؿ��� �� ���
	 */
	@RequestMapping(value="/qna_insert")
	public String qnaInsert(QnaVO vo) {
		
		qnaService.insertQna(vo);
		
		return "redirect:/QnA";
	}
	
	
	/*
	 * ť�ؿ��� �� �б�
	 */
	@RequestMapping(value="/getQna")
	public String qnaView(@RequestParam(value="qseq") int qseq, Model model) {
		
		QnaVO qna = qnaService.getQna(qseq);
		
		model.addAttribute("qna", qna);
		
		return "qna/qnaView";
	}
	
	/*
	 * ť�ؿ��� �����ϱ�
	 */
	@RequestMapping(value="/qna_delete")
	public String qnaDelete(int qseq) {
		
		qnaService.deleteQna(qseq);
		
		return "redirect:/QnA";
	}
}
