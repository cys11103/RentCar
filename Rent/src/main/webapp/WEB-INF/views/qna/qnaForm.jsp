<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

<!-- 상단 이미지 들어가는 곳 -->
<div class="clear"></div>
	<div id="top">
		<br><br>
		<h1>
			QnA
		</h1>
	</div><br>
<div>
<%@ include file="sub_menu.jsp" %>
</div>
<div>
<h3>Q&A 글쓰기</h3>
<form method="post" action="qna_insert">
	<input type="hidden" name="id" value="${sessionScope.loginUser.id}">
	<table id="productList" border="1">
		<tr>
			<th>제목</th><td><input type="text" name="title"></td>
		</tr>
		<tr>
			<th>내용</th><td><textarea rows="8" cols="100" name="content"></textarea></td>
		</tr>
	</table>
	<br>
	<div style="text-align: center;">
	<input type="submit" value="등록">
	<input type="button" value="목록" onclick="location.href='CS'">
	</div>
</form>
</div>

<%@ include file="../footer.jsp"%>