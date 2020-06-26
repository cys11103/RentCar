function id_check(){
	//아이디 체크
	if(document.formm.action==""){
		alert("아이디를 입력해 주세요");
		document.formm.id.focus();
		return;
	}
	
	//중복된 아이디 체크 <- 윈도우 창으로
	var url="id_check_form?id="+document.formm.id.value;
	
	window.open(url, "_blank_1", "toolvar=no, menubar=no, scrollbars=yes, resizable=no, width=330, height=200");
}

/*
 * 회원 정보 입력 확인 및 가입 처리
 */
function go_save(){
	
	if(document.formm.id.value==""){
		alert("아이디를 입력해 주세요");
		document.formm.id.focus();
		return false;
	}else if(document.formm.id.value != document.formm.reid.value){
		alert("아이디 중복확인을 실행해주세요!");
		document.formm.id.focus();
		return false;
	}else if(document.formm.pwd.value==""){
		alert("비밀번호를 입력해 주세요");
		document.formm.pwd.focus();
		return false;
	}else if(document.formm.pwd.value != document.formm.pwdCheck.value){
		alert("비밀번호가 일치하지 않습니다");
		document.formm.pwd.focus();
		return false;
	}else if(document.formm.name.value==""){
		alert("이름을 입력해 주세요");
		document.formm.name.focus();
		return false;
	}else if(document.formm.birth.value==""){
		alert("생년월일을 입력해 주세요");
		document.formm.birth.focus();
		return false;
	}else if(document.formm.ename1.value==""){
		alert("영문 성을 입력해 주세요");
		document.formm.ename1.focus();
		return false;
	}else if(document.formm.ename2.value==""){
		alert("영문 이름을 입력해 주세요");
		document.formm.ename2.focus();
		return false;
	}else if(document.formm.phone.value==""){
		alert("휴대전화를 입력해 주세요");
		document.formm.phone.focus();
		return false;
	}else if(document.formm.email.value==""){
		alert("E-mail을 입력해 주세요");
		document.formm.email.focus();
		return false;
	}else{
		//모든 항목이 입력되었으면 회원가입을 요청
		document.formm.action="join";
		doucment.formm.submit();
	}
}

function idok(){
	document.formm.action="id_check_confirmed";
	document.formm.submit();
}
