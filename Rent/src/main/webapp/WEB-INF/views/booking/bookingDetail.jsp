<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<!-- 상단 이미지 들어가는 곳 -->
<div class="clear"></div>
	<div id="top">
		<br><br>
		<h1>
			예약확인
		</h1>
	</div><br>
<%@ include file="sub_menu.jsp" %>

<form method="post" action="">
	<input type="hidden" name="bseq" value="${booking.bseq}">
	<h2 style="margin-left: 900px;">예약상세내역</h2>
	<table id="productList" border="1" style="text-align: center;">
		<tr>
			<th colspan="2">대여정보</th><th colspan="2">차량정보</th>
		</tr>
		<tr>
			<td>대여일</td><td>${booking.start_date}(${booking.start_time})</td><td>차종</td><td>${booking.pname}</td>
		</tr>
		<tr>
			<td>반납일</td><td>${booking.end_date}(${booking.end_time})</td><td>보험종류</td><td>${booking.license}</td>
		</tr>
		<tr>
			<th colspan="4">결제정보</th>
		</tr>
		<tr>
			<td>카드종류</td><td>${pay.card_name}</td><td>카드번호</td><td>${pay.cardNum1}-${pay.cardNum2}-${pay.cardNum3}-${pay.cardNum4}</td>
		</tr>
		<tr>
			<td>결제금액</td><td>${pay.gtotal}</td>
		</tr>
		
	</table>
	<br>
	<div style="text-align: center;">
	<input type="button" value="목록" onclick="location.href='BookingCheck'">
	</div>
</form>

<%@ include file="../footer.jsp"%>