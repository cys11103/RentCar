/*
 * 관리자 js
 */

/*
 * 차량 정보 삭제 
 */
function delete_admin_car(){
	
	var deleteCheck = confirm("차량정보를 삭제하시겠습니까?");
	if(deleteCheck){
		alert("삭제되었습니다.");
		document.formm.submit();
	}else{
		return false;
	}
}

/*
 * 
 */
function go_search() {
	var theForm = document.frm;
	theForm.action =  "admin_product_list";
	theForm.submit();
}

function go_total() {
	var theForm = document.frm;
	theForm.key.value = "";
	theForm.action =  "admin_product_list";
	theForm.submit();
}
