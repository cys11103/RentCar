<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!-- 상단 이미지 들어가는 곳 -->
<div class="clear"></div>
	<div id="top">
		<br><br>
		<h1>
			공지사항 관리
		</h1>
	</div><br>
<div>
<%@ include file="sub_menu.jsp" %>
</div>

<h3>공지사항</h3>
<form method="post" action="noticeM">
	<table id="productList" border="1">
		<tr>
			<th style="width: 80px;">제목</th><td>${notice.title}</td>
		</tr>
		<tr>
			<th style="width: 80px;">등록일</th><td><fmt:formatDate value="${notice.regdate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
		</tr>
		<tr>
			<th style="width: 80px;">내용</th><td>${notice.content}</td>
		</tr>
	</table>
	<br>
	<input type="submit" value="목록" style="margin-left: 470px;">

</form>

<%@ include file="footer.jsp"%>