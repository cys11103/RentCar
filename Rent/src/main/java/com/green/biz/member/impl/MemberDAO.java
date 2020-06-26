package com.green.biz.member.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.biz.member.MemberVO;

@Repository
public class MemberDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	
	/*
	 * id 존재하는지 확인
	 */
	public MemberVO getMember(String id) {
		System.out.println("===> Mybatis로 getMember() 기능 처리");
		
		return mybatis.selectOne("MemberDAO.getMember", id);
	}
	
	/*
	 * 회원 등록
	 */
	public void insertMember(MemberVO vo) {
		System.out.println("Mybatis로 insertMember() 기능 처리");
		
		mybatis.insert("MemberDAO.insertMember", vo);
	}
	
	/*
	 * 로그인 : id, pwd 확인
	 */
	public MemberVO loginMember(MemberVO vo) {
		System.out.println("Mybatis로 logkinMember() 기능처리");
		
		return mybatis.selectOne("MemberDAO.loginMember", vo);
	}
}
