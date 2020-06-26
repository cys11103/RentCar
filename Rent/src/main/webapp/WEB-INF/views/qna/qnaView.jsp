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
<form method="post" action="qna_delete">
	<h2 style="margin-left: 900px;">QnA 작성하기</h2>
	<input type="hidden" name="qseq" value="${qna.qseq}">
	<table id="productList" border="1">
		<tr>
			<th style="width: 80px;">제목</th><td>${qna.title}</td>
		</tr>
		<tr>
			<th style="width: 80px;">내용</th><td>${qna.content}</td>
		</tr>
		<tr>
			<th style="width: 80px;">답변 내용</th><td>${qna.reply}</td>
		</tr>
	</table>
	<br>
	<div style="text-align: center;">
	<input type="submit" value="삭제">
	<input type="button" value="목록" onclick="location.href='QNA'">
	</div>
</form>
</div>

<%@ include file="../footer.jsp"%>