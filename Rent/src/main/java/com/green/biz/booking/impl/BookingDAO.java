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
		System.out.println("Mybatis�� insertBooking ��� ó��");
		
		mybatis.insert("BookingDAO.insertBooking", vo);
	}
	
	public void insertBookingDetail(BookingVO vo) {
		System.out.println("Mybatis�� insertBookingDetail ��� ó��");
		System.out.println("����󼼳���"+vo);
		mybatis.insert("BookingDAO.insertBookingDetail", vo);
	}
	
	public List<BookingVO> bookingListById(String id){
		System.out.println("Mybatis�� bookingListById ��� ó��");
		
		return mybatis.selectList("BookingDAO.bookingListById", id);
	}
	
	public BookingVO getBookingList(int bseq) {
		System.out.println("Mybatis�� getBookingList ��� ó��");
		
		return mybatis.selectOne("BookingDAO.getBookingList", bseq);
	}
	
	public List<BookingVO> bookingList(){
		System.out.println("Mybatis�� bookingList() ��� ó��");
		
		return mybatis.selectList("BookingDAO.bookingList");
	}
	
	public void deleteBooking(int bseq) {
		System.out.println("Mybatis�� deleteBooking() ��� ó��");
		
		mybatis.delete("BookingDAO.deleteBooking", bseq);
	}
	
	public void deletBookingDetail(int bdseq) {
		System.out.println("Mybatis�� deleteBookingDetail() ��� ó��");
		
		mybatis.delete("BookingDAO.deleteBookingDetail", bdseq);
	}
}
