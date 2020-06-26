<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/rentcar.css" rel="stylesheet">
<link rel="stylesheet" href="js/jquery-ui.css" type="text/css" />  
<script src="js/jquery.min.js"></script>  
<script src="js/jquery-ui.min.js"></script>
<script src="script/datepicker-ko.js"></script>
<script type="text/javascript" src="member/member.js"></script>
<script type="text/javascript" src="car/car.js"></script>
<script type="text/javascript" src="review/review.js"></script>
<script>
$(function() {
	$("#checkin_date").datepicker();
	$("#checkout_date").datepicker();
});
</script>
<title>렌트카 예약 서비스</title>
</head>
<body>
	<!-- 헤더파일 시작 -->
	<header>
		<!-- 로고 -->
		<div id="logo">
			<a href="index"> <img alt="rentcar" src="images/post.png"
				width="180" height="140">
			</a>
		</div>
		<!-- 상단 메뉴 -->
		<nav id="top_menu">
			<ul>
				<li><a href="Review">후기</a></li>
				<li><a href="CS">고객센터</a></li>
				<li><a href="BookingCheck">예약확인</a></li>
				<c:choose>
					<c:when test="${empty sessionScope.loginUser}">
						<li><a href="login_form">로그인/회원가입</a></li>
					</c:when>
					<c:otherwise>
						<li style="color: blue">
							${sessionScope.loginUser.name}(${sessionScope.loginUser.id})</li>
						<li><a href="logout">로그아웃</a></li>
					</c:otherwise>
				</c:choose>
				<li><a href="Admin">관리자 전용</a></li>
			</ul>
		</nav>
		<div id="clear"></div>

	</header>