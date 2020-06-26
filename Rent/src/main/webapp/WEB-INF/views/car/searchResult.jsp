<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!-- 상단 이미지 들어가는 곳 -->
<div class="clear"></div>
	<div id="top">
		<br><br>
		<h1>
			검색결과
		</h1>
	</div>

<br>
<!-- 이전페이지로 가는 버튼 만들기 -->
<input type="button" value="메인화면으로 이동" onclick="history.go(-1)" style="margin-left: 85px;">
<br>
<table id="List" style="width: 1200px;" border="1">
	<c:choose>
	<c:when test="${carListSize<=0}">
			<tr>
				<td style="text-align: center;"><h3>검색된 차량이 없습니다.</h3></td>
			</tr>
	</c:when>
	<c:otherwise>
		<c:forEach items="${carList}" var="car">
		<tr>
			<td><a
				href="car_detail?pseq=${car.pseq}&iseq=${car.iseq}&id=${sessionScope.loginUser.id}"><img
					src="product_images/${car.image}" width="200" height="200"></a></td>
			<td style="padding: 10px;">${car.kind1} | ${car.kind2} |
				${car.pname}<br>
			<br> <br> 가
				&nbsp;&nbsp;&nbsp;&nbsp;격 &nbsp;&nbsp; ${car.price}원<br> 옵
				&nbsp;&nbsp;&nbsp;&nbsp;션 &nbsp;&nbsp; ${car.info1}<br> 상세정보
				&nbsp;&nbsp;${car.info2}
			</td>
			</tr>
		</c:forEach>
	</c:otherwise>

	</c:choose>
</table>

<%@ include file="../footer.jsp"%>