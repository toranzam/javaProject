<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>게시글 상세 열람</title>
</head>

<body>
	<h1>게시글 상세 열람</h1>
	<%
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521/freepdb1";
		String user = "sql_select";
		String pwd = "1234";
		Connection con = DriverManager.getConnection(url, user, pwd);

		String query = "SELECT * FROM pratice_board WHERE num = ?";
		int num = Integer.parseInt(request.getParameter("num"));

		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, num);

		ResultSet result = pstmt.executeQuery();
	%>

	<table border="1">
		<%
		while (result.next()) {
			pageContext.setAttribute("postNum", result.getInt("num"));
			pageContext.setAttribute("postRegdate", result.getTimestamp("regdate"));
			pageContext.setAttribute("postWriter", result.getString("writer"));
			pageContext.setAttribute("postTitle", result.getString("title"));
			pageContext.setAttribute("postContent", result.getString("content"));
		%>

		<tr>
			<td>번호</td>
			<td><c:out value="${postNum}" /></td>
		</tr>

		<tr>
			<td>작성일</td>
			<td><c:out value="${postRegdate}" /></td>
		</tr>

		<tr>
			<td>작성자</td>
			<td><c:out value="${postWriter}" /></td>
		</tr>

		<tr>
			<td>제목</td>
			<td><c:out value="${postTitle}" /></td>
		</tr>

		<tr>
			<td>내용</td>
			<td><c:out value="${postContent}" /></td>
		</tr>

		<tr>
			<td colspan="2">
				<button type="button" onclick="location.href='post_list.jsp'">
					목록으로</button>
			</td>
		</tr>

		<%
		}
		%>
	</table>
	<%
	} catch (Exception ex) {
	out.println("오류가 발생했습니다. 오류 메시지 : " + ex.getMessage());
	}
	%>

</body>
</html>