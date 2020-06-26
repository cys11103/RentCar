package com.green.biz.car.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.biz.car.CarService;
import com.green.biz.car.CarVO;

@Service("carService")
public class CarServiceImpl implements CarService {

	@Autowired
	private CarDAO cDao;
	
	@Override
	public List<CarVO> resultList(CarVO vo, String[] kind2) {
		
		return cDao.resultList(vo, kind2);
	}

	@Override
	public CarVO getCar(int pseq) {
		
		return cDao.getCar(pseq);
	}
	
	@Override
	public List<CarVO> carList(){
		
		return cDao.carList();
	}

	@Override
	public void deleteCar(int pseq) {
		
		cDao.deleteCar(pseq);
	}
	
	@Override
	public void insertCar(CarVO vo) {
		
		cDao.insertCar(vo);
	}
}
