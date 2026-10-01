// 비동기 axios get
$(document).ready(function() {
    $("#bookNoCheckBtn").on('click', function(e) {
        e.preventDefault();

        let bookNo = $("#bookNo").val();

        if (bookNo == "") {
            alert("책 번호를 입력하세요")
            return
        } else {
            axios.get("/book/bookNoCheck3", { params: { bookNo: bookNo } })
                .then(res => {
                    console.log(res);
                    if (res.data == "available") {
                        alert("사용 가능한 번호 입니다3")
                    } else {
                        alert("사용 불가능한 번호 입니다3")
                    }
                })
                .catch(err => console.log(err));
        }

    });

})