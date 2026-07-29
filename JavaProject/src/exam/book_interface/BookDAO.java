package exam.book_interface;

import java.util.ArrayList;

public class BookDAO implements IBookDAO {

  static public ArrayList<BookDTO> bookList = new ArrayList<>();

  @Override
  public void deleteBookInfo(String id) {
    bookList.removeIf(book -> book.getId().equals(id));
  }

  @Override
  public void insertBookInfo(BookDTO bookDTO) {
    if (bookDTO != null) {
      bookList.add(bookDTO);
    }
  }

  @Override
  public ArrayList<BookDTO> searchAllBookInfo() {
    return bookList;
  }

  @Override
  public BookDTO searchBookInfo(String id) {
    return bookList.stream()
    .filter(book -> book.getId().equals(id) )
    .findFirst()
    .orElseThrow(() -> new IllegalArgumentException( " 해당하는 값이 없습니다"));
  }

  @Override
  public void updateBookInfo(BookDTO bookDTO) {
      for (BookDTO book : bookList) {
        if (book.getId().equals(bookDTO.getId())) {
            book.setName(bookDTO.getName());
            book.setIsbn(bookDTO.getIsbn());
            book.setCategory(bookDTO.getCategory());
            return;
        }

    }
    
  }
  
  
  
}
