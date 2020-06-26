/*
 * 검사할 것 : 면허종류(license), 카드 종류(card_type), 카드이름(card_name), 
 * 카드번호(cardNum1, cardNum2, cardNum3, cardNum4)
 * 유효기간 : validY, validM
 * 카드비밀번호 : cardPwd
 * 주민등록번호(6자리) : birth_first
 * 체크박스 : rule
 */
function bookingCheck(){

	var license_radio = document.getElementsByName('license');
	var card_type_radio = document.getElementsByName('card_type');
    var license_val = null;
    var card_type_val = null;

    for(var i=0; i<license_radio.length; i++) {
        if (license_radio[i].checked == true) {
        	license_val = license_radio[i].value;
        }
    }

    if (license_val == null) {
        alert("면허종류를 선택해주세요!");
        document.formm.license.focus();
        return false;
    }

    for(var i=0; i<card_type_radio.length; i++) {
        if (card_type_radio[i].checked == true) {
        	card_type_val = card_type_radio[i].value;
        }
    }

    if (card_type_val == null) {
        alert("카드 종류를 선택해주세요!");
        document.formm.card_type.focus();
        return false;
    }

	if(document.formm.card_name.value==""){
		alert("카드이름을 선택해주세요!");
		document.formm.card_name.focus();
		return false;
	}else if(document.formm.cardNum1.value==""){
		alert("카드 번호를 입력해주세요!");
		document.formm.cardNum1.focus();
		return false;
	}else if(document.formm.cardNum2.value==""){
		alert("카드 번호를 입력해주세요!");
		document.formm.cardNum2.focus();
		return false;
	}else if(document.formm.cardNum3.value==""){
		alert("카드 번호를 입력해주세요!");
		document.formm.cardNum3.focus();
		return false;
	}else if(document.formm.cardNum4.value==""){
		alert("카드 번호를 입력해주세요!");
		document.formm.cardNum4.focus();
		return false;
	}else if(document.formm.validY.value==""){
		alert("유효기간(년)을 입력해주세요!");
		document.formm.validY.focus();
		return false;
	}else if(document.formm.validM.value==""){
		alert("유효기간(월)을 입력해주세요!");
		document.formm.validM.focus();
		return false;
	}else if(document.formm.cardPwd.value==""){
		alert("카드 비밀번호를 입력해주세요!");
		document.formm.cardPwd.focus();
		return false;
	}else if(document.formm.birth_first.value==""){
		alert("주민등록번호 앞자리를 입력해주세요!");
		document.formm.birth_first.focus();
		return false;
	}else if(document.formm.rule.checked==false){
		alert("약관에 동의해주세요!");
		document.formm.rule.focus();
		return false;
	}else{
		document.formm.submit();
	}
}