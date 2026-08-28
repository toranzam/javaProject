package servletrequest;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 파라미터 name을 모를 때 파라미터 name값을 추출
 * getParameterNames()
 */
@WebServlet("/input2")
public class InputServlet2 extends HttpServlet {

  /*
   * request.getParameterNames() -> 파라미터명을 enumeration 타입으로 반환
   */
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding(StandardCharsets.UTF_8.name());
    Enumeration<String> enu = req.getParameterNames();

    while (enu.hasMoreElements()) {
      String name = enu.nextElement();
      String[] values = req.getParameterValues(name);
      for (String value : values) {
        System.out.print("name=" + name + ",value=" + value);
        System.out.println();
      }

    }
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

  }

}