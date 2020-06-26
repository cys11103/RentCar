package com.green.view.Controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;

import com.green.biz.booking.BookingService;
import com.green.biz.booking.BookingVO;
import com.green.biz.car.CarService;
import com.green.biz.car.CarVO;
import com.green.biz.member.MemberService;
import com.green.biz.member.MemberVO;
import com.green.biz.notice.NoticeService;
import com.green.biz.notice.NoticeVO;
import com.green.biz.pay.PayService;
import com.green.biz.pay.PayVO;
import com.green.biz.qna.QnaService;
import com.green.biz.qna.QnaVO;
import com.green.biz.worker.WorkerService;
import com.green.biz.worker.WorkerVO;

@Controller
@SessionAttributes("loginUser")
public class AdminController {

	@Autowired
	WorkerService workerService;
	
	@Autowired
	CarService carService;
	
	@Autowired
	BookingService bookingService;
	
	@Autowired
	QnaService qnaService;
	
	@Autowired
	PayService payService;
	
	@Autowired
	NoticeService noticeService;
	
	@Autowired
	MemberService memberService;
	
	/*
	 * ������ �α��� �������� �̵�
	 */
	@RequestMapping(value="/Admin", method=RequestMethod.GET)
	public String adming_page() {
		
		return "admin/admin_login";
	}
	
	/*
	 * �α��� �� ���� �������� �̵�
	 */
	@RequestMapping(value="/adminMain", method= {RequestMethod.GET, RequestMethod.POST})
	public String main(CarVO co, Model model, WorkerVO vo) {
		
		WorkerVO loginUser = workerService.getWorker(vo);
		if(loginUser != null) {
			List<CarVO> carList = carService.carList();
			model.addAttribute("carList", carList);
			
			return "admin/admin_main";
		}else {
			return "member/login_fail";
		}
	}
	
	/*
	 * �α׾ƿ�
	 */
	@RequestMapping(value="admin_logout")
	public String logoutAdmin(SessionStatus status) {
		
		status.setComplete();
		
		return "redirect:/Admin";
	}
	
	/*
	 * ������� ������ ===> �ٽ��ϱ�!!
	 */
	@RequestMapping(value="/resvM", method= {RequestMethod.GET, RequestMethod.POST})
	public String resevAdmin(Model model) {
		

		List<BookingVO> bookingList = bookingService.bookingList();
		model.addAttribute("bookingList", bookingList);
			
		return "admin/resv_main";
	}
	
	/*
	 * ���� �����ϱ�
	 */
	@RequestMapping(value="/resv_delete", method= {RequestMethod.GET, RequestMethod.POST})
	public String resvDelete(int bseq, int bdseq) {
		
		bookingService.deleteBooking(bseq);
		bookingService.deleteBookingDetail(bdseq);
		
		return "redirect:/resvM";
	}
	
	/*
	 * ���೻�� �󼼺���
	 */
	@RequestMapping(value="/getResv")
	public String resvDetail(Model model, int bseq, int gseq) {
		
		BookingVO booking = bookingService.getBookingList(bseq);
		PayVO pay = payService.getPayInfo(gseq);
		
		model.addAttribute("booking", booking);
		model.addAttribute("pay", pay);
		
		return "admin/resv_view";
	}
	
	/*
	 * ť�ؿ��� ���� ������
	 */
	@RequestMapping(value="/qnaM", method= {RequestMethod.POST, RequestMethod.GET})
	public String qnaAdmin(Model model) {
		
		List<QnaVO> qnaList = qnaService.qnaListAll();
		
		model.addAttribute("qnaList", qnaList);
		
		return "admin/qna_main";
		
	}
	
	/*
	 * ť�ؿ��� �󼼺���
	 */
	@RequestMapping(value="/reply_admin", method= {RequestMethod.POST, RequestMethod.GET})
	public String replyAdmin(Model model, int qseq) {
		
		QnaVO qna = qnaService.getQna(qseq);
		
		model.addAttribute("qna", qna);
		
		return "admin/qna_detail";
		
	}
	
