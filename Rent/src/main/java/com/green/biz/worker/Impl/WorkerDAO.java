package com.green.biz.worker.Impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.biz.worker.WorkerVO;

@Repository
public class WorkerDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	
	public WorkerVO getWorker(WorkerVO vo) {
		System.out.println("Mybatis로 getWorker()기능 처리");
		
		return mybatis.selectOne("WorkerDAO.getWorker", vo);
	}
}
