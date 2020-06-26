<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!-- 상단 이미지 들어가는 곳 -->
<div class="clear"></div>
	<div id="top">
		<br><br>
		<h1>
			고객센터
		</h1>
	</div><br>
<div>
<%@ include file="../sub_menu.jsp" %>
</div>

<h2 style="margin-left: 900px;">공지사항</h2>
<form method="get" action="CS">
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
	<div style="text-align: center;">
	<br>
	<input type="submit" value="목록">
	</div>
</form>

<%@ include file="../footer.jsp"%>