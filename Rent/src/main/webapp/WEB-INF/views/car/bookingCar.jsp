<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<script>
function info_check(){
	if(document.formm.start_date.value==""){
		alert("대여일을 선택해주세요");
		document.formm.start_date.focus();
		return false;
	}else if(document.formm.end_date.value==""){
		alert("반납일을 선택해주세요");
		document.formm.end_date.focus();
		return false;
	}else if(document.formm.agree.checked==false){
		alert("약관에 동의해주세요!");
		document.formm.agree.focus();
		return false;
	}
}
</script>

<!-- 상단 이미지 들어가는 곳 -->
<div class="clear"></div>
	<div id="top">
		<br><br>
		<h1>
			예약하기
		</h1>
	</div>

<form method="post" action="booking_insert" name="formm">
	<input type="hidden" name="id" value="${sessionScope.loginUser.id}">
	<input type="hidden" name="pseq" value="${car.pseq}">
	<input type="hidden" name="iseq" value="${car.iseq}">
	
	<div class="List">
		<table id="detail">
			<tr>
				<td colspan="2"><h3>[1] 차 정보</h3></td><td colspan="2"><h3>[2] 일정 선택</h3></td>
			</tr>
			<tr>
				<td>${car.kind1} | ${car.kind2} | ${car.pname}</td>
				<td rowspan="2"><img src="product_images/${car.image}" width="120"
					height="100"></td>
				<td style="padding-right: 50px;" rowspan="2">
				대여일<br>
				<img src="images/calendar.png" width="20" height="20" align="right">
				<input type="text" name="start_date" id="checkin_date">
				<br><br>
				대여시간<br>
				<select name="start_time" style="width: 120px;">
									<option value="8:00">08:00</option>
									<option value="9:00">09:00</option>
									<option value="10:00">10:00</option>
									<option value="11:00">11:00</option>
									<option value="12:00">12:00</option>
									<option value="13:00">13:00</option>
									<option value="14:00">14:00</option>
									<option value="15:00">15:00</option>
									<option value="16:00">16:00</option>
									<option value="17:00">17:00</option>
									<option value="18:00">18:00</option>
									<option value="19:00">19:00</option>
									<option value="20:00">20:00</option>
							</select>
				</td>
				<td rowspan="2">
				반납일<br>
				<img src="images/calendar.png" width="20" height="20" align="right">
				<input type="text" name="end_date" id="checkout_date">
				<br><br>
				반납시간<br>
				<select name="end_time" style="width: 120px;">
									<option value="8:00">08:00</option>
									<option value="9:00">09:00</option>
									<option value="10:00">10:00</option>
									<option value="11:00">11:00</option>
									<option value="12:00">12:00</option>
									<option value="13:00">13:00</option>
									<option value="14:00">14:00</option>
									<option value="15:00">15:00</option>
									<option value="16:00">16:00</option>
									<option value="17:00">17:00</option>
									<option value="18:00">18:00</option>
									<option value="19:00">19:00</option>
									<option value="20:00">20:00</option>
							</select>
				</td>
			</tr>
			<tr>
				<td width="370px">${car.info1}<br> ${car.info2}
				</td>
			</tr>
		</table>
		<hr width="1100px" align="left">
		<table id="detail">
			<tr>
				<td><h3>[3] 보험 선택</h3></td>
				<td><h3>[4] 대여/반납 안내</h3></td>
			</tr>
			<tr>
				<td><select name="insur" style="height: 30px;">
						<option>일반자차 (+10,000원), 만21세이상 / 운전경력 1년 이상</option>
				</select></td>
				<td>차량 수령 장소</td>
			<tr>
				<td>
					<div id="textbox">
						보험안내 및 약관 일반자차 <br> <br> 
						나이 : <c:out value="${insur.age}"/><br> 
						운전경력 : <c:out value="${insur.exp}"/><br> 
						면허종류 : <c:out value="${car.license}"/><br> 
						보상한도 : <c:out value="${insur.p1}"/><br> 
						면책금 : <c:out value="${insur.p2}"/><br> 
						휴차보상료 : <c:out value="${insur.p3}"/><br>
					</div>
				</td>
				<td>
					<div id="textbox">
						영업시간 : 09:00 ~ 20:00<br> (시간 외 인수/반납 사전문의 필수)<br> (애완견
						동승 가능 여부 사전 문의 필수)
					</div>
				</td>
			<tr>
				<td>
					
						<input type="checkbox" name="agree" value="1">보험약관을 모두
						읽었으며 동의합니다.
					
				</td>
			</tr>
		</table>
		<br> <br>
			<input type="submit" value="결제하기" onclick="return info_check()" style="margin-left: 500px;">
	</div>
</form>

<%@ include file="../footer.jsp"%>