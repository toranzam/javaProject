<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원정보 수정</title>
    <c:import url="/WEB-INF/views/layout/head.jsp" />
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/orderForm.css'/>">
</head>
<body>
    <div id="wrap">
        <c:import url="/WEB-INF/views/layout/top.jsp" />
        <section>
            <h3>회원정보 수정</h3>
            <c:set var="hp" value="${fn:split(member.memHp, '-')}" />
            <form id="updateForm" method="post" action="<c:url value='/member/update'/>">
                <input type="hidden" name="memId" value="<c:out value='${sessionScope.sid}'/>">
                <table border="1">
                    <tr>
                        <th>회원 ID</th>
                        <td><c:out value="${sessionScope.sid}" /></td>
                    </tr>
                    <tr>
                        <th>이름</th>
                        <td><input type="text" name="memName" value="<c:out value='${member.memName}'/>" required></td>
                    </tr>
                    <tr>
                        <th>새 비밀번호</th>
                        <td><input type="password" name="memPwd" autocomplete="new-password" required></td>
                    </tr>
                    <tr>
                        <th>이메일</th>
                        <td><input type="email" name="memEmail" value="<c:out value='${member.memEmail}'/>"></td>
                    </tr>
                    <tr>
                        <th>휴대폰 번호</th>
                        <td>
                            <input type="text" name="memHp1" value="<c:out value='${hp[0]}'/>" size="3"> -
                            <input type="text" name="memHp2" value="<c:out value='${hp[1]}'/>" size="4"> -
                            <input type="text" name="memHp3" value="<c:out value='${hp[2]}'/>" size="4">
                        </td>
                    </tr>
                    <tr>
                        <th>우편번호</th>
                        <td><input type="text" name="memZipcode" value="<c:out value='${member.memZipcode}'/>"></td>
                    </tr>
                    <tr>
                        <th>주소</th>
                        <td>
                            <input type="text" name="memAddress1" value="<c:out value='${member.memAddress1}'/>" size="50"><br>
                            <input type="text" name="memAddress2" value="<c:out value='${member.memAddress2}'/>" size="50">
                        </td>
                    </tr>
                </table>
                <br>
                <button type="submit">수정하기</button>
            </form>
            <br>
            <a href="<c:url value='/member/myPage'/>">마이페이지로 돌아가기</a>
            <br><br>
        </section>
        <c:import url="/WEB-INF/views/layout/bottom.jsp" />
    </div>
</body>
</html>
