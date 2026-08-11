package exam.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import jdbc.DBConn;

public class BookEx {
  public static void main(String[] args) {
    // book 테이블의 정보를 조회하는 프로그램

    DBConn dbCon = new DBConn();
    Connection con = null;
    PreparedStatement pstmt = null;

    String bookNo, bookTitle, bookAuthor, bookDate, pubNo;
    int bookPrice, bookStock;

    Scanner sc = new Scanner(System.in);

    try {

      con = dbCon.getConnection();

      String sql = "select count(*) from book";

      pstmt = con.prepareStatement(sql);

      ResultSet rs = pstmt.executeQuery();

      System.out.println("---------총 도서 권수---------");

      while (rs.next()) {
        System.out.println(rs.getInt(1));
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    try {

      con = dbCon.getConnection();

      String sql = "select * from book where bookDate >= ?";
      pstmt = con.prepareStatement(sql);

      System.out.println("년도 입력");
      String targetDate = sc.nextLine();

      pstmt.setString(1, targetDate + "-01-01");

      ResultSet rs = pstmt.executeQuery();

      System.out.println("---------" + targetDate + "년도 이후 발행된 도서" + "---------");

      while (rs.next()) {
        bookNo = rs.getString(1);
        bookTitle = rs.getString(2);
        bookAuthor = rs.getString(3);
        bookPrice = rs.getInt(4);
        Date bookDate1 = rs.getDate(5);
        bookStock = rs.getInt(6);
        pubNo = rs.getString(7);

        System.out.format("%-10s\t %-20s\t %-10s %6d %13s\t %3d %10s\n", bookNo, bookTitle, bookAuthor, bookPrice,
            bookDate1, bookStock, pubNo);
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    try {

      con = dbCon.getConnection();

      String sql = "select * from book where bookPrice >= ?";
      pstmt = con.prepareStatement(sql);

      System.out.println("가격 입력");
      int targetDate = Integer.parseInt(sc.nextLine());

      pstmt.setInt(1, targetDate);

      ResultSet rs = pstmt.executeQuery();

      System.out.println("---------가격이 " + targetDate + "이상인 도서" + "---------");

      while (rs.next()) {
        bookNo = rs.getString(1);
        bookTitle = rs.getString(2);
        bookAuthor = rs.getString(3);
        bookPrice = rs.getInt(4);
        Date bookDate1 = rs.getDate(5);
        bookStock = rs.getInt(6);
        pubNo = rs.getString(7);

        System.out.format("%-10s\t %-20s\t %-10s %6d %13s\t %3d %10s\n", bookNo, bookTitle, bookAuthor, bookPrice,
            bookDate1, bookStock, pubNo);
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    sc.close();

  }
}
