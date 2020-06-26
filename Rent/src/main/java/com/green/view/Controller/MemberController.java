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
	 * 메인
	 */
	@RequestMapping(value="/index")
	public String index_main(Model model) {
		System.out.println("index 페이지로 이동");
		
		List<ReviewVO> reviewList = reviewService.reviewList();
		model.addAttribute("reviewList", reviewList);
		
		return "index";
	}
	
	/*
	 * 로그인 폼
	 */
	@RequestMapping(value="/login_form", method=RequestMethod.GET)
	public String loginForm() {
		
		return "member/login";
	}
	
	/*
	 * 사용자 로그인 수행
	 */
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(MemberVO vo, Model model) {
		
		//DB에서 사용자 존재 확인
		MemberVO loginUser = memberService.loginMember(vo);
		if(loginUser != null) {
			model.addAttribute("loginUser", loginUser);
			return "redirect:/index";
		}else {
			return "member/login_fail";
		}
	}
	
	/*
	 * 로그아웃
	 */
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(SessionStatus status) {
		status.setComplete();
		
		return "redirect:/index";
	}
	
	/*
	 * 회원가입 폼
	 */
	@RequestMapping(value="/join_form")
	public String joinForm() {
		
		return "member/join_form";
	}
	
	/*
	 * 1. 회원가입
	 */
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(MemberVO vo) {
		
		System.out.println("회원가입 처리");
		System.out.println(vo);
		memberService.insertMember(vo);
		
		return "member/login";
	}
	
	/*
	 * 2. 사용중인 아이디인지 조회하는 화면 출력
	 */
	@RequestMapping(value="/id_check_form", method=RequestMethod.GET)
	public String idCheckView(@RequestParam(value="id", defaultValue = "", required=false) String id, Model model) {
		model.addAttribute("id", id);
		
		return "member/idcheck"; // 중복아이디 체크 윈도우 창 나옴
	}
	
	/*
	 * 3. 화면의 id를 받아서, 아이디가 존재하는지 데이터베이스에서 조회
	 * 사용자가 있으면 message = 1
	 * 사용자가 없으면 message = -1
	 * JSP화면 호출 : idcheck.jsp
	 */
	@RequestMapping(value="id_check_form", method=RequestMethod.POST)
	public String idCheckAction(@RequestParam(value="id", defaultValue = "", required=false) String id, Model model) {
		
		MemberVO vo = new MemberVO();
		vo.setId(id);
		
		MemberVO user = memberService.getMember(id);
		
		if(user != null) { // 사용자가 이미 존재
			model.addAttribute("message", 1);
		}else { //사용자가 존재하지 않음 => 아이디 사용 가능
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
