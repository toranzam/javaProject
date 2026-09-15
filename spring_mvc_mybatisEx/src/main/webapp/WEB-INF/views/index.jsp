<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 관리</title>
</head>
<body>
	<h3>MyBatisEx 도서 관리</h3>
	<h4>도서 관리 시스템</h4>
	<a href="<c:url value='/book/listAllBook'/>">전체 도서 조회</a>
	<a href="<c:url value='/book/newBookForm'/>">도서 정보 등록 </a>
</body>
</html>
