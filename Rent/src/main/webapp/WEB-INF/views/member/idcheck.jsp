<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">

#wrap{     
  margin: 0 20px;
}

input[type=button], input[type=submit] {
  float: right;
}
</style>
<script type="text/javascript">
function idok(){
  opener.formm.id.value="${id}"; 
  opener.formm.reid.value="${id}";
  self.close();
}
</script>
<meta charset="UTF-8">
<title>아이디 중복 체크</title>
</head>
<body>
<div id="wrap">
	<h1>ID 중복확인</h1>
	<form action="id_check_form" method="post" name="formm">
		ID <input type="text" name="id" value="${id}"> <input type="submit" value="검색"><br>
	<div>
		<c:if test="${message == 1}">
			<script type="text/javascript">
				opener.document.formm.id.value="";
			</script>
			${id} 는 이미 사용중인 아이디입니다.
		</c:if>
		<c:if test="${message == -1}">
			${id}는 사용 가능한 ID입니다.
			<input type="button" value="사용" onclick="idok()">
		</c:if>
	</div>
	</form>
</div>
</body>
</html>