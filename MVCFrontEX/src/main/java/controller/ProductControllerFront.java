package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.ProductDAO;
import model.ProductVO;


@WebServlet("/product/*")
public class ProductControllerFront extends HttpServlet {
	ProductDAO productDAO;

	public void init() {
		productDAO = new ProductDAO(); 
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		
		if(session == null || session.getAttribute("loginId") == null) {
			response.sendRedirect(request.getContextPath() + "/member/loginForm.do");
			return;
		}
		
		String nextPage = null; 
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String action = request.getPathInfo();
		System.out.println("action : " + action);

		if (action == null || action.equals("/") || action.equals("/listProducts.do")) {
			List<ProductVO> productsList = productDAO.listProducts();
			request.setAttribute("productsList", productsList);
			nextPage = "/prdView/listProducts.jsp"; // 포워딩될 url
		} else if (action.equals("/productForm.do")) {
			nextPage = "/prdView/productForm.jsp";
		} else if (action.equals("/addProduct.do")) { // 상품 등록
			String id = request.getParameter("id");
			int price = Integer.parseInt(request.getParameter("price"));
			String name = request.getParameter("name");
			int stock = Integer.parseInt(request.getParameter("stock"));
			ProductVO productVO = new ProductVO(id, name, price, stock);
			productDAO.addProduct(productVO); // 상품 등록 완료

			request.setAttribute("msg", "addProduct");

			// 등록된 상품을 포함하는 목록 조회
			nextPage = "/product/listProducts.do";
		} else if (action.equals("/modProductForm.do")) { // 상품 정보 수정
			String id = request.getParameter("id");
			ProductVO productInfo = productDAO.findProduct(id); // 수정할 상품 정보 조회
			if (productInfo == null) {
				response.sendError(HttpServletResponse.SC_NOT_FOUND);
				return;
			}
			request.setAttribute("productInfo", productInfo);
			nextPage = "/prdView/modProductForm.jsp";
		} else if(action.equals("/modProduct.do")) {
			String id = request.getParameter("id");
			int price = Integer.parseInt(request.getParameter("price"));
			String name = request.getParameter("name");
			int stock = Integer.parseInt(request.getParameter("stock"));
			ProductVO productVO = new ProductVO(id, name, price, stock);
			productDAO.modProduct(productVO);
			
			request.setAttribute("msg", "modified");
			nextPage="/product/listProducts.do";
		} else if(action.equals("/delProduct.do")) {
			String id = request.getParameter("id");
			productDAO.delProduct(id);
			request.setAttribute("msg", "deleted");
			nextPage="/product/listProducts.do";
		} else {
			List<ProductVO> productsList = productDAO.listProducts();
			request.setAttribute("productsList", productsList);
			nextPage = "/prdView/listProducts.jsp"; 
		}
		RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
		dispatch.forward(request, response);
	}

}
