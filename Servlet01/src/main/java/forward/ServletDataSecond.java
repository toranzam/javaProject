package forward;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpClient;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * redirect 될때 클라이언트가 서버로부터 전달받은 데이터를 페이로드로 전달
 */
@WebServlet("/sec04")
public class ServletDataSecond extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding(StandardCharsets.UTF_8.name());
    String name = req.getParameter("name");
    String age = req.getParameter("age");

    resp.setContentType("text/html;charset=utf-8");
    PrintWriter out = resp.getWriter();
    out.println("<html><body>");
    out.println("이름 : " + name + "<br>");
    out.println("나이 : " + age + "<br>");
    out.println("</body></html>");
  }

}
