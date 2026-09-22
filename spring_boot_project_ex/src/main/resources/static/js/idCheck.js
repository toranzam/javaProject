/**
 * id 중복조회  
 */


// 1. id 입력했는지 여부 확인
// 입력하지 않았으면 메시지 출력 후 가입화면 
// 입력했다면 ajax 호출해서 id 중복 여부 확인 
// 사용가능하면 사용가능한 id 입니다 메시지 출력
// 아니면 불가능 메시지 출력
// 요청 url : /member/idCheck

$(document).ready(function() {

    $('#idCheck').click(function(e) {
        e.preventDefault();

        const memId = $('#memId').val().trim();

        if (memId === '') {
            alert('아이디를 입력해 주세요');
            $('#memId').focus();
            return;
        }

        $.ajax({
            type: "GET",
            url: "/member/idCheck",
            data: {
                "id": memId
            },
	            dataType: "json",
	            success: function(res) {
	                if (res === 0) {
	                    alert("사용 가능한 아이디입니다")
	                } else {
	                    alert('이미 사용 중인 아이디입니다')
	                    $('#memId').focus();
                }
            },
            error: function() {
                alert("아이디 중복확인 중 오류 발생")
            }


        }) // ajax 끝

 

    }) // click 끝

}) // ready 끝
