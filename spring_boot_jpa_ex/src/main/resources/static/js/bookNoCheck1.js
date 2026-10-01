// 비동기 ajax
$(document).ready(function() {
    $("#bookNoCheckBtn").on('click', function(e) {
        e.preventDefault();

        let bookNo = $("#bookNo").val();

        if (bookNo == "") {
            alert("책 번호를 입력하세요")
            return
        } else {
            $.ajax({
                type: "POST",
                url: "/book/bookNoCheck1",
                data: {
                    "bookNo": bookNo,
                },
                dataType: "text",
                success: function(res) {
                    console.log(res);
                    if (res == "available") {
                        alert("사용가능한 번호입니다1")
                    } else {
                        alert("사용 불가능한 번호입니다1")
                    }
                },
                error: function() {
                    alert("전송실패")
                },
            });
        }
		
    });

})