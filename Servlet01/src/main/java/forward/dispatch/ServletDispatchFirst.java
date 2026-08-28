package forward.dispatch;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dispatch01")
public class ServletDispatchFirst extends HttpServlet {

  /**
   * RequestDispatcher 클래스를 이용한 포워딩
   * 서버 내부에서 서블릿을 재요청 진행하는 상황이여서 클라이언트는 알 수 없음
   * 포워딩이 된 후에도 클라이언트 요청 주소는 초기 요청 주소가 표현
   */

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name = "홍길동";
    int age = 30;
    // get 방식 요청에 payload를 추가해서 url 구성 - 내부 통신 이므로 인코딩 안해도 됨
    RequestDispatcher dispatch = req.getRequestDispatcher("dispatch02?name=" + name + "&age=" + age);
    dispatch.forward(req, resp); // 클라이언트 정보 전달(request, response)

  }

}
