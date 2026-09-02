package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.Util;

public class MemberDAO {
	
	

	  // 회원정보 조회 메소드
	  public ArrayList<MemberDTO> memberSelect() {
	    Connection con = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;

	    ArrayList<MemberDTO> memList = new ArrayList<MemberDTO>();

	    try {
	      con = Util.getConn();
	      String query = "select * from member";
	      pstmt = con.prepareStatement(query);
	      rs = pstmt.executeQuery();

	      while (rs.next()) {
	        // 1개의 레코드(resultset)를 처리 -> rs에서 추출해서 memberVO에 저장하고 arraylist에 추가
	        String id = rs.getString("memId");
	        String pwd = rs.getString("memPwd");
	        String name = rs.getString("memName");
	        String email = rs.getString("memEmail");
	        Date joinDate = rs.getDate("memJoinDate");

	        MemberDTO dto = new MemberDTO();
	        dto.setId(id);
	        dto.setName(name);
	        dto.setEmail(email);
	        dto.setJoinDate(joinDate);

	        memList.add(dto);

	      }

	    } catch (Exception e) {
	      e.printStackTrace();
	    } finally {
	      try {
	        rs.close();
	        pstmt.close();
	        con.close();
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	    }
	    return memList;

	  }

}
