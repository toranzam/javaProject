package ojdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 클라이언트 응답 당담(view)
 */
@SuppressWarnings("unchecked")
@WebServlet("/memberView")
public class MemberViewServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doHandle(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doHandle(req, resp);
  }

  private void doHandle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding(StandardCharsets.UTF_8.name());
    resp.setContentType("text/html;charset=utf-8");
    PrintWriter out = resp.getWriter();

    ArrayList<MemberVO> memList = (ArrayList<MemberVO>) req.getAttribute("memList");

    // 응답처리
    out.print("<html><head></head><body>");
    out.print("<table border=1><tr align='center' bgcolor='gold'>");
    out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td><td>삭제</td>");

    for (int i = 0; i < memList.size(); i++) {
      MemberVO vo = memList.get(i);
      String id = vo.getId();
      String pwd = vo.getPwd();
      String name = vo.getName();
      String email = vo.getEmail();
      Date joinDate = vo.getJoinDate();

      // 한행씩 테이블에 포함
      out.print("<tr><td>" +
          id + "</td><td>" +
          pwd + "</td><td>" +
          name + "</td><td>" +
          email + "</td><td>" +
          joinDate + "</td><td>" +
          "<a href='/Servlet01/memberDelete?id=" + id + "'>삭제</a></td></tr>");

    }
    out.print("</table></body></html>");
    out.close();
  }

}
