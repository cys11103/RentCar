<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ include file="../header.jsp"%>

<!-- 일수 계산 -->
<script type="text/javascript">
$(document).ready(function(){
	var start_date = new Date($("#start_date").val());
	var end_date = new Date($("#end_date").val());
	var diff_day = (end_date.getTime() - start_date.getTime()) / (1000*60*60*24);
	var carprice = parseInt($("#price").val());
	var insur = parseInt($("#insur").val());
	var total = (carprice+insur)*diff_day;
	//$("#gtotal").val(total);
	$("#gtotal").html("<strong>"+total+"</strong>");
	
	//alert(total);
});	
</script>

<!-- 상단 이미지 들어가는 곳 -->
<div class="clear"></div>
	<div id="top">
		<br><br>
		<h1>
			결제하기
		</h1>
	</div>
<br><br>
<form action="booking_end" method="post" name="formm">
<input type="hidden" name="id" value="${sessionScope.loginUser.id}">
<input type="hidden" name="doo" value="${car.doo}">
<input type="hidden" name="si" value="${car.si}">
<input type="hidden" name="pseq" value="${car.pseq}">
<input type="hidden" name="iseq" value="${car.iseq}">
<input type="hidden" name="gseq" value="${booking.gseq}">
<div id="info1">
<table border="1" style="text-align: center;">
	<tr>
		<th colspan="3">${car.doo} | ${car.si}</th>
	</tr>
	<tr>
		<td>대여일</td><td rowspan="3">-></td><td>반납일</td>
	</tr>
	<tr>
		<td><input type="text" id="start_date" name="start_date" value="${booking.start_date}" readonly="readonly"></td>
		<td><input type="text" id="end_date" name="end_date" value="${booking.end_date}" readonly="readonly"></td>
	</tr>
	<tr>
		<td><input name="start_time" value="${booking.start_time}"></td>
		<td><input name="end_time" value="${booking.end_time}"></td>
	</tr>
	<tr>
		<td colspan="3"><img src="product_images/${car.image}" width="250px" height="200px"></td>
	</tr>
	<tr>
		<td colspan="3">${car.pname}</td>
	</tr>
</table>
</div>

<div id="info2">
<h3>[1] 운전자 정보 입력</h3>
<table>
	<tr>
		<td>운전자 이름<br><input type="text" name="name" value="${sessionScope.loginUser.name}"></td>
		<td>생년월일(8자리)<br><input type="number" name="birth" value="${sessionScope.loginUser.birth}"></td>
	</tr>
	<tr>
		<td>휴대전화 번호</td>
		<td>면허 종류</td>
	</tr>
	<tr>
		<td><input type="text" name="phone" value="${sessionScope.loginUser.phone}"></td>
		<td width="400px;">
			<input type="radio" name="license" value="1종 대형">1종 대형
			<input type="radio" name="license" value="1종 보통">1종 보통
			<input type="radio" name="license" value="2종 보통">2종 대형
			<input type="radio" name="license" value="2종 소형">2종 소형
		</td>
	</tr>
</table>
<br>
<hr width="800px" align="left">
<h3>[2] 결제금액 확인</h3>
<input type="hidden" id="price" value="${car.price}">
<input type="hidden" id="insur" value="${insur.price}">
<table>
	<tr>
		<td>${car.pname}</td><td style="text-align: right;"><fmt:formatNumber type="number" maxFractionDigits="3" value="${car.price}"/>원</td>
	</tr>
	<tr>
		<td>${insur.iname}</td><td style="text-align: right;"><fmt:formatNumber type="number" maxFractionDigits="3" value="${insur.price}"/>원</td>
	</tr>
	<tr>
		<td>총 가격</td><td style="text-align: right;"><span id="gtotal"></span>원</td>
	</tr>
</table>
<br>
<hr width="800px" align="left">
<h3>[3] 결제하기</h3>
<table>
	<tr>
		<td>카드종류</td><td>카드사 선택</td>
	</tr>
	<tr>
		<td>
			<input type="radio" name="card_type" value="개인">개인카드
			<input type="radio" name="card_type" value="법인">법인카드
		</td>
		<td>
			<select name="card_name" style="width: 90px;">
				<option value="국민">국민카드</option>
				<option value="외환">외환카드</option>
				<option value="비씨">비씨카드</option>
				<option value="신한">신한카드</option>
				<option value="삼성">삼성카드</option>
				<option value="현대">현대카드</option>
				<option value="우리">우리카드</option>
				<option value="농협">농협카드</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>
			카드 번호 입력<br>
			<input type="number" name="cardNum1" placeholder="1234" style="width: 70px;">-
			<input type="number" name="cardNum2" placeholder="1234" style="width: 70px;">-
			<input type="number" name="cardNum3" placeholder="1234" style="width: 70px;">-
			<input type="number" name="cardNum4" placeholder="1234" style="width: 70px;">
		</td>
		<td>
			유효기간<br>
			<input type="number" name="validY" placeholder="YY" style="width: 50px;">년
			<input type="number" name="validM" placeholder="MM" style="width: 50px;">월
		</td>
	</tr>
	<tr>
		<td>
			카드비밀번호(앞2자리)<br>
			<input type="number" name="cardPwd" placeholder="00" style="width: 40px;">**
		</td>
		<td>
			주민등록번호(앞6자리)<br>
			<input type="number" name="birth_first" placeholder="123456" style="width: 100px;">-*******
		</td>
	</tr>
</table>
	<br><br>
	<input type="checkbox" name="rule" >추가 수수료 안내 및 동의<br>
	<div id="textbox2">
대여 시작 72시간 이내 취소 시, 결제금액 30%에 해당하는 취소 수수료(할인 적용을 제외한 대여금액 기준)가 발생합니다. 취소 수수료는 사용하신 포인트에서 선차감 됩니다.
	 </div>
	 <br><br>
<input type="button" value="결제하기" style="text-align: center; margin-left: 300px;" onclick="bookingCheck()">
<!-- input type을 submit이 아니라 button으로 해야 alert 후 다음 페이지로 안넘어간다!!!! onclick의  return도 빼줘야됨! -->
</div>
</form>
		

<%@ include file="../footer.jsp"%>