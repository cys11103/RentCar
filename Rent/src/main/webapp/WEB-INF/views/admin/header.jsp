<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/rentcar.css" rel="stylesheet">
<title>렌트카 예약 서비스</title>
<script type="text/javascript" src="admin/admin.js"></script>
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
				<c:choose>
					<c:when test="${empty sessionScope.loginUser}">
						<li><a href="Admin">로그인</a></li>
					</c:when>
					<c:otherwise>
						<li style="color: blue">
							${sessionScope.loginUser.name}(${sessionScope.loginUser.id})</li>
						<li><a href="admin_logout">로그아웃</a></li>
					</c:otherwise>
				</c:choose>
			</ul>
		</nav>
		<div id="clear"></div>

	</header>