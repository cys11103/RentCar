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

	<table id="productList" border="1">
		<tr>
			<th width="40px;">번호</th><th width="300px;">제목</th><th width="100px;">등록일</th>
		</tr>
		<c:forEach items="${noticeList}" var="notice">
		<tr>
			<td style="text-align: center;">${notice.nseq}</td>
			<td><a href="getNotice?nseq=${notice.nseq}">${notice.title}</a></td>
			<td><fmt:formatDate value="${notice.regdate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
		</tr>
		</c:forEach>
	</table>
	
<%@ include file="../footer.jsp"%>