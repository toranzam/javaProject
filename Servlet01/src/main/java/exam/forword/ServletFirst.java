package exam.forword;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/refresh01")
public class ServletFirst extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding(StandardCharsets.UTF_8.name());
    resp.setContentType("text/html;charset=utf-8");

    String queryString = req.getQueryString();

    resp.addHeader("Refresh", "10;url=refresh02?" + queryString);

  }

}
