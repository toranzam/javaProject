$(document).ready(function() {
    $('#prdNoCheckBtn').on('click', function(event) {

        event.preventDefault();

        let prdNo = $('#prdNo').val();

        if (prdNo == "") {
            alert("상품번호를 입력하세요");
            return
        } else {
            // 서버로 상품번호 전달 중복확인
            $.ajax({
                type: "POST",
                url: "/product/prdNoCheck",
                data: {
                    "prdNo": prdNo,
                },
                dataType: "text",
                success: function(result) {
                    console.log(result);
                    if (result == "available") {
                        alert("사용가능한 번호입니다2")
                    } else {
                        alert("사용 불가능한 번호입니다2")
                    }
                },
                error: function() {
                    alert("전송실패")
                },
            }); // ajax 끝

        } // else 끝




    }); // on 끝 
}); // ready 끝