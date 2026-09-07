<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>신규 게시글 작성</title>
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
	<h1>신규 게시글 작성</h1>
	<form action="post_new_send.jsp" method="post" onsubmit="return submitHandler(this)">
		<table>
			<tr>
				<td>작성자</td>
				<td><input type="text" name="writer"></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="10" cols="20" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="submit">저장</button>
					<button type="button" onclick="location.href='post_list.jsp'">목록으로</button>
					<button type="reset">초기화</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>