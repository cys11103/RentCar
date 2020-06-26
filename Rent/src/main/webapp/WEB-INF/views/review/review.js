/*
 * ReviewForm 자바스크립트
 */

function check_form(){
	
	var score_radio = document.getElementsByName('score');
	var score_val = null;
	
	for(var i=0; i<score_radio.length; i++){
		if(score_radio[i].checked == true){
			score_val = score_radio[i].value;
		}
	}
	
	if(score_val==null){
		alert("점수를 선택해주세요!");
		document.formm.score.focus();
		return false;
	}else if(document.formm.content.value==""){
		alert("후기를 작성해주세요!");
		document.formm.content.focus();
		return false;
	}else{
		var insertCheck = confirm("후기를 등록하시겠습니까?");
		if(insertCheck){
			alert("등록되었습니다.");
		}
		document.formm.submit();
	}
}