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
    <h3>상품 등록 결과</h3>
    상품번호 : <c:out value="${no}"/> <br>
    상품명 : <c:out value="${name}"/> <br>
    가격 : <c:out value="${price}"/> <br>
    제조회사 : <c:out value="${company}"/> <br>
    제조일 : <c:out value="${date}"/> <br>
    재고 : <c:out value="${stock}"/> <br>

    <a href="/projectData/product/path/${prdName}">상품명 전달</a><br>
    <a href="/projectData/product/path/${prdName}/${prdStock}/${prdNo}">상품명, 재고, 상품번호 전달</a><br>
</body>
</html>
