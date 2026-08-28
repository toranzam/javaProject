package forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first02")
public class ServletRefreshFirst extends HttpServlet {

  /**
   * refresh 통한 포워딩
   */
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html;charset=utf-8");
    PrintWriter out = resp.getWriter();

    out.print("<html><body>");
    out.print("addHeader()를 이용한 refresh 포워딩전 내용");
    out.println("</body></html>");
    // Refresh 속성 : 시간(초);url=맵핑이름
    resp.addHeader("Refresh", "10;url=sec02");

  }

}
