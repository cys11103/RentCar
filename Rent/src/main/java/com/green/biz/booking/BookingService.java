package com.green.biz.booking;

import java.util.List;

public interface BookingService {

	public void insertBooking(BookingVO vo);
	
	public void insertBookingDetail(BookingVO vo);
	
	public List<BookingVO> bookingListById(String id);
	
	public BookingVO getBookingList(int bseq);
	
	public List<BookingVO> bookingList();
	
	public void deleteBooking(int bseq);
	
	public void deleteBookingDetail(int bdseq);
}
