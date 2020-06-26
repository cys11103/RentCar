<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!-- 상단 이미지 들어가는 곳 -->
<div class="clear"></div>
	<div id="top">
		<br><br>
		<h1>
			후기
		</h1>
	</div><br>
	<div style="margin-left: 80px;">	
		<c:forEach items="${reviewList}" var="review">
			<!-- 한 줄에 몇개까지 둘 건지 코드짜기! -->
		<div id="reviewDetail">
		<table border="1" id="review">
		<tr>
			<td>${review.pname}</td>
		<tr>
			<td><a href="review_detail?rseq=${review.rseq}"><img src="product_images/${review.image}" width="250" height="150"></a></td>
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
			<td><fmt:formatDate value="${review.indate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
		</tr>
		</table>
		</div>
		</c:forEach>
	</div>
<%@ include file="../footer.jsp"%>