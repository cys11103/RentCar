<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!-- 상단 이미지 들어가는 곳 -->
<div class="clear"></div>
	<div id="top">
		<br><br>
		<h1>
			차량관리
		</h1>
	</div><br>
<div>
<%@ include file="sub_menu.jsp" %>
</div>
<!-- 차량 리스트 보여주고, 상품 등록 및 삭제 하는 창 넣기 -->
<!-- 상품번호, 이름, 지역, 가격, 등록일, 이름 누르면 상세보기 기능으로 이동 -->
<br>
	<form method="post" action="write_car">
		<table id="productList" border="1">
		<tr><td colspan="5"><input type="submit" value="차량등록" style="float: right;"></td></tr>
		<tr>
			<th width="55px;">상품번호</th><th width="100px;">상품명</th><th width="70px;">지역</th><th width="10px;">가격</th><th width="60px;">등록일</th>
		</tr>
		<c:forEach items="${carList}" var="car">
		<tr>
			<td style="text-align: center;">${car.pseq}</td>
			<td><a href="getAdminCar?pseq=${car.pseq}">${car.pname}</a></td>
			<td style="text-align: center;">${car.doo} || ${car.si}</td>
			<td style="text-align: right;"><fmt:formatNumber type="number" maxFractionDigits="3" value="${car.price}"/></td>
			<td style="text-align: center;"><fmt:formatDate value="${car.regdate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
		</tr>
		</c:forEach>
	</table>
	</form>
<%@ include file="footer.jsp"%>