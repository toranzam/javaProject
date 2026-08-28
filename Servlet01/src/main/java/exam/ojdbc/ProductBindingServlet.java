package exam.ojdbc;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/product01")
public class ProductBindingServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doProcess(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doProcess(req, resp);
  }

  private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    ProductDAO dao = new ProductDAO();
    ArrayList<ProductVO> productList = dao.productSelect();

    req.setAttribute("product", productList);

    RequestDispatcher dispatcher = req.getRequestDispatcher("product02");
    dispatcher.forward(req, resp);

  }

}
