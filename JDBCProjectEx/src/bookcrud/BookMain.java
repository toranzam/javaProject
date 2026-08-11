package bookcrud;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
  public static void main(String[] args) {

    IBookDAO dao = new BookDAO();
    Scanner sc = new Scanner(System.in);
    String selMenu;
    ArrayList<BookDTO> bookList = null;

    System.out.println("************************************");
    System.out.println("\t도서 관리 프로그램");
    System.out.println("************************************");

    while (true) {
      System.out.println("\t다음 메뉴에서 선택");
      System.out.println("************************************");
      System.out.println("1. 도서 등록");
      System.out.println("2. 도서 정보 조회");
      System.out.println("3. 도서 정보 수정");
      System.out.println("4. 도서 정보 삭제");
      System.out.println("5. 종료");
      System.out.println("-----------------------------------");
      System.out.print("메뉴 번호 입력 : ");

      selMenu = sc.nextLine();

      switch (selMenu) {
        case "1":
          dao.insertBook(ReadWrite.getBookInfo(sc));
          break;

        case "2":
          bookList = dao.getAllBook();
          ReadWrite.writeBookInfo(bookList);
          break;
        case "3":
          bookList = dao.getAllBook();
          ReadWrite.writeBookInfo(bookList);

          System.out.println("수정할 도서번호 입력");
          dao.updateBook(ReadWrite.getBookInfo(sc, sc.nextLine()));

          break;
        case "4":
          bookList = dao.getAllBook();
          ReadWrite.writeBookInfo(bookList);

          System.out.print("삭제할 도서번호 입력 : ");
          dao.deleteBook(sc.nextLine());
          break;
        case "5":
          System.out.println("------------------------");
          System.out.println("종료합니다.");
          System.out.println("------------------------");
          sc.close();
          System.exit(0);

          break;

        default:
          System.out.println("잘못된 입력입니다");
          break;
      }
    }

  }

}
