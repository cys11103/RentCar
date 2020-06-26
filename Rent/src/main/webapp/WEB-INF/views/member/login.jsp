<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<!-- 상단 이미지 들어가는 곳 -->
<div class="clear"></div>
	<div id="top">
		<br><br>
		<h1>
			로그인
		</h1>
	</div>
	<form action="login" method="post">
	<br>
		<table id="login_table">
			<tr>
				<th>아이디</th><td><input type="text" name="id" value="${id}"></td>
			</tr>
			<tr>
				<th>비밀번호</th><td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;">
					<input type="button" value="아이디/비밀번호 찾기" onclick="find_id_form()">
					<input type="submit" value="로그인">
				</td>
			</tr>
		</table>
		<table style="margin: auto;">
		<tr>
			<td>아직 회원이 아니신가요?<input type="button" value="회원가입" onclick="location.href='join_form'"></td>
		</tr>
		</table>
	</form>
</div>
<%@ include file="../footer.jsp" %>  