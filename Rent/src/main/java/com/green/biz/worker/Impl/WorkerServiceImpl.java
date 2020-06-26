package com.green.biz.worker.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.biz.worker.WorkerService;
import com.green.biz.worker.WorkerVO;

@Service("workerService")
public class WorkerServiceImpl implements WorkerService {

	@Autowired
	WorkerDAO wDao;
	
	@Override
	public WorkerVO getWorker(WorkerVO vo) {
		
		return wDao.getWorker(vo);
	}

}
