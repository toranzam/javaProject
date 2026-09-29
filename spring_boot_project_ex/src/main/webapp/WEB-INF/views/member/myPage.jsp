<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>마이페이지</title>
    <c:import url="/WEB-INF/views/layout/head.jsp" />
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/orderForm.css'/>">
</head>
<body>
    <div id="wrap">
        <c:import url="/WEB-INF/views/layout/top.jsp" />
        <section>
            <h3>마이페이지</h3>
            <c:choose>
                <c:when test="${empty member}">
                    <p>회원 정보를 불러올 수 없습니다.</p>
                </c:when>
                <c:otherwise>
                    <table border="1">
                        <tr>
                            <th>회원 ID</th>
                            <td><c:out value="${member.memId}" /></td>
                        </tr>
                        <tr>
                            <th>이름</th>
                            <td><c:out value="${member.memName}" /></td>
                        </tr>
                        <tr>
                            <th>이메일</th>
                            <td><c:out value="${member.memEmail}" /></td>
                        </tr>
                        <tr>
                            <th>휴대폰 번호</th>
                            <td><c:out value="${member.memHp}" /></td>
                        </tr>
                        <tr>
                            <th>가입일</th>
                            <td>
                                <c:if test="${not empty member.memJoinDate}">
                                    <fmt:formatDate value="${member.memJoinDate}" pattern="yyyy-MM-dd" />
                                </c:if>
                            </td>
                        </tr>
                        <tr>
                            <th>주소</th>
                            <td>
                                (<c:out value="${member.memZipcode}" />)
                                <c:out value="${member.memAddress1}" />
                                <c:out value="${member.memAddress2}" />
                            </td>
                        </tr>
                    </table>
                </c:otherwise>
            </c:choose>
            <br>
            <p>
                <a href="<c:url value='/order/orderListView'/>">주문 목록 보기</a>
                &nbsp;|&nbsp;
                <a href="<c:url value='/product/cartList'/>">장바구니 보기</a>
                &nbsp;|&nbsp;
                <a href="<c:url value='/member/updateForm'/>">회원정보 수정</a>
                &nbsp;|&nbsp;
                <a href="<c:url value='/member/delete'/>">회원탈퇴</a>
                
            </p>
            <br>
        </section>
        <c:import url="/WEB-INF/views/layout/bottom.jsp" />
    </div>
</body>
</html>
