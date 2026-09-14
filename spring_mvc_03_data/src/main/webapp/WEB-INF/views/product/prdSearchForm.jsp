<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 검색</title>
</head>
<body>
	<h3>상품 검색</h3>
	<form method="post" action="/projectData/product/prdSearch">
		<select name="type">
			<option value="company">제조회사</option>
		</select>
		<input type="text" name="keyword">
		<input type="submit" value="검색">
	</form>
</body>
</html>
