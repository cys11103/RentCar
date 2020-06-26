<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!-- 상단 이미지 들어가는 곳 -->
<div class="clear"></div>
	<div id="top">
		<br><br>
		<h1>
			QnA
		</h1>
	</div><br>
<%@ include file="sub_menu.jsp" %>
<h2 style="margin-left: 900px;">1:1 QnA</h2>
	<form action="qnaWrite" method="post">
	<input type="submit" name="write" value="글쓰기" style="margin-left: 890px;">
	<table id="productList" border="1" style="text-align: center;">
		<tr>
			<th>번호</th><th>제목</th><th>등록일</th><th>답변여부</th>
		</tr>
		<c:forEach items="${qnaList}" var="qna">
		<tr>
			<td>${qna.qseq}</td>
			<td><a href="getQna?qseq=${qna.qseq}">${qna.title}</a></td>
			<td><fmt:formatDate value="${qna.indate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
			<td>${qna.rep_yn}</td>
		</tr>
		</c:forEach>
	</table>
	</form>
<%@ include file="../footer.jsp"%>