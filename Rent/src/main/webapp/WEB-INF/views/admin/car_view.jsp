<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<!-- 상단 이미지 들어가는 곳 -->
<div class="clear"></div>
	<div id="top">
		<br><br>
		<h1>
			차량 관리
		</h1>
	</div><br>
<%@ include file="sub_menu.jsp" %>
<form method="post" action="delete_car_info" name="formm">
	<input type="hidden" name="pseq" value="${car.pseq}">
	<br>
		<h3>차량 조회</h3>
	<table id="productList" border="1" >
		<tr>
			<th>제조</th>
			<td>${car.kind1}</td>
			<th>사진</th>
			<td>${car.image}</td>
			<th>차종</th>
			<td>${car.kind2}</td>
		</tr>
		<tr>
			<th>차이름</th><td>${car.pname}</td>
			<th>가격</th><td>${car.price}</td>
			<th>차정보</th><td>${car.info1}</td>
		</tr>
		<tr>
			<th>차량 상세정보</th><td colspan="8">${car.info2}</td>
		</tr>
		<tr>
			<th>보험종류</th>
			<td>${car.iseq}</td>
			<th>면허자격</th>
			<td>${car.license}</td>
			<th>등록지역</th>
			<td>${car.doo} | ${car.si}</td>
		</tr>
	</table>
	<br>
	<div style="text-align: center;">
	<input type="button" value="삭제" onclick="delete_admin_car()">
	<input type="button" value="목록" onclick="location.href='prodM'">
	</div>
</form>

<%@ include file="footer.jsp"%>