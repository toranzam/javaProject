package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProductDAO;
import model.ProductDTO;
import java.util.ArrayList;

@WebServlet("/productList")
public class ProductControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		ProductDAO dao = new ProductDAO();
		ArrayList<ProductDTO> productList = dao.productSelect();
		request.setAttribute("productList", productList);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("view/productListView.jsp");
		dispatch.forward(request, response); // request단의 attriute memList 전송됨
	}

}
