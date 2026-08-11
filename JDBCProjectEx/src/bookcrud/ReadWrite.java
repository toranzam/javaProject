package bookcrud;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ReadWrite {

  public static BookDTO getBookInfo(Scanner sc) {
    BookDTO dto = null;
    try {
      System.out.print("도서번호 입력 : ");
      String bookNo = sc.nextLine();

      System.out.print("도서명 입력 : ");
      String bookName = sc.nextLine();

      System.out.print("저자 입력 입력 : ");
      String bookAuthor = sc.nextLine();

      System.out.print("가격 입력 : ");
      int bookPrice = Integer.parseInt(sc.nextLine());

      System.out.print("발행일 입력 : ");
      String bookDateString = sc.nextLine();
      SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
      Date bookDate = fm.parse(bookDateString);

      System.out.print("재고 입력 : ");
      int bookStock = Integer.parseInt(sc.nextLine());

      System.out.print("출판사 번호 입력 : ");
      String pubNo = sc.nextLine();

      dto = new BookDTO(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo);

    } catch (Exception e) {
      System.out.println("입력오류");
      e.printStackTrace();
    }
    return dto;
  }

  public static BookDTO getBookInfo(Scanner sc, String bookNo) {
    BookDTO dto = null;
    try {
      System.out.print("도서명 입력 : ");
      String bookName = sc.nextLine();

      System.out.print("저자 입력 입력 : ");
      String bookAuthor = sc.nextLine();

      System.out.print("가격 입력 : ");
      int bookPrice = Integer.parseInt(sc.nextLine());

      System.out.print("발행일 입력 : ");
      String bookDateString = sc.nextLine();
      SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
      Date bookDate = fm.parse(bookDateString);

      System.out.print("재고 입력 : ");
      int bookStock = Integer.parseInt(sc.nextLine());

      System.out.print("출판사 번호 입력 : ");
      String pubNo = sc.nextLine();

      dto = new BookDTO(bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo);

    } catch (Exception e) {
      System.out.println("입력오류");
      e.printStackTrace();
    }
    return dto;
  }

  public static void writeBookInfo(ArrayList<BookDTO> bookList) {
    System.out.println("****************************");
    System.out.println("\t도서 정보 조회");
    System.out.println("****************************");

    System.out.format("%-10s\t %-10s\t %-4s %-20s \t%13s %5s %5s\n",
        "도서번호", "도서명", "저자", "가격", "발행일", "재고", "출판사번호");
    // System.out.println("도서번호\t도서명\t저자\t가격\t발행일\t재고\t출판사번호");
    System.out.println("-------------------------------------------------");
    System.out.println();

    for (BookDTO bookDTO : bookList) {
      System.out.format("%-10s\t %-10s\t %-4s %-20s \t%13s %5s %5s\n",
          bookDTO.getBookNo(),
          bookDTO.getBookName(),
          bookDTO.getBookAuthor(),
          bookDTO.getBookPrice(),
          bookDTO.getBookDate(),
          bookDTO.getBookStock(),
          bookDTO.getPubNo());
    }

  }

}
