<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록2-1</title>
</head>
<body>
	<h3>상품 정보 등록2-1</h3>
	<form method="post" action="/projectData/product/newProduct2-1">
		상품번호 <input type="text" name="no"><br>
		상품명 <input type="text" name="name"><br>
		가격 <input type="text" name="price"><br>
		제조회사 <input type="text" name="company"><br>
		제조일 <input type="text" name="date"><br>
		재고 <input type="text" name="stock"><br>
		<input type="submit" value="등록">
		<input type="reset" value="취소">
	</form>
</body>
</html>
