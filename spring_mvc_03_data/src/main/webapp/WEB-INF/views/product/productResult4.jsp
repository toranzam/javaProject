<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록 결과</title>
</head>
<body>
	<p>@ModelAttribute 사용</p>
	상품번호 : <c:out value="${productInfo.no}"/> <br>
	상품명 : <c:out value="${productInfo.name}"/> <br>
	가격 : <c:out value="${productInfo.price}"/> <br>
	제조회사 : <c:out value="${productInfo.company}"/> <br>
	제조일 : <c:out value="${productInfo.date}"/> <br>
	재고 : <c:out value="${productInfo.stock}"/> <br>
</body>
</html>
