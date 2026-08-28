package forward.binding;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bindingsecond")
public class BindingRedirectSecond extends HttpServlet {

  /**
   * binding은 request.Attribute 구조에 포함시켜서 전달됨
   * 추출 : getAttribute("attr 이름");
   */

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding(StandardCharsets.UTF_8.name());
    resp.setContentType("text/html;charset=utf-8");
    PrintWriter out = resp.getWriter();

    // bindingsecond는 새로운 request와 response를 전달 받음 -> Attribute 없음
    // null 반환
    String name = (String) req.getAttribute("name");
    String address = (String) req.getAttribute("address");

    out.println("<html><body>");
    out.println("성명 : " + name + "<br>");
    out.println("주소 : " + address + "<br>");
    out.println("</body></html>");

  }

}
