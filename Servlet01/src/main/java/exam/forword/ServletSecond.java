package exam.forword;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/refresh02")
public class ServletSecond extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    req.setCharacterEncoding(StandardCharsets.UTF_8.name());

    String name = req.getParameter("name");
    String id = req.getParameter("id");
    String password = req.getParameter("password");
    String[] phone = req.getParameterValues("phone");
    String year = req.getParameter("year");
    String[] interest = req.getParameterValues("interest");
    String department = req.getParameter("department");

    resp.setContentType("text/html;charset=utf-8");

    PrintWriter out = resp.getWriter();
    out.print("<html>");
    out.print("<body>");
    out.print("<h3>회원 가입 내용</h3><br/>");
    out.print("<p>성명 : " + name + "</p>");
    out.print("<p>ID : " + id + "</p>");
    out.print("<p>비밀번호 : " + password + "</p>");
    out.print("<p>휴대폰 번호 : " + phone[0] + "-" + phone[1] + "-" + phone[2] + "</p>");
    out.print("<p>학년 : " + year + "</p>");

    out.print("<p>관심분야 : ");
    for (String string : interest) {
      out.print(string + " ");
    }
    out.print("</p>");

    out.print("<p>학과 : " + department + "</p>");

    out.print("</body>");
    out.print("</html>");
  }

}
