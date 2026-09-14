<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head><meta charset="UTF-8"><title>상품 관리</title></head>
<body>
    <h1>상품 관리</h1>
    <c:url var="productListUrl" value="/product/productSelect" />
    <a href="${productListUrl}">상품 목록 조회</a>
</body>
</html>
