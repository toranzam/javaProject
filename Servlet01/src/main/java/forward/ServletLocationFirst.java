package forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first03")
public class ServletLocationFirst extends HttpServlet {

  /**
   * javascript 통한 포워딩
   */
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html;charset=utf-8");
    PrintWriter out = resp.getWriter();

    out.print("<script type='text/javascript'>");
    out.print("location.href='sec03';");
    out.print("</script>");

  }

}
