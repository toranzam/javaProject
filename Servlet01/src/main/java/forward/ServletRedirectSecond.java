package forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sec01")
public class ServletRedirectSecond extends HttpServlet {

  /**
   * redirect 되는 서블릿
   */
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html;charset=utf-8");
    PrintWriter out = resp.getWriter();

    out.print("<html><body>");
    out.print("sendRedirect를 이용한 redirect 포워딩");
    out.println("</body></html>");

  }

}
