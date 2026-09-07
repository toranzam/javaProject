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
<title>글 수정</title>
<script>
  function submitHandler(form) {
      const fields = [
          form.querySelector("[name='writer']"),
          form.querySelector("[name='title']"),
          form.querySelector("[name='content']")
      ];
      for (const field of fields) {
          let value = field.value;
          value = value.replaceAll("&", "&amp;");
          value = value.replaceAll("<", "&lt;");
          value = value.replaceAll(">", "&gt;");
          value = value.replaceAll("(", "&#40;");
          value = value.replaceAll(")", "&#41;");
          value = value.replaceAll("/", "&#x2F;");
          value = value.replaceAll("'", "&#x27;");
          value = value.replaceAll("\"", "&quot;");
          field.value = value;
      }
      return true;
  }
  </script>
</head>
<body>
	<h1>글 수정</h1>
	<%
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String db_address = "jdbc:oracle:thin:@localhost:1521/freepdb1";
		String db_username = "sql_select";
		String db_pwd = "1234";
		Connection connection = DriverManager.getConnection(db_address, db_username, db_pwd);

		request.setCharacterEncoding("UTF-8");

		int num = Integer.parseInt(request.getParameter("num"));

		String query = "SELECT * FROM pratice_board WHERE num = ?";

		PreparedStatement pstmt = connection.prepareStatement(query);

		pstmt.setInt(1, num);

		ResultSet result = pstmt.executeQuery();

		while (result.next()) {
			pageContext.setAttribute("postNum", result.getInt("num"));
			pageContext.setAttribute("postWriter", result.getString("writer"));
			pageContext.setAttribute("postTitle", result.getString("title"));
			pageContext.setAttribute("postContent", result.getString("content"));
	%>

	<form action="post_modify_send.jsp" method="post"
		onsubmit="return submitHandler(this)">

		<input type="hidden" name="num" value="<c:out value='${postNum}'/>">

		<table border="1">
			<tr>
				<td>작성자</td>
				<td><input type="text" name="writer"
					value="<c:out value='${postWriter}'/>"></td>
			</tr>

			<tr>
				<td>제목</td>
				<td><input type="text" name="title"
					value="<c:out value='${postTitle}'/>"></td>
			</tr>

			<tr>
				<td>내용</td>
				<td><textarea rows="10" cols="20" name="content"><c:out
							value="${postContent}" /></textarea></td>
			</tr>

			<tr>
				<td colspan="2">
					<button type="submit">수정</button>

					<button type="button" onclick="location.href='post_list.jsp'">
						목록으로</button>

					<button type="reset">원상복구</button>
				</td>
			</tr>
		</table>
	</form>

	<%
	}
	} catch (Exception ex) {
	out.println("오류가 발생했습니다. 오류 메시지 : " + ex.getMessage());
	}
	%>
</body>
</html>