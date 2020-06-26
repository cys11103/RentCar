package com.green.view.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.biz.booking.BookingService;
import com.green.biz.booking.BookingVO;
import com.green.biz.car.CarService;
import com.green.biz.car.CarVO;
import com.green.biz.insurance.InsuranceService;
import com.green.biz.insurance.InsuranceVO;
import com.green.biz.member.MemberService;
import com.green.biz.member.MemberVO;
import com.green.biz.pay.PayService;
import com.green.biz.pay.PayVO;


@Controller
public class CarController {

	@Autowired
	CarService carService;
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	InsuranceService insurService;
	
	@Autowired
	BookingService bookingService;
	
	@Autowired
	PayService payService;
	
	
	/*
	 * indexȭ�鿡�� ����, ���� ������ ���� �������� �Ͽ� �� ���
	 */
	@RequestMapping(value="searchCar", method=RequestMethod.GET)
	public String search_car(@RequestParam(value="kind2") String[] kind2, CarVO vo, Model model) {
		
		System.out.println("��ǰ �˻���� ��ȸ");
		
		for(int i=0; i<kind2.length; i++) {
			System.out.println("kind2"+kind2[i]);
		}
		
		List<CarVO> carList = carService.resultList(vo, kind2);
		
		model.addAttribute("carList", carList);
		model.addAttribute("carListSize", carList.size());
		
		return "car/searchResult";
		
	}
	
	/*
	 * �˻�������� ������ ��� ��ǰ �̹��� ������ ���� ȭ������ �̵�
	 */
	@RequestMapping(value="car_detail", method=RequestMethod.GET)
	public String car_detail_info(int pseq, Model model, HttpSession session, int iseq) {
		
		//�α���
		MemberVO loginUser = (MemberVO)session.getAttribute("loginUser");
						
		if(loginUser == null) {
			return "member/login";
		}else {
			System.out.println("��ǰ �ϳ��� ���� ���� ������ �������� �̵�");
			
			CarVO car = carService.getCar(pseq);
			
			model.addAttribute("car", car);
			
			InsuranceVO insur = insurService.getInsur(iseq);
			
			model.addAttribute("insur", insur);
			
			return "car/bookingCar";	
				}
	}
	
	/*
	 * ����ȭ�鿡�� ����ȭ������ �ѱ��
	 */
	@RequestMapping(value="/booking_insert", method=RequestMethod.POST)
	public String pay(int pseq, Model model, @ModelAttribute("booking")BookingVO vo, 
						@ModelAttribute("member") String id, int iseq) {
		System.out.println("���࿡�� ����â���� �̵�");

		CarVO car = carService.getCar(pseq);
		model.addAttribute("car", car);
		
		InsuranceVO insur = insurService.getInsur(iseq);
		model.addAttribute("insur", insur);
		
		return "car/check_book";
	}
	
	/*
	 * �������� �ѱ��
	 */
	 @RequestMapping(value="/booking_end", method=RequestMethod.POST) public
	 String success(BookingVO vo, Model model, PayVO po) {
		 System.out.println("����Ϸ�");
		 System.out.println("VO=>"+vo);
		 System.out.println("PayVO=>"+po);
		 payService.insertPay(po);
		 bookingService.insertBooking(vo);
		 
		 System.out.println("booking_seq"+vo.getBseq());
		 System.out.println("pay_seq"+po.getGseq());
		 vo.setGseq(po.getGseq());
		 bookingService.insertBookingDetail(vo);
		 
		 return "car/finish";
	 }
	
	
	
}
