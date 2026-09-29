<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>주문 목록</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/orderForm.css'/>">
    <c:import url="/WEB-INF/views/layout/head.jsp" />
</head>
<body>
    <div id="wrap">
        <c:import url="/WEB-INF/views/layout/top.jsp" />
        <section>
            <br>
            <h3>주문 목록</h3>
            <table class="order_list" border="1" width="900">
                <tr>
                    <th>주문번호</th>
                    <th>주문일</th>
                    <th>수령인</th>
                    <th>연락처</th>
                    <th>배송지</th>
                    <th>결제방법</th>
                </tr>
                <c:choose>
                    <c:when test="${empty ordList}">
                        <tr>
                            <td colspan="6">주문 내역이 없습니다.</td>
                        </tr>
                    </c:when>
                    <c:otherwise>
                        <c:forEach var="order" items="${ordList}">
                            <tr>
                                <td><c:out value="${order.ordNo}" /></td>
                                <td><c:out value="${order.ordDate}" /></td>
                                <td><c:out value="${order.ordRcvReceiver}" /></td>
                                <td><c:out value="${order.ordRcvPhone}" /></td>
                                <td>
                                    (<c:out value="${order.ordRcvZipcode}" />)
                                    <c:out value="${order.ordRcvAddress1}" />
                                    <c:out value="${order.ordRcvAddress2}" />
                                </td>
                                <td>
                                    <c:choose>
                                        <c:when test="${order.ordPay eq 'card'}">신용카드</c:when>
                                        <c:when test="${order.ordPay eq 'bank'}">계좌이체</c:when>
                                        <c:otherwise><c:out value="${order.ordPay}" /></c:otherwise>
                                    </c:choose>
                                </td>
                            </tr>
                        </c:forEach>
                    </c:otherwise>
                </c:choose>
            </table>
            <br>
            <a href="<c:url value='/'/>">홈으로 이동</a>
            <br><br>
        </section>
        <c:import url="/WEB-INF/views/layout/bottom.jsp" />
    </div>
</body>
</html>
