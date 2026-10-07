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
<script src="https://t1.kakaocdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js" defer></script>
<script src="<c:url value='/js/join.js'/>" defer></script>
</head>
<body>

	<main class="login-page">
		<form class="login-form" action="<c:url value='/join'/>" method="post">
			<div class="login-heading">
				<h1 class="login-logo">PC PICK</h1>
				<p class="login-description">가입하실 때 사용한 아이디와 비밀번호를 입력해주세요.</p>
			</div>

			<div class="login-fields">
				<input class="login-input" placeholder="아이디" type="text"
					name="loginId" /> <input class="login-input" placeholder="이름"
					type="text" name="memberName" />
				<input class="login-input" placeholder="이메일" type="email"
					name="email" autocomplete="email" maxlength="254" required aria-label="이메일" />
				<input class="login-input" placeholder="전화번호" type="tel"
					name="phone" autocomplete="tel" maxlength="20" required aria-label="전화번호" />
				<input class="login-input" placeholder="비밀번호" type="password" name="password" /> <input
					class="login-input" placeholder="비밀번호 확인" type="password"
					name="passwordCheck" />
				<div class="join-postal-row">
					<input class="login-input" placeholder="우편번호" type="text"
						name="postalCode" id="join-postal-code" readonly aria-label="우편번호" />
					<button class="join-address-button" id="join-address-search"
						type="button">주소 검색</button>
				</div>
				<input class="login-input" placeholder="주소" type="text"
					name="addressLine1" id="join-address-line1" readonly />
				<input class="login-input" placeholder="상세 주소" type="text"
					name="addressLine2" id="join-address-line2" />
			</div>

			<div class="login-actions">
				<button class="login-button" type="submit">회원가입</button>

			</div>
		</form>
	</main>


</body>
</html>