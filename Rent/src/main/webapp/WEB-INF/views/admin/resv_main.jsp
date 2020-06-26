<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!-- 상단 이미지 들어가는 곳 -->
<div class="clear"></div>
	<div id="top">
		<br><br>
		<h1>
			예약 관리
		</h1>
	</div><br>
<div>
<%@ include file="sub_menu.jsp" %>
</div>
<!-- 예약 내역 조회 -->
<!-- 예약자 이름 누르면 고객 결제 정보 나오는 걸로 하기 -->
<br>
		<table id="productList" border="1">
		<tr >
			<th>예약번호</th><th>예약자명</th><th>차량명</th><th>지역</th><th>기간</th>
		</tr>
		<c:forEach items="${bookingList}" var="booking">
		<tr>
			<td><a href="getResv?bseq=${booking.bseq}&gseq=${booking.gseq}">${booking.bseq}</a></td>
			<td>${booking.id}</td>
			<td>${booking.pname}</td>
			<td>${booking.doo} || ${booking.si}</td>
			<td>${booking.start_date}~${booking.end_date}</td>
		</tr>
		</c:forEach>
	</table>
<%@ include file="footer.jsp"%>