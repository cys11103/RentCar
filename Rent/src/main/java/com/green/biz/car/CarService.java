package com.green.biz.car;

import java.util.List;

public interface CarService {

	public List<CarVO> resultList(CarVO vo, String[] kind2);
	
	public CarVO getCar(int pseq);
	
	public List<CarVO> carList();

	public void deleteCar(int pseq);
	
	public void insertCar(CarVO vo);
}