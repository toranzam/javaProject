<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>keyword 확인</title>


<style>
.form {
	border: #323232 solid 1px;
	margin: auto;
	padding: 10px;
	width: 70vw;
	height: 100%;
}

.form__input {
	display: flex;
	flex-direction: column;
	gap: 1rem;
}

.form__input>div {
	display: flex;
	justify-content: space-between;
}

.form__button {
	margin-top: 10px;
	width: 100%;
}

.container {
	position: relative;
	overflow-x: auto;
	border: #323232 solid 1px;
	margin: 10px auto;
	padding: 10px;
	width: 70vw;
	height: 300px;
}

.container__header {
	position: absolute;
	top: 1rem;
	right: 1rem;
}
</style>

<script>
	//자바스크립트 정규식
	let re1 = new RegExp('abc'); // 문자열 패턴 
	let re2 = new RegExp(/abc/); // 리터럴형 패턴
	let re3 = /abc/;

	const regex = /^[ㄱ-ㅎ|가-힣|a-z|A-Z|0-9| |]+$/;

	console.log(re1.test("abcde"));
	console.log(/abc/.test("abxde"));
	console.log(re2.test("abbcde"));
	console.log(regex.test("<script"));
	console.log(regex.test("script>"));
	console.log(regex.test("scr<ipt"));
	console.log(regex.test("script"));

	function submitHandler() { // 파라미터를 서버로 전달하기 전에 XSS에 취약한 특수문자를 참조문자로 변경해서 서버로 전달
		let value = document.querySelector("input[name='keyword']").value;
		value = value.replaceAll("&", "&amp;");
		value = value.replaceAll("<", "&amp;").replaceAll(">", "&gt;");
		value = value.replaceAll("\\(", "&#40;").replaceAll("\\)", "&#41;");
		value = value.replaceAll("/", "&#x2F;");
		value = value.replaceAll("'", "&#x27;");
		value = value.replaceAll("\"", "&quot;");
		document.querySelector("input[name='keyword']").value = value;
	}
</script>
</head>
<body>
	<div class="form">
		<form method="get" action="reflected3.jsp"
			onsubmit="return submitHandler()">
			<div class="form_intput">
				<div>
					<span>검색어</span> <input type="text" name="keyword" />
				</div>
			</div>
			<input type="submit" value="검색" />
		</form>
	</div>
	<div class="container">
		<%
		// keyword값이 서버로부터 전송된 경우에는 여기서 출력
		request.setCharacterEncoding("UTF-8");
		String keyword = request.getParameter("keyword");
		if (keyword == null) {
			keyword = "";
		}
		%>

		<div class="container__haeder">
			검색어 <br>
			<%=keyword%>
			검색결과 :
		</div>
	</div>

	<!-- <script>alert("XSS ATTACK")</script> -->



</body>
</html>