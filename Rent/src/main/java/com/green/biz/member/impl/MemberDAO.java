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
	 * id �����ϴ��� Ȯ��
	 */
	public MemberVO getMember(String id) {
		System.out.println("===> Mybatis�� getMember() ��� ó��");
		
		return mybatis.selectOne("MemberDAO.getMember", id);
	}
	
	/*
	 * ȸ�� ���
	 */
	public void insertMember(MemberVO vo) {
		System.out.println("Mybatis�� insertMember() ��� ó��");
		
		mybatis.insert("MemberDAO.insertMember", vo);
	}
	
	/*
	 * �α��� : id, pwd Ȯ��
	 */
	public MemberVO loginMember(MemberVO vo) {
		System.out.println("Mybatis�� logkinMember() ���ó��");
		
		return mybatis.selectOne("MemberDAO.loginMember", vo);
	}
}
