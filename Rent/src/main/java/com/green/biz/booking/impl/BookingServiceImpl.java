package com.green.biz.booking.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.biz.booking.BookingService;
import com.green.biz.booking.BookingVO;

@Service("bookingService")
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingDAO bDao;
	
	@Override
	public void insertBooking(BookingVO vo) {
		
		bDao.insertBooking(vo);
	}
	
	@Override
	public void insertBookingDetail(BookingVO vo) {
		
		bDao.insertBookingDetail(vo);
	}
	
	@Override
	public List<BookingVO> bookingListById(String id){
		
		return bDao.bookingListById(id);
	}
	
	@Override
	public BookingVO getBookingList(int bseq) {
		
		return bDao.getBookingList(bseq);
	}
	
	@Override
	public List<BookingVO> bookingList(){
		
		return bDao.bookingList();
	}
	
	@Override
	public void deleteBooking(int bseq) {
		
		bDao.deleteBooking(bseq);
	}
	
	@Override
	public void deleteBookingDetail(int bdseq) {
		
		bDao.deletBookingDetail(bdseq);
	}
}
