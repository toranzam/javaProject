package exam.ojdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDAO {

  private Connection getConnection() {
    Connection con = null;

    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");

      String url = "jdbc:oracle:thin:@localhost:1521/freepdb1";
      String user = "sql_select"; // 오라클은 계정 정보가 DB임
      String pwd = "1234";

      con = DriverManager.getConnection(url, user, pwd);

      if (con != null) {
        System.out.println("DB 연결 성공");
      } else {
        System.out.println("DB 연결 실패");
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    return con;
  }

  // 회원정보 조회 메소드
  public ArrayList<ProductVO> productSelect() {
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    ArrayList<ProductVO> memList = new ArrayList<ProductVO>();

    try {
      con = getConnection();
      String query = "select * from product";
      pstmt = con.prepareStatement(query);
      rs = pstmt.executeQuery();

      while (rs.next()) {
        // 1개의 레코드(resultset)를 처리 -> rs에서 추출해서 memberVO에 저장하고 arraylist에 추가
        Long productId = rs.getLong("productId");
        String productName = rs.getString("productName");
        int price = rs.getInt("price");
        int stock = rs.getInt("stock");

        ProductVO vo = new ProductVO();
        vo.setProductId(productId);
        vo.setProductName(productName);
        vo.setPrice(price);
        vo.setStock(stock);

        memList.add(vo);
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
