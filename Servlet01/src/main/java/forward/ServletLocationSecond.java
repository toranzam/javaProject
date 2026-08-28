package forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sec03")
public class ServletLocationSecond extends HttpServlet {

  /**
   * javascript로 포워딩 되는 서블릿
   */
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html;charset=utf-8");
    PrintWriter out = resp.getWriter();

    out.print("<html><body>");
    out.print("자바스크립트에 의해 요청");
    out.println("</body></html>");
  }

}