	/*
	 * ť�ؿ��� ��� �ޱ�
	 */
	@RequestMapping(value="/reply_update", method= {RequestMethod.GET, RequestMethod.POST})
	public String replyUpdate(QnaVO vo) {
		
		qnaService.updateReply(vo);
		
		return "redirect:/qnaM"; //url�� ���� �Ѱ������(jspȭ���� �ƴ϶�!)
	}
	
	/*
	 * �������� ���
	 */
	@RequestMapping(value="/noticeM",  method= {RequestMethod.GET, RequestMethod.POST})
	public String noticeAdmin(Model model) {
		
		List<NoticeVO> noticeList = noticeService.noticeList();
		model.addAttribute("noticeList", noticeList);
		
		return "admin/notice_main";
	}
	
	/*
	 * �������� ���
	 */
	@RequestMapping(value="/write_notice", method= {RequestMethod.GET, RequestMethod.POST})
	public String writeAdmin() {
		
		return "admin/notice_form";
	}
	
	/*
	 * �������� ��� �Ϸ�
	 */
	@RequestMapping(value="/notice_insert", method= {RequestMethod.GET, RequestMethod.POST})
	public String insertNotice(NoticeVO vo) {
		
		noticeService.insertNotice(vo);
		
		return "redirect:/noticeM";
	}
	
	/*
	 * �������� ����
	 */
	@RequestMapping(value="/notice_Admin_view", method= {RequestMethod.GET, RequestMethod.POST})
	public String noticeView(int nseq, Model model) {
		
		NoticeVO notice = noticeService.getNotice(nseq);
		model.addAttribute("notice", notice);
		
		return "admin/notice_view";
	}
	
	/*
	 * �������� ���
	 */
	@RequestMapping(value="/prodM", method= {RequestMethod.GET, RequestMethod.POST})
	public String carList(Model model) {
		
		List<CarVO> carList = carService.carList();
		model.addAttribute("carList", carList);
		
		return "admin/admin_main";
	}
	/*
	 * ������� ��
	 */
	@RequestMapping(value="/write_car", method= {RequestMethod.GET, RequestMethod.POST})
	public String carForm() {
		
		return "admin/car_form";
	}
	
	
	/*
	 * ���� �󼼺���
	 */
	@RequestMapping(value="/getAdminCar", method= {RequestMethod.GET, RequestMethod.POST})
	public String viewCar(Model model, int pseq) {
		
		CarVO car = carService.getCar(pseq);
		model.addAttribute("car", car);
		
		return "admin/car_view";
	}
	
	/*
	 * ���� ���� ����
	 */
	@RequestMapping(value="/delete_car_info", method= {RequestMethod.GET, RequestMethod.POST})
	public String deleteAdminCar(int pseq) {
		
		System.out.println("car_delete �ǽ�");
		carService.deleteCar(pseq);
		
		return "redirect:/prodM";
	}
	
	/*
	 * ���� ���� ���
	 */
	@RequestMapping(value="/car_insert", method= {RequestMethod.GET, RequestMethod.POST})
	public String insertCar(@RequestParam(value = "uploadfile") MultipartFile uploadFile, CarVO vo, HttpSession session) {
											// value�� image�� �Է��ϸ� MutlipartFile�� Ÿ�� �̽��� �߻���! ���� �̸��� uploadFile�� �ٲ������!!
		String fileName = "";
		
		if(!uploadFile.isEmpty()) { //��ǰ �̹����� ���ε�� ==> ��ǰ ��θ� �Է����ֱ� ���� ��!! �ʼ�!!
			String root_path = session.getServletContext().getRealPath("WEB-INF/resources/product_images/");
			
			System.out.println("Root ���="+root_path);
			
			//���ε�� ���ϸ� ��������
			fileName = uploadFile.getOriginalFilename();
			
			try {
				File file = new File(root_path + fileName);
				uploadFile.transferTo(file);
			}catch(IllegalStateException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
				
		}
		vo.setImage(fileName); //image �÷��� �̹��� ���ϸ� ����
		System.out.println(vo);
		
		carService.insertCar(vo);
		
		return "redirect:/prodM";
	}
	
}
