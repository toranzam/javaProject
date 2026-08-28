package forward.binding;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * redirect 시 binding 기능 활용
 */
@WebServlet("/bindingfirst")
public class BindingRedirectFirst extends HttpServlet {

  /**
   * redirect 진행
   * Attribute에 전달한 데이터를 저장해서 보냄
   * request.setAttribute("attr이름", "attr값")
   */
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding(StandardCharsets.UTF_8.name());
    resp.setContentType("text/html;charset=utf-8");
    req.setAttribute("name", "홍길동");
    req.setAttribute("address", "서울시 강남구");

    resp.sendRedirect("bindingsecond");
    // sendRedirect는 request/response 객체 소멸시킴
    // Attribute는 객체와 같이 소멸됨
    // bindingsecond는 새로운 request와 response를 전달 받음 -> Attribute 없음
    // Attribute는 request 객체가 소멸없이 전달 되어야 사용 가능

  }

}
