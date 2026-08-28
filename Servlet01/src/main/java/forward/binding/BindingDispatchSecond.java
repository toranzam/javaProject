package forward.binding;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 바인딩 정보를 추출해서 클라이언트에게 응답데이터로 보냄
 */
@WebServlet("/dispatchsecond")
public class BindingDispatchSecond extends HttpServlet {

  /**
   * request 객체가 포워딩될 때 같이 전달
   */
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding(StandardCharsets.UTF_8.name());
    resp.setContentType("text/html;charset=utf-8");

    String name = (String) req.getAttribute("name"); // 반환값의 타입은 Object -> 형변환
    String address = (String) req.getAttribute("address");

    PrintWriter out = resp.getWriter();
    out.println("<html><body>");
    out.println("성명 : " + name + "<br>");
    out.println("주소 : " + address + "<br>");
    out.println("</body></html>");
  }

}
