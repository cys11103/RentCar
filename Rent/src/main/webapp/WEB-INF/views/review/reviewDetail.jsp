<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- 상단 이미지 들어가는 곳 -->
<div class="clear"></div>
	<div id="top">
		<h1 align="center">
			후기
		</h1>
	</div><br>
	
	<div align="center">
	<table>
		<tr>
			<td rowspan="5" style="padding-right: 10px"><img src="product_images/${review.image}" width="250" height="180"></td>
			<td><h3>${review.pname}</h3></td>	
		</tr>
		<tr>
			<td>
				<c:choose>
					<c:when test="${review.score == 1}">
						<% for(int i=0; i<=0; i++) {%>
							<img src="images/star.png" width="20" height="20">
						<%} %>
					</c:when>
					<c:when test="${review.score == 2}">
						<% for(int i=0; i<=1; i++) {%>
							<img src="images/star.png" width="20" height="20">
						<%} %>
					</c:when>
					<c:when test="${review.score == 3}">
						<% for(int i=0; i<=2; i++) {%>
							<img src="images/star.png" width="20" height="20">
						<%} %>
					</c:when>
					<c:when test="${review.score == 4}">
						<% for(int i=0; i<=1; i++) {%>
							<img src="images/star.png" width="20" height="20">
						<%} %>
					</c:when>
					<c:otherwise>
						<% for(int i=0; i<=4; i++) {%>
							<img src="images/star.png" width="20" height="20">
						<%} %>
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
		<tr>
			<td><fmt:formatDate value="${review.indate}" pattern="yyyy-MM-dd"></fmt:formatDate> 등록
		</tr>
		<tr>
			<td>${review.id}님</td>
		</tr>
		<tr>
			<td><div id="contentbox">${review.content}</div></td>
		</tr>
	</table>
	</div>
<%@ include file="../footer.jsp"%>