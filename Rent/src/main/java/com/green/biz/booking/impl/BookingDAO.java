package com.green.biz.booking.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.biz.booking.BookingVO;

@Repository
public class BookingDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	
	public void insertBooking(BookingVO vo) {
		System.out.println("Mybatis로 insertBooking 기능 처리");
		
		mybatis.insert("BookingDAO.insertBooking", vo);
	}
	
	public void insertBookingDetail(BookingVO vo) {
		System.out.println("Mybatis로 insertBookingDetail 기능 처리");
		System.out.println("예약상세내역"+vo);
		mybatis.insert("BookingDAO.insertBookingDetail", vo);
	}
	
	public List<BookingVO> bookingListById(String id){
		System.out.println("Mybatis로 bookingListById 기능 처리");
		
		return mybatis.selectList("BookingDAO.bookingListById", id);
	}
	
	public BookingVO getBookingList(int bseq) {
		System.out.println("Mybatis로 getBookingList 기능 처리");
		
		return mybatis.selectOne("BookingDAO.getBookingList", bseq);
	}
	
	public List<BookingVO> bookingList(){
		System.out.println("Mybatis로 bookingList() 기능 처리");
		
		return mybatis.selectList("BookingDAO.bookingList");
	}
	
	public void deleteBooking(int bseq) {
		System.out.println("Mybatis로 deleteBooking() 기능 처리");
		
		mybatis.delete("BookingDAO.deleteBooking", bseq);
	}
	
	public void deletBookingDetail(int bdseq) {
		System.out.println("Mybatis로 deleteBookingDetail() 기능 처리");
		
		mybatis.delete("BookingDAO.deleteBookingDetail", bdseq);
	}
}
