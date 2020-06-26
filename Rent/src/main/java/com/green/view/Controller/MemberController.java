package com.green.view.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.green.biz.member.MemberService;
import com.green.biz.member.MemberVO;
import com.green.biz.review.ReviewService;
import com.green.biz.review.ReviewVO;

@Controller
@SessionAttributes("loginUser")
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@Autowired
	ReviewService reviewService;
	/*
	 * ����
	 */
	@RequestMapping(value="/index")
	public String index_main(Model model) {
		System.out.println("index �������� �̵�");
		
		List<ReviewVO> reviewList = reviewService.reviewList();
		model.addAttribute("reviewList", reviewList);
		
		return "index";
	}
	
	/*
	 * �α��� ��
	 */
	@RequestMapping(value="/login_form", method=RequestMethod.GET)
	public String loginForm() {
		
		return "member/login";
	}
	
	/*
	 * ����� �α��� ����
	 */
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(MemberVO vo, Model model) {
		
		//DB���� ����� ���� Ȯ��
		MemberVO loginUser = memberService.loginMember(vo);
		if(loginUser != null) {
			model.addAttribute("loginUser", loginUser);
			return "redirect:/index";
		}else {
			return "member/login_fail";
		}
	}
	
	/*
	 * �α׾ƿ�
	 */
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(SessionStatus status) {
		status.setComplete();
		
		return "redirect:/index";
	}
	
	/*
	 * ȸ������ ��
	 */
	@RequestMapping(value="/join_form")
	public String joinForm() {
		
		return "member/join_form";
	}
	
	/*
	 * 1. ȸ������
	 */
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(MemberVO vo) {
		
		System.out.println("ȸ������ ó��");
		System.out.println(vo);
		memberService.insertMember(vo);
		
		return "member/login";
	}
	
	/*
	 * 2. ������� ���̵����� ��ȸ�ϴ� ȭ�� ���
	 */
	@RequestMapping(value="/id_check_form", method=RequestMethod.GET)
	public String idCheckView(@RequestParam(value="id", defaultValue = "", required=false) String id, Model model) {
		model.addAttribute("id", id);
		
		return "member/idcheck"; // �ߺ����̵� üũ ������ â ����
	}
	
	/*
	 * 3. ȭ���� id�� �޾Ƽ�, ���̵� �����ϴ��� �����ͺ��̽����� ��ȸ
	 * ����ڰ� ������ message = 1
	 * ����ڰ� ������ message = -1
	 * JSPȭ�� ȣ�� : idcheck.jsp
	 */
	@RequestMapping(value="id_check_form", method=RequestMethod.POST)
	public String idCheckAction(@RequestParam(value="id", defaultValue = "", required=false) String id, Model model) {
		
		MemberVO vo = new MemberVO();
		vo.setId(id);
		
		MemberVO user = memberService.getMember(id);
		
		if(user != null) { // ����ڰ� �̹� ����
			model.addAttribute("message", 1);
		}else { //����ڰ� �������� ���� => ���̵� ��� ����
			model.addAttribute("message", -1);
		}
		
		model.addAttribute("id", id);
		
		return "member/idcheck";
	}
	
	/*
	 * 4. 
	 */
	@RequestMapping(value="/id_check_confirmed", method=RequestMethod.GET)
	public String idCheckConfirmed(MemberVO vo, Model model) {
		
		model.addAttribute("reid", vo.getId());
		
		return "member/join_form";
	}
}
