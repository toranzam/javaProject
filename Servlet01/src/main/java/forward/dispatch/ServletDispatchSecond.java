package forward.dispatch;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpClient;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dispatch02")
public class ServletDispatchSecond extends HttpServlet {

  /**
   * 서블릿에 의해 포워딩 대싱이 되는 클래스
   */

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    req.setCharacterEncoding(StandardCharsets.UTF_8.name());
    String name = req.getParameter("name");
    String age = req.getParameter("age");

    resp.setContentType("text/html;charset=utf-8");
    PrintWriter out = resp.getWriter();
    System.out.println("서블릿에 의해 포워딩");

    out.println("<html><body>");
    out.println("이름 : " + name + "<br/>");
    out.println("나이 : " + age + "<br/>");
    out.println("</body></html>");

  }

}
