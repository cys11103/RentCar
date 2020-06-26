<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>

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
<div>
<h3>Q&A </h3>
<form method="post" action="reply_update">
	<input type="hidden" name="rep_yn" value="y">
	<input type="hidden" name="qseq" value="${qna.qseq}">
	<table id="productList" border="1">
		<tr>
			<th style="width: 80px;">제목</th><td>${qna.title}</td>
		</tr>
		<tr>
			<th style="width: 80px;">내용</th><td>${qna.content}</td>
		</tr>
		<tr>
			<th style="width: 80px;">답변 내용</th><td><textarea name="reply" rows="3" cols="90"></textarea></td>
		</tr>
	</table>
	<div style="text-align: center;">
	<input type="submit" value="등록">
	<input type="button" value="목록" onclick="location.href='qnaM'">
	</div>
</form>
</div>

<%@ include file="../footer.jsp"%>