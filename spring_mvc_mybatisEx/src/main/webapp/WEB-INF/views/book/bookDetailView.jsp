<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
 <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>상품 상세 정보 조회</title>
		<script>
			function deleteCheck() {
				let answer = confirm("삭제하시겠습니까?");
				if(answer==true) {
					location.href="<c:url value='/book/deleteBook/${book.bookNo}'/>";
				}
				
			}
		</script>
	</head>
	<body>
		 <h3>상품 상세 정보 조회</h3>
	     <table border="1" width="300">
				<tr><td>책번호</td><td>${book.bookNo}</td></tr>
				<tr><td>이름</td><td>${book.bookName}</td></tr>
				<tr><td>저자</td><td>${book.bookAuthor}</td></tr>
				<tr><td>가격</td><td>${book.bookPrice}</td></tr>
				<tr><td>가격</td><td>${book.bookPrice}</td></tr>
				<tr><td>출판일</td>	<td><fmt:formatDate value="${book.bookDate}" pattern="yyyy-MM-dd"/></td></tr>
				<tr><td>재고</td><td>${book.bookStock}</td></tr>
				<tr><td>출판사번호</td><td>${book.pubNo}</td></tr>
		</table><br><br>
		<a href="<c:url value='/book/updateBookForm/${book.bookNo}'/>">[책 정보 수정]</a> 
		<a href="javascript:deleteCheck();">[책 정보 삭제]</a>
    
	    <!--  index 페이지로 이동 링크 추가 -->
		<a href="<c:url value='/'/>">[홈으로 이동]</a> 
	</body>
</html>