<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head><meta charset="UTF-8"><title>상품 목록</title>
<style>
			.cls1 {
				font-size:40px;
				text-align:center;
			}
			
			.cls2 {
				font-size:20px;
				text-align:center;
			}
		</style>
</head>
<body>
    <p class="cls1">상품 목록</p>
    <table align="center" border="1">
        <thead><tr align="center" bgcolor="lightgreen"><th width="7%">상품 번호</th><th width="7%">상품명</th><th width="7%">가격</th><th width="7%">재고</th></tr></thead>
        <tbody>
            <c:forEach var="product" items="${prdList}">
                <tr>
                    <td><c:out value="${product.productId}" /></td>
                    <td><c:out value="${product.productName}" /></td>
                    <td><c:out value="${product.price}" /></td>
                    <td><c:out value="${product.stock}" /></td>
                </tr>
            </c:forEach>
            <c:if test="${empty prdList}">
                <tr><td colspan="4">등록된 상품이 없습니다.</td></tr>
            </c:if>
        </tbody>
    </table>
    <c:url var="homeUrl" value="/" />
    <p class="cls2"><a href="${homeUrl}">처음으로</a></p>
</body>
</html>
