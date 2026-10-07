<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="<c:url value='/css/basic.css'/>" />
<link rel="stylesheet" href="<c:url value='/css/login.css'/>" />
</head>
<body>

	<main class="login-page">
		<form class="login-form" action="<c:url value='/login'/>" method="post">
			<div class="login-heading">
				<h1 class="login-logo">PC PICK</h1>
				<p class="login-description">가입하실 때 사용한 아이디와 비밀번호를 입력해주세요.</p>
			</div>

			<div class="login-fields">
				<input class="login-input" placeholder="아이디" type="text"
					name="loginId" /> <input class="login-input" placeholder="비밀번호"
					type="password" name="password" />
			</div>

			<div class="login-actions">
				<button class="login-button" type="submit">로그인</button>
				<a class="login-link" href="/join">회원가입</a> <a class="login-link">아이디
					/ 비밀번호 찾기</a>
			</div>
		</form>
	</main>


</body>
</html>