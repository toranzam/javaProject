package exam.book_interface;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class BookMain {
  public static void main(String[] args) {
    BookDAO bd = new BookDAO();
    Scanner sc = new Scanner(System.in);

    int menu;
    String uuid, name, isbn, category;
    BookDTO book;
    



    Outer:while (true) {

      System.out.println("메뉴선택");
      System.out.println("1번 책정보넣기, 2번 책정보수정, 3번 책정보삭제, 4번 단일책정보조회, 5번 모든책정보조회");
      menu = sc.nextInt();


      switch (menu) {
        case 1:
          System.out.println("책 정보 입력");
          System.out.print("책 이름 : ");
          name = sc.next();

          System.out.print("책 ISBN : ");
          isbn = sc.next();
        
          System.out.print("책 카테고리 : ");
          category = sc.next();

          bd.insertBookInfo(new BookDTO(UUID.randomUUID().toString(), name, isbn, category));
        
          break;
        case 2:
          System.out.println("수정할 책의 UUID 값을 입력 :");
          uuid = sc.next();

          book = bd.searchBookInfo(uuid);
            System.out.println(
              "수정할 책정보 |책 ID : " + book.getId() +
              "\t|책 이름 : " + book.getName() +
              "\t|책 ISBN : " + book.getIsbn() +
              "\t|책 카테고리 : " + book.getCategory()
            );

          System.out.println("수정될 책 정보 입력");
          System.out.print("책 이름 : ");
          name = sc.next();

          System.out.print("책 ISBN : ");
          isbn = sc.next();
        
          System.out.print("책 카테고리 : ");
          category = sc.next();
          
          
          bd.updateBookInfo(new BookDTO(uuid, name, isbn, category));

          System.out.println("책정보 수정 완료");

          break;
        case 3:
            System.out.println("삭제할 책의 UUID 입력 : ");
            uuid = sc.next();
            bd.deleteBookInfo(uuid);
            System.out.println("책정보 삭제 완료");
        
          break;

        case 4:
          System.out.println("UUID 값을 입력 : "); 
          uuid = sc.next();

          book = bd.searchBookInfo(uuid);
            System.out.println(
              "|책 ID : " + book.getId() +
              "\t|책 이름 : " + book.getName() +
              "\t|책 ISBN : " + book.getIsbn() +
              "\t|책 카테고리 : " + book.getCategory()
            );
          break;

        case 5:
          ArrayList<BookDTO> bookList = bd.searchAllBookInfo();
          for (BookDTO target : bookList) {
            System.out.println(
              "|책 ID : " + target.getId() +
              "\t|책 이름 : " + target.getName() +
              "\t|책 ISBN : " + target.getIsbn() +
              "\t|책 카테고리 : " + target.getCategory()
            );

          }
          break;

        case 6: 
          System.out.println("종료");
          break Outer;
        default:
          System.out.println("잘못된 숫자입니다");
          break;
      }
    }
    

  


    
  }
}
