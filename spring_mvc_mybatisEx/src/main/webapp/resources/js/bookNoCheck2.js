// 비동기 fetch
$(document).ready(function() {
    $("#bookNoCheckBtn").on('click', function(e) {
        e.preventDefault();

        let bookNo = $("#bookNo").val();

        if (bookNo == "") {
            alert("책 번호를 입력하세요")
            return
        } else {
            fetch("/mybatisEx/book/bookNoCheck2/" + bookNo)
                .then(res => res.text())
                .then(res => {
                    if (res == "available") {
                        alert("사용가능한 번호2")
                    } else {
                        alert("사용불가능한 번호2")
                    }
                })
				.catch(err => console.log(err));
        }

    });

})