package forward.binding;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * binding : request.setAttribute(속성명, 속성값)
 */
@WebServlet("/dispatchfirst")
public class BindingDispatchFirst extends HttpServlet {

  /**
   * 호출될 때 전달받은 request 객체에 속성을 포함하여 포워딩
   */
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding(StandardCharsets.UTF_8.name());

    req.setAttribute("name", "홍길동");
    req.setAttribute("address", "서울시 강남구");

    RequestDispatcher dispatcher = req.getRequestDispatcher("dispatchsecond");
    dispatcher.forward(req, resp);
  }

}
