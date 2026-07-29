package exam.book_interface;

public class BookDTO {
  private String id;
  private String name;
  private String isbn;
  private String category;

  public BookDTO(String id, String name, String isbn, String category) {
    this.id = id;
    this.name = name;
    this.isbn = isbn;
    this.category = category;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getCategory() {
    return category;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  

  



  
}