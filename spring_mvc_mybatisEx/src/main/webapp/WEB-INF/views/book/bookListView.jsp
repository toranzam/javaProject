<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 도서 조회</title>
</head>
<body>
	<h3>전체 도서 조회</h3>
	<table border="1" width="800">
		<tr>
			<th>도서번호</th>
			<th>도서명</th>
			<th>저자</th>
			<th>가격</th>
			<th>출판일</th>
			<th>재고</th>
			<th>출판사번호</th>
		</tr>
		<c:forEach var="book" items="${bookList}">
			<tr>
				<td><c:out value="${book.bookNo}" /></td>
				<td><c:out value="${book.bookName}" /></td>
				<td><c:out value="${book.bookAuthor}" /></td>
				<td><c:out value="${book.bookPrice}" /></td>
				<td><fmt:formatDate value="${book.bookDate}"
						pattern="yyyy-MM-dd" /></td>
				<td><c:out value="${book.bookStock}" /></td>
				<td><c:out value="${book.pubNo}" /></td>
			</tr>
		</c:forEach>
		<c:if test="${empty bookList}">
			<tr>
				<td colspan="7">등록된 도서가 없습니다.</td>
			</tr>
		</c:if>
	</table>
	<br>
	<a href="<c:url value='/'/>">홈으로 이동</a>
</body>
</html>
