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
<h2 style="margin-left: 900px;">예약내역</h2>
	<table id="productList" border="1" style="text-align: center;">
		<tr>
			<th>예약번호</th><th>지역</th><th>차종</th><th>예약기간</th><th>예약내역</th><th>후기작성</th>
		</tr>
		<c:forEach items="${bookingList}" var="booking">
		<tr>
			<td>${booking.bseq}</td>
			<td>${booking.doo} | ${booking.si}</td>
			<td>${booking.pname}</td>
			<td>${booking.start_date} ~ ${booking.end_date}</td>
			<td><a href="bookingList_Detail?bseq=${booking.bseq}&gseq=${booking.gseq}">상세보기</a></td>
			<td><a href="review_form?bseq=${booking.bseq}">Review</a></td>
		</tr>
		</c:forEach>
	</table>
<%@ include file="../footer.jsp"%>