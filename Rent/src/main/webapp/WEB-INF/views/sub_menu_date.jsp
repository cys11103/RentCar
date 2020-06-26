<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta charset="UTF-8">
<nav id="sub_menu_date">
	<div>
		<label>대여일</label>
		<br>
		<input type="text" name="start_date" id="checkin_date" value="${booking.start_date}">
		<br>
		<label>대여시간</label>
		<br>
		<select name="start_time" style="width: 120px;">
									<option value="8">08:00</option>
									<option value="9">09:00</option>
									<option value="10">10:00</option>
									<option value="11">11:00</option>
									<option value="12">12:00</option>
									<option value="13">13:00</option>
									<option value="14">14:00</option>
									<option value="15">15:00</option>
									<option value="16">16:00</option>
									<option value="17">17:00</option>
									<option value="18">18:00</option>
									<option value="19">19:00</option>
									<option value="20">20:00</option>
							</select>
		<br>
		<br>
		<label>반납일</label>
		<br>
		<input type="text" name="end_date" id="checkout_date">
		<br>
		<label>반납시간</label>
		<br>
		<select name="end_time" style="width: 120px;">
									<option value="8">08:00</option>
									<option value="9">09:00</option>
									<option value="10">10:00</option>
									<option value="11">11:00</option>
									<option value="12">12:00</option>
									<option value="13">13:00</option>
									<option value="14">14:00</option>
									<option value="15">15:00</option>
									<option value="16">16:00</option>
									<option value="17">17:00</option>
									<option value="18">18:00</option>
									<option value="19">19:00</option>
									<option value="20">20:00</option>
							</select>
	</div>
</nav>