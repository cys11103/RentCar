package com.green.view.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.biz.guide.GuideService;
import com.green.biz.guide.GuideVO;
import com.green.biz.notice.NoticeService;
import com.green.biz.notice.NoticeVO;

@Controller
public class NoticeController {


	@Autowired
	NoticeService noticeService;
	
	@Autowired
	GuideService guideService;
	
	/*
	 * �������� �κ�
	 */
	@RequestMapping(value="/CS", method=RequestMethod.GET)
	public String cs_main(Model model) {
		
		System.out.println("�������� ��� ���");
		
		List<NoticeVO> noticeList = noticeService.noticeList();
		
		model.addAttribute("noticeList", noticeList);
		
		return "notice/noticeMain";
	}
	
	/*
	 * �������� �󼼺���
	 */
	@RequestMapping(value="/getNotice", method=RequestMethod.GET)
	public String noticeView(@RequestParam(value="nseq") int nseq, Model model) {
		
		NoticeVO notice = noticeService.getNotice(nseq);
		model.addAttribute("notice", notice);
		
		return "notice/noticeDetail";
	}
	

	/*
	 * �̿�ȳ� ������ ����
	 */
	@RequestMapping(value="/Info", method=RequestMethod.GET)
	public String info(Model model) {
		
		List<GuideVO> guideList = guideService.guideList();
		model.addAttribute("guideList", guideList);
		
		return "notice/guide";
	}
	
}
