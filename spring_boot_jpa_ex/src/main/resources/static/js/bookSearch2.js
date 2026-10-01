// ajax를 활용한 비동기 통신, 검색결과를 받아와서 정해진 위치에 태그 생성 후 포함

$(document).ready(function() {
    $('#bookSearchFrm1').on('submit', function(e) {
        e.preventDefault();

        // 폼에 있는 폼 data를 payload(파라미터)로 구성
        const formData = $(this).serialize();
        const keyword = $('#keyword').val();
        const type = $("#type").val();

        if (keyword == "" || type == "") {
            alert("검색조건과 검색어를 입력하세요");
            return false;
        }

        $.ajax({
            type: "post",
            url: "/book/bookSearch2",
            data: formData,
            success: function(result) {
                const resultBox = $('#searchResultBox');
                resultBox.html(result)
            },
            error: function(res) {
                alert("실패");
            }

        }); // ajax 끝
    }); // on 끝 
}); // ready 끝 