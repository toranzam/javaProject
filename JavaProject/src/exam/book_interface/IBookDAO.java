package exam.book_interface;

import java.util.ArrayList;

public interface IBookDAO {
  void insertBookInfo(BookDTO bookDTO);
  BookDTO searchBookInfo(String id);
  ArrayList<BookDTO> searchAllBookInfo();
  void deleteBookInfo(String id);
  void updateBookInfo(BookDTO bookDTO);
  
}
