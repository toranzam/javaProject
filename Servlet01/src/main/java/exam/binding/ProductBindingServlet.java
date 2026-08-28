package exam.binding;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/product1")
public class ProductBindingServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    req.setCharacterEncoding(StandardCharsets.UTF_8.name());

    ProductVO product1 = new ProductVO(1L, "키보드", 50000, 20);
    ProductVO product2 = new ProductVO(2L, "마우스", 30000, 15);
    ProductVO product3 = new ProductVO(3L, "헤드셋", 5000, 30);

    List<ProductVO> productList = List.of(product1, product2, product3);

    req.setAttribute("product", productList);

    RequestDispatcher dispatcher = req.getRequestDispatcher("product2");
    dispatcher.forward(req, resp);

  }

}
