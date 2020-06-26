package com.green.biz.guide.Impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.biz.guide.GuideVO;

@Repository
public class GuideDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	
	public List<GuideVO> guideList(){
		System.out.println("Mybatis�� guideList() ���ó��");
		
		return mybatis.selectList("GuideDAO.guideList");
	}
	
	public GuideVO getGuide(int eseq) {
		System.out.println("Mybatis�� getGuide() ���ó��");
		
		return mybatis.selectOne("GuideDAO.getGuide", eseq);
	}
}
