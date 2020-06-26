package com.green.biz.car.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.biz.car.CarVO;

@Repository
public class CarDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	
	public List<CarVO> resultList(CarVO vo, String[] kind2){
		System.out.println("Mybatis�� resultList���");
		Map<String, Object> map=new HashMap<>();
		
		System.out.println("vo"+vo);
		map.put("vo", vo);
		map.put("kind2", kind2);
		return mybatis.selectList("CarDAO.resultList", map);
	}
	
	public CarVO getCar(int pseq) {
		System.out.println("Mybatis�� getCar ���");
		
		return mybatis.selectOne("CarDAO.getCar", pseq);
	}
	
	public List<CarVO> carList(){
		System.out.println("Mybatis�� carList() ��� ó��");
		
		return mybatis.selectList("CarDAO.carList");
	}
	
	public void deleteCar(int pseq) {
		System.out.println("Mybatis�� deleteCar() ��� ó��");
		
		mybatis.delete("CarDAO.deleteCar", pseq);
	}
	
	public void insertCar(CarVO vo) {
		System.out.println("Mybatis�� insertCar() ��� ó��");
		
		mybatis.insert("CarDAO.insertCar", vo);
	}
}
