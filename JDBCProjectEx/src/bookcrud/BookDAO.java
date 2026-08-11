package bookcrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDAO implements IBookDAO {
  Connection con = null;
  PreparedStatement pstmt = null;
  ResultSet rs = null;
  BookDTO book = null;
  ArrayList<BookDTO> bookList = null;

  public BookDAO() {
    con = DBConn.getConnection();
  }

  @Override
  public void deleteBook(String bookNo) {
    try {
      String sql = "delete from book where bookNo = ?";
      pstmt = con.prepareStatement(sql);

      pstmt.setString(1, bookNo);

      pstmt.executeUpdate();

      System.out.println("성공 : " + bookNo + "도서를 삭제하였습니다. 도서 정보 조회에서 확인하세요.");

    } catch (SQLException e) {
      System.out.println("책 삭제 실패");
      e.printStackTrace();
    }

  }

  @Override
  public BookDTO detailBook(String bookNo) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayList<BookDTO> getAllBook() {
    bookList = new ArrayList<BookDTO>();

    try {
      String sql = "select * from book order by bookNo";
      pstmt = con.prepareStatement(sql);

      rs = pstmt.executeQuery();

      while (rs.next()) {
        bookList.add(new BookDTO(
            rs.getString(1),
            rs.getString(2),
            rs.getString(3),
            rs.getInt(4),
            rs.getDate(5),
            rs.getInt(6),
            rs.getString(7)));
      }
    } catch (SQLException e) {
      System.out.println("전체 책 조회 오류 발생");
      e.printStackTrace();
    } finally {
      DBConn.close(pstmt, rs);
    }
    return bookList;
  }

  @Override
  public void insertBook(BookDTO dto) {

    try {
      String sql = "insert into book values(?, ?, ?, ?, ?, ?, ?)";
      pstmt = con.prepareStatement(sql);

      pstmt.setString(1, dto.getBookNo());
      pstmt.setString(2, dto.getBookName());
      pstmt.setString(3, dto.getBookAuthor());
      pstmt.setInt(4, dto.getBookPrice());
      pstmt.setDate(5, new java.sql.Date(dto.getBookDate().getTime()));
      pstmt.setInt(6, dto.getBookStock());
      pstmt.setString(7, dto.getPubNo());

      int result = pstmt.executeUpdate();

      if (result > 0) {
        System.out.println("책 등록 성공");
      } else {
        System.out.println("책 등록 실패");
      }

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      DBConn.close(pstmt);
    }

  }

  @Override
  public void updateBook(BookDTO dto) {
    try {
      String sql = "update book set bookName = ?,  bookAuthor = ?, bookPrice = ?, bookDate = ?, bookStock = ?, pubNo = ? where bookNo = ?";
      pstmt = con.prepareStatement(sql);
      pstmt.setString(7, dto.getBookNo());
      pstmt.setString(1, dto.getBookName());
      pstmt.setString(2, dto.getBookAuthor());
      pstmt.setInt(3, dto.getBookPrice());
      pstmt.setDate(4, new java.sql.Date(dto.getBookDate().getTime()));
      pstmt.setInt(5, dto.getBookStock());
      pstmt.setString(6, dto.getPubNo());

      pstmt.executeUpdate();
      System.out.println("성공 : 도서 정보를 수정하였습니다. 도서 정보 조회에서 확인하세요.");

    } catch (Exception e) {
      System.out.println("책 수정 오류 발생");
      e.printStackTrace();
    } finally {
      DBConn.close(pstmt);
    }

  }

}
