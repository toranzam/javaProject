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
            url: "/book/bookSearch3",
            data: formData,
            success: function(result) {
                const resultBox = $('#searchResultBox');
                resultBox.empty();

                const table = $('<table>', {
                    id: 'resultTable',
                    border: 1,
                    width: 500
                })

                const header = $('<tr>');
                header.append($('<th>').text('책번호'));
                header.append($('<th>').text('책이름'));
                header.append($('<th>').text('책저자'));
                header.append($('<th>').text('책가격'));
                header.append($('<th>').text('출판일'));
                header.append($('<th>').text('책재고'));
                header.append($('<th>').text('출판사번호'));

                table.append($('<thead>').append(header));

                const tbody = $('<tbody>');
                table.append(tbody);
                resultBox.append(table);

                if (result.length === 0) {
                    const row = $('<tr>');
                    row.append($('<td>', {
                        colspan: 7,
                        align: 'center'
                    }).text('찾는 상품이 없습니다')
                    );
                    tbody.append(row);
                    return;
                }


                for (let i = 0;i < result.length;i++) {
                    const book = result[i]

                    const date = new Date(book.bookDate);
                    const year = date.getFullYear();
                    const month = String(date.getMonth() + 1).padStart(2, '0');
                    const day = String(date.getDate()).padStart(2, '0');
                    const prdDate = `${year}-${month}-${day}`

                    const row = $('<tr>');
                    row.append($('<td>').text(book.bookNo));
                    row.append($('<td>').text(book.bookName));
                    row.append($('<td>').text(book.bookAuthor));
                    row.append($('<td>').text(book.bookPrice));
                    row.append($('<td>').text(book.bookDate));
                    row.append($('<td>').text(book.bookStock));
                    row.append($('<td>').text(book.pubNo));

                    const image = $('<img>', {
                        src: `/book_images/${book.bookNo}.jpg`,
                        width: 30,
                        height: 20,
                    })

                    row.append($('<td>').append(image))
                    tbody.append(row);

                }
            },
            error: function(result) {
                alert("실패");
            }


        }); // ajax 끝



    }); // on 끝 


}); // ready 끝 