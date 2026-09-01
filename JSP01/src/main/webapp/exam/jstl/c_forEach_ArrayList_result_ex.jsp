<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<table border=1 align="center">
			<tr width="20%" bgcolor="#99ccff">
				<td width="20%"><b>번호</b></td>
				<td width="20%"><b>이름</b></td>
				<td width="20%"><b>가격</b></td>
				<td width="20%"><b>회사</b></td>
			</tr>
		<c:forEach var="data" items="${productList}">
			<tr align="center">
				<td>${data.prdNo}</td>
				<td>${data.prdName}</td>
				<td>${data.prdPrice}</td>
				<td>${data.prdCompany}</td>
			</tr>
		</c:forEach>
		
	</body>
</html>