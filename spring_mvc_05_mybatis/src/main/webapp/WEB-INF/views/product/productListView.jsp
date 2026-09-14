<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>전제 상품 조회</title>		 
	</head>
	<body>
		<h3>전체 상품 조회</h3>		
		<table border="1" width="600">
			<table border="1" width="600">
			<tr><th>상품번호</th>
			<th>상품명</th>
			<th>상품가격</th>
			<th>제조사</th>
			<th>재고</th>
			<th>제조일</th>
			</tr>
			
			<!-- 반복문 사용해서 모든 데이터 출력 -->
			<!-- 상품번호에 링크 설정 : /product/detailViewProduct -->
			<!-- 날짜 포맷 설정 : 2025-05-10 형식 -->
			<!-- 전달된 model	attr를 활용 출력하는 코드 작성 : ~17:50 -->

			<tr>
				<td><a href=""></a></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
						
		</table><br><br>
		
		<!--  index 페이지로 이동 링크 추가 -->
		<a href="">홈으로 이동</a>
	</body>
</html>