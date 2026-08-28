package exam;

import java.io.IOException;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insertMember")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String[] phone = request.getParameterValues("phone");
		String year = request.getParameter("year");
		String[] interests = request.getParameterValues("interest");
		String department = request.getParameter("department");

		System.out.println("성명: " + name);
		System.out.println("ID: " + id);
		System.out.println("비밀번호: " + password);
		System.out.println("휴대폰 번호: " + Arrays.toString(phone));
		System.out.println("학년: " + year);
		System.out.println("관심 분야: " + Arrays.toString(interests));
		System.out.println("학과: " + department);
	}

}
