<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post"
		action="${pageContext.request.contextPath}/member/login.do">
		아이디: <input type="text" name="id"> 비밀번호: <input
			type="password" name="pwd"> <input type="submit" value="로그인">
	</form>
	
	 <p><c:out value="${msg}" /></p>

</body>
</html>