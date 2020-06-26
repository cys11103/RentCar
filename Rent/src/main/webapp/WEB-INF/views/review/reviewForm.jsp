<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<!-- 상단 이미지 들어가는 곳 -->
<div class="clear"></div>
	<div id="top">
		<br><br>
		<h1>
			후기 작성
		</h1>
	</div><br>
<%@ include file="sub_menu.jsp" %>
<!-- js 작성하기!! -->

<form name="formm" action="insert_review" method="POST">
	<input type="hidden" name="id" value="${sessionScope.loginUser.id}">
	<input type="hidden" name="pseq" value="${booking.pseq}">
	<input type="hidden" name="image" value="${car.image}">
	<h2 style="margin-left: 900px;">후기 작성</h2>
	<table id="productList" border="1">
		<tr>
			<th>이용차량</th><td><input type="text" name="pname" value="${booking.pname}"></td>
		</tr>
		<tr>
			<th>점수</th>
			<td>
				<input type="radio" name="score" value="1">1
				<input type="radio" name="score" value="2">2
				<input type="radio" name="score" value="3">3
				<input type="radio" name="score" value="4">4
				<input type="radio" name="score" value="5">5
			</td>
		</tr>
		<tr>
			<th>후기</th><td><textarea rows="3" cols="90" name="content"></textarea></td>
		</tr>
	</table>
	<br>
	<div style="text-align: center;">
	<input type="reset" value="취소">
	<input type="button" value="등록" onclick="check_form()">
	<input type="button" value="목록" onclick="location.href='BookingCheck'">
	</div>
</form>

<%@ include file="../footer.jsp"%>