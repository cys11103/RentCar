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
<!-- 공지사항 목록 및 작성  : 번호, 제목, 등록일  / 글쓰기-->
	<form action="write_notice" method="post">
	<br>
		<table id="productList" border="1">
		<tr>
			<td colspan="3"><input type="submit" value="글쓰기" style="margin-left: 900px;"></td>
		</tr>
		<tr>
			<th>번호</th><th>제목</th><th>등록일</th>
		</tr>
		<c:forEach items="${noticeList}" var="notice">
		<tr>
			<td>${notice.nseq}</td>
			<td><a href="notice_Admin_view?nseq=${notice.nseq}">${notice.title}</a></td>
			<td><fmt:formatDate value="${notice.regdate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
		</tr>
		</c:forEach>
		</table>
	</form>
<%@ include file="footer.jsp"%>