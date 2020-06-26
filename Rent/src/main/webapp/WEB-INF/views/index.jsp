<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script>

function check(){
	var count=0;
	
	//하나만 체크했을 경우 -> 배열이 아님!
	if(document.formm.kind2.length == undefined){
		if(document.formm.kind2.checked == true){
			count++;
		}
	}
	
	//둘 이상 체크했을 경우 -> 배열임! =>따라서 2번 나눠서 검사를 해줘야함!!
	for(var i=0; i<document.formm.kind2.length; i++){
		if(document.formm.kind2[i].checked == true){
			count++;
		}
	}
	if(count == 0){
		alert("차종을 선택해주세요!");
		return false;
	}else{
		
		document.formm.action = "searchCar";
		document.formm.submit();
	}
	

}
</script>
<div class="clear"></div>

<!-- 메인 이미지 들어가는 곳 -->
	<div id="top">
		<h1 align="center">
			모빌리티 플랫폼<br>00카 예약 서비스
		</h1>
	</div>
	<form method="get" action="searchCar" name="formm">
	<input type="hidden" name="id" value="${member.id}">
	<br>
	<h2 id="botton">예약하기</h2>
	<div id="middle">
		<table id="mid_table">
			<tr>
				<td>
					<table>
						<tr>
							<td colspan="2"><h3>01.지역 선택</h3></td>
						</tr>
						<tr>
							<th>도 <br>
							<select name="doo" style="width: 120px;">
								<option value="서울">서울</option>
								<option value="경기">경기</option>
								<option value="강원">강원</option>
								<option value="제주도">제주도</option>
							</select>
							<br><br><br>
							</th>
							<th>시 <br>
							<select name="si" style="width: 120px;">
								<option value="강남">강남</option>
								<option value="종로">종로</option>
								<option value="용인">용인</option>
								<option value="양평">양평</option>
								<option value="강릉">강릉</option>
								<option value="속초">속초</option>
								<option value="제주">제주</option>
							</select>
							<br><br><br>
							</th>
						</tr>
					</table>
				</td>
				<td>
					<table>
						<tr>
							<td colspan="2"><h3>02.차종 선택</h3></td>
						</tr>
						<tr>
							<td>
							<input type="checkbox" name="kind2" value="경차">경차
							<input type="checkbox" name="kind2" value="소형">소형
							<input type="checkbox" name="kind2" value="준중형">준중형
							<input type="checkbox" name="kind2" value="중형">중형
							</td>
						</tr>
						<tr>
							<td><input type="checkbox" name="kind2" value="고급">고급
							 	<input type="checkbox" name="kind2" value="SUV">SUV
							 	<input type="checkbox" name="kind2" value="승합">승합
								<input type="checkbox" name="kind2" value="전기">전기<br><br>
							</td>
						</tr>
						<tr>
							<td rowspan="3" colspan="2" style="text-align: center;"><input
								type="reset" name="reset" value="초기화">
								&nbsp;&nbsp;&nbsp; <input type="submit" name="submit" value="조회" onclick="return check()">
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>
</form>
</div>

<div id="botton">
<h2>이달의 후기</h2>
	<c:forEach items="${reviewList}" var="review">
		<div id="reviewDetail">
		<table border="1" id="review" >
		<tr>
			<td>${review.pname}</td>
		<tr>
			<td><a href="review_detail?rseq=${review.rseq}"><img src="product_images/${review.image}" width="250" height="150"></a></td>
		</tr>
		<tr>
			<td>
				<c:choose>
					<c:when test="${review.score == 1}">
						<% for(int i=0; i<=0; i++) {%>
							<img src="images/star.png" width="20" height="20">
						<%} %>
					</c:when>
					<c:when test="${review.score == 2}">
						<% for(int i=0; i<=1; i++) {%>
							<img src="images/star.png" width="20" height="20">
						<%} %>
					</c:when>
					<c:when test="${review.score == 3}">
						<% for(int i=0; i<=2; i++) {%>
							<img src="images/star.png" width="20" height="20">
						<%} %>
					</c:when>
					<c:when test="${review.score == 4}">
						<% for(int i=0; i<=1; i++) {%>
							<img src="images/star.png" width="20" height="20">
						<%} %>
					</c:when>
					<c:otherwise>
						<% for(int i=0; i<=4; i++) {%>
							<img src="images/star.png" width="20" height="20">
						<%} %>
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
		<tr>
			<td><fmt:formatDate value="${review.indate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
		</tr>
		</table>
		</div>
	</c:forEach>
</div>

<%@ include file="footer.jsp"%>
