package exam.ojdbc;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/product02")
@SuppressWarnings("unchecked")
public class ProductViewServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doHandle(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doHandle(req, resp);
  }

  protected void doHandle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html;charset=utf-8");

    List<ProductVO> productList = (List<ProductVO>) req.getAttribute("product");

    PrintWriter out = resp.getWriter();

    out.print("<html><head></head><body>");
    out.print("<table border=1><tr align='center' bgcolor='gold'>");
    out.print("<td>제품번호</td><td>이름</td><td>가격</td><td>재고</td><td>삭제</td>");

    for (int i = 0; i < productList.size(); i++) {
      ProductVO vo = productList.get(i);
      Long id = vo.getProductId();
      String name = vo.getProductName();
      int price = vo.getPrice();
      int stock = vo.getStock();

      // 한행씩 테이블에 포함
      out.print("<tr><td>" +
          id + "</td><td>" +
          name + "</td><td>" +
          price + "</td><td>" +
          stock + "</td><td>" +
          "<a href='/Servlet01/memberDelete?id=" + id + "'>삭제</a></td></tr>");

    }
    out.print("</table></body></html>");

  }

}
