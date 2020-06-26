package com.green.biz.member.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.biz.member.MemberService;
import com.green.biz.member.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO mDao;
	
	@Override
	public MemberVO getMember(String id) {
		
		return mDao.getMember(id);
	}

	@Override
	public void insertMember(MemberVO vo) {
		
		mDao.insertMember(vo);
	}

	@Override
	public MemberVO loginMember(MemberVO vo) {
		
		return mDao.loginMember(vo);
	}

}
