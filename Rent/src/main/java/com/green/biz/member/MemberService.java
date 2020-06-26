package com.green.biz.member;

public interface MemberService {

	public MemberVO getMember(String id);
	
	public void insertMember(MemberVO vo);
	
	public MemberVO loginMember(MemberVO vo);
}
