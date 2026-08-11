package ex1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public class ProductMain {
  public static void main(String[] args) {

    PrdJDBConn dbCon = new PrdJDBConn();
    Connection con = dbCon.getConnection();
    Statement stmt = null;
    ResultSet rs = null;

    if (con == null) {
      System.out.println("db 생성 실패");
    } else {
      System.out.println("db 생성 성공");

      try {
        String query = "select * from product";
        stmt = con.createStatement();
        rs = stmt.executeQuery(query);

        System.out.println("-----product 조회-----");
        System.out.printf("%-10s %-14s %10s %-15s%n", "PRDNO", "PRDNAME", "PRDPRICE", "PRDCOMPANY");

        while (rs.next()) {
          String prdNo = rs.getString(1);
          String prdName = rs.getString(2);
          int prdPrice = rs.getInt(3);
          String prdCompany = rs.getString(4);

          System.out.format("%-10s %-14s %10d %-15s%n",
              prdNo, prdName, prdPrice, prdCompany);

        }

        rs.close();
        stmt.close();
        con.close();

      } catch (Exception e) {
        System.out.println("오류 발생");
        e.printStackTrace();

      }

    }

  }

}
