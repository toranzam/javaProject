<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MAIN</title>
</head>
<body>
	<h3>MyBatis 사용 DB 연동</h3>
	<h4>상품 관리 시스템 <img src="<c:url value='/image/apple.png'/>"/></h4>
	<br>
	<a href="<c:url value='/product/listAllProduct'/>">전체상품조회</a>
	<a href="<c:url value='/product/newProductForm'/>">상품 등록</a>
	<a href="<c:url value='/product/productSearchForm1'/>">상품 검색1</a>
	
	<br>
	
	<h4>파일 업로드</h4>
	<a href="<c:url value='/fileUploadForm'/>">파일 업로드</a>
	<a href="<c:url value='/fileDownloadList'/>">파일 다운로드</a><br>
	<a href="<c:url value='/imageFileUploadForm'/>">비동기 파일 업로드</a><br>
	
	<br>
	
	<h4>Ajax 연습</h4>
	<a href="<c:url value='/loginForm'/>">로그인</a>
	<a href="<c:url value='/loginForm2'/>">로그인</a>  

</body>
</html>