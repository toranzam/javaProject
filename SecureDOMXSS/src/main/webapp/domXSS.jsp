<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	// http://www.naver.com/#example -> 슬라이스는 시작인덱스부터 끝까지 추출 
	// #first.jsp -> 시작 idx부터 마지막까지 추출해서 반환 : slice(1) 
	// first.jsp가 반환 
	const hash = window.locaion.hash.slice(1);
	if(hash) {
		window.location.href = decodeURIComponent(hash); // hash 내용을 uri로 구성 
		// 현재 hash가 #first.jsp라면 /first.jsp로 변경 구성됨
	}
	
	window.addEventListner('hashchange', function(){
		window.locaiton.href = decodeURIComponenet();
		
	})
</script>
</head>
<body>
	<a href="#first.jsp">First 바로가기</a>
	<a href="">Second 바로가기</a>
	
	<!--  
	http://localhost:8080/SecureDOMXSS/domXSS.jsp#자바스크립트스키마
	http://localhost:8080/SecureDOMXSS/domXSS.jsp#javascript: function a(){setTimeout(function(){alert('악성스크립트실행')},1000)}; a();
	 -->
</body>
</html>

<!-- 
	브라우저 해시를 일반 서버 uri에도 사용함 
	브라우저 해시는 싱글페이지를 구성하는 경우에 링크를 위해서 사용을 하게 됨
 -->