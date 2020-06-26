<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<!-- 상단 이미지 들어가는 곳 -->
<div class="clear"></div>
	<div id="top">
		<br><br>
		<h1>
			차량 관리
		</h1>
	</div><br>
<%@ include file="sub_menu.jsp" %>
<!-- 이미지 업로드하기 위해 필요함 : enctype -->
<form method="post" action="car_insert" enctype="multipart/form-data">
	
	<br>
		<h3>신규 차량 등록</h3>
	<table id="productList" border="1" >
		<tr>
			<th>제조</th>
			<td>
				<input type="radio" name="kind1" value="국산">국산
				<input type="radio" name="kind1" value="수입">수입
			</td>
			<th>사진</th>
			<td><input type="file" name="uploadfile"></td>
		</tr>
		<tr>
			<th>차종</th>
			<td>
				<select name="kind2" style="width: 90px;">
					<option value="경차">경차</option>
					<option value="소형">소형</option>
					<option value="준중형">준중형</option>
					<option value="중형">중형</option>
					<option value="고급">고급</option>
					<option value="SUV">SUV</option>
					<option value="승합">승합</option>
					<option value="전기">전기</option>
				</select>
			</td>
			<th>차이름</th><td><input type="text" name="pname"></td>
		</tr>
		<tr>
			<th>가격</th><td><input type="number" name="price"></td>
			<th>차정보</th><td><input type="text" name="info1"></td>
		</tr>
		<tr>
			<th>차량 상세정보</th>
			<td colspan="3"><textarea rows="3" cols="100" name="info2"></textarea></td>
		</tr>
		<tr>
			<th>보험종류</th>
			<td>
				<select name="iseq" style="width: 90px;">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
					<option value="13">13</option>
				</select>
			</td>
			<th>면허자격</th>
			<td>
				<select name="license">
					<option value="1종">1종</option>
					<option value="2종">2종</option>
					<option value="도로교통법상 유효한 면허로 차종 및 인원에따라 2종,1종">도로교통법상 유효한 면허로 차종 및 인원에따라 2종,1종</option>
				</select>
			</td>
		</tr>
		<tr>
			<th>등록지역</th>
			<td colspan="3">
				도 <select name="doo">
					<option value="서울">서울</option>
					<option value="경기">경기</option>
					<option value="강원">강원</option>
					<option value="제주도">제주도</option>
				  </select>
				시 <select name="si">
				  	<option value="강남">강남</option>
				  	<option value="종로">종로</option>
				  	<option value="용인">용인</option>
				  	<option value="강릉">강릉</option>
				  	<option value="속초">속초</option>
				  	<option value="제주">제주</option>
				  </select>
			</td>
		</tr>
	</table>
	<br>
	<div style="text-align: center;">
	<input type="submit" value="등록">
	<input type="button" value="목록" onclick="location.href='prodM'">
	</div>
</form>

<%@ include file="footer.jsp"%>