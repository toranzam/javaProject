/* 
    전체 선택과 삭제 처리할 자바스크립트 
*/

$(document	).ready(function() {
    // [전체선택] 체크박스 체크한경우
    $("#allCheck").on('click', function() {
        let chk = $("#allCheck").prop("checked");

        if (chk) { // 전체 선택이 체크된 경우
            $(".chkDelete").prop("checked", true);
			
        } else { // 전체 선택 체크가 풀린 경우
            $(".chkDelete").prop("checked", false);
        }
		
		// 개별 체크박스 해제할 경우 [전체 선택] 체크박스 해제 
		// 개별 체크박스 모두 체크되었을때 [전체 선택] 체크박스 체크
		$('.chkDelete').on('click', function() { 
			// 어떤 개별 체크박스에서던 click 이벤트가 발생하면 아래 절차를 수행
			let total = $('.chkDelete').length; // 개별 체크박스의 전체 개수
		});
		

    }); // on 끝 
}); //ready 끝 