<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!-- 상단 이미지 들어가는 곳 -->
<div class="clear"></div>
	<div id="top">
		<br><br>
		<h1>
			QnA 관리
		</h1>
	</div><br>
<div>
<%@ include file="sub_menu.jsp" %>
</div>
<!-- 큐앤에이 관리 -->
<br>
		<table id="productList" border="1">
		<tr>
			<th>번호</th><th>제목</th><th>작성자</th><th>작성일</th><td>답변여부</td>
		</tr>
		<c:forEach items="${qnaList}" var="qna">
		<tr>
			<td>${qna.qseq}</td>
			<td><a href="reply_admin?qseq=${qna.qseq}">${qna.title}</a></td>
			<td>${qna.id}</td>
			<td><fmt:formatDate value="${qna.indate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
			<td>${qna.rep_yn}</td>
		</tr>
		</c:forEach>
	</table>
<%@ include file="footer.jsp"%>