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
	<p>커맨드 객체는 자동으로 Model에 포함되며, 기본 이름은 product입니다.</p>
	상품번호 : <c:out value="${product.no}"/> <br>
	상품명 : <c:out value="${product.name}"/> <br>
	가격 : <c:out value="${product.price}"/> <br>
	제조회사 : <c:out value="${product.company}"/> <br>
	제조일 : <c:out value="${product.date}"/> <br>
	재고 : <c:out value="${product.stock}"/> <br>
</body>
</html>
