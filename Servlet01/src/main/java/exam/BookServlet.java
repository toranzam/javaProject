package exam;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/bookInsert")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		System.out.println("객체 생성");
	}

	/**
	 * form method post 요청 처리
	 * 1개의 파라미터 value를 추출할 때 사용 : getParameter (input type text, password...)
	 * 동일 파라미터명으로 여러개의 파라미터가 전송되면 getParameter는 처음 보이는 파라미터의 값만 반환
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding(StandardCharsets.UTF_8.name());
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String author = request.getParameter("author");
		String price = request.getParameter("price");
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String stock = request.getParameter("stock");
		String pubNo = request.getParameter("pub_no");

		System.out.println("도서번호 : " + no);
		System.out.println("도서명 : " + name);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + price);
		System.out.println("발행일 : " + year + "-" + month + "-" + day);
		System.out.println("재고 : " + stock);
		System.out.println("출판사번호 : " + pubNo);

	}

}
