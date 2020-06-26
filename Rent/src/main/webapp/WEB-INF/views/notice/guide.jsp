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

<h2 style="margin-left: 900px;">이용안내</h2>
		<table id="guideList">
		<tr>
		<c:forEach items="${guideList}" var="guide">
			<td width="600px;"><h3><img src="images/question_m.png" align="top" width="35" height="35">  ${guide.title}</h3>
			<br>
			${guide.content}
			</td>
		
		</c:forEach>
		</tr>
		</table>
	
<%@ include file="../footer.jsp"%>