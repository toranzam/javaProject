<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
<!-- 
	1. 상품목록보기 자체를 요청 한 경우 
	2. 상품 등록 후에 목록보기로 포워딩 된 경우(attr로 msg가 전송됨)
 -->
<meta charset="UTF-8">
<title>상품 정보 출력창</title>
<c:choose>
	<c:when test='${msg=="addProduct"}'>
		<script type="text/javascript">
			window.onload = function() {
				alert("상품등록 완료!")
			}
		</script>
	</c:when>
	<c:when test='${msg=="modified"}'>
		<script type="text/javascript">
			window.onload = function() {
				alert("상품등록 수정 완료!")
			}
		</script>
	</c:when>
	<c:when test='${msg=="deleted"}'>
		<script type="text/javascript">
			window.onload = function() {
				alert("상품등록 삭제 완료!")
			}
		</script>
	</c:when>
</c:choose>
<style>
.cls1 {
	font-size: 40px;
	text-align: center;
}

.cls2 {
	font-size: 20px;
	text-align: center;
}
</style>

</head>
<body>
	<p class="cls1">상품정보</p>
	<table align="center" border="1">
		<tr align="center" bgcolor="lightgreen">
			<td width="7%"><b>상품번호</b></td>
			<td width="7%"><b>상품명</b></td>
			<td width="7%"><b>가격</b></td>
			<td width="7%"><b>재고</b></td>
			<td width="7%"><b>수정</b></td>
			<td width="7%"><b>삭제</b></td>
		</tr>
		<c:choose>
			<c:when test="${empty productsList }">
				<tr>
					<td colspan=6><b>등록된 상품이 없습니다</b></td>
				</tr>
			</c:when>
			<c:when test="${!empty productsList }">
				<c:forEach var="prd" items="${productsList}">
					<tr>
						<td>${prd.id}</td>
						<td>${prd.name}</td>
						<td>${prd.price}</td>
						<td>${prd.stock}</td>
						<td><a
							href="${contextPath}/product/modProductForm.do?id=${prd.id}">수정</a></td>
						<td><a
							href="${contextPath}/product/delProduct.do?id=${prd.id}">삭제</a></td>
					</tr>
				</c:forEach>
			</c:when>
		</c:choose>
	</table>
	<a href="${contextPath}/product/productForm.do"><p class="cls2">상품
			등록하기</p></a>
</body>
</html>
