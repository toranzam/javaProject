package exam.finalalgoex;

import java.util.Scanner;

public class StorageMain {
  public static void main(String[] args) {
    BinarySearchTreeStorage<Product> storage = new BinarySearchTreeStorage<Product>();

    Scanner sc = new Scanner(System.in);
    String mainMenu;
    String productName;
    int productQuantity;

    while (true) {
      System.out.println("기능을 선택해주세요");
      System.out.println("1.새 품목 등록 | 2.재고 품목 반출 | 3.재고 현황 | 4.종료");
      mainMenu = sc.nextLine();

      switch (mainMenu) {
        case "1":
          System.out.print("등록할 품목명 : ");
          productName = sc.nextLine().trim();
          System.out.print("등록할 품목 갯수 : ");

          try {
            productQuantity = Integer.parseInt(sc.nextLine());
          } catch (NumberFormatException e) {
            System.out.println("수량은 숫자로");
            break;
          }

          if (productQuantity <= 0) {
            System.out.println("수량을 1이상 입력해주세요");
            break;
          }
          boolean result = storage.add(new Product(productName, productQuantity));

          if (result) {
            System.out.println("품목 등록 성공");
            System.out.println();
          } else {
            System.out.println("품목 등록 성공");
            System.out.println("이미 등록된 품목");
          }
          break;

        case "2":
          System.out.print("반출할 품목명 : ");
          productName = sc.nextLine().trim();
          System.out.print("반출할 품목 수 : ");
          productQuantity = Integer.parseInt(sc.nextLine());

          int res = storage.updateStock(new Product(productName), productQuantity);

          switch (res) {
            case 1:
              System.out.println(productName + "재고 " + productQuantity + "개 반출 성공");
              System.out.println();
              break;
            case 0:
              System.out.println(productName + "재고 " + productQuantity + "개 반출 성공");
              System.out.println(productName + "남은 재고 0");
              System.out.println();
              break;
            case -1:
              System.out.println(productName + "재고 수량 부족");
              System.out.println(productName + "반출 실패");
              System.out.println();
              break;
            default:
              System.out.println("해당 품목 없음");
              System.out.println();
              break;
          }

          break;
        case "3":
          if (storage.isEmpty()) {
            System.out.println("등록된 품목이 없습니다");
          } else {
            System.out.print("재고확인 : ");
            storage.inorder();
            System.out.println();
          }
          break;

        case "4":
          System.out.println("시스템를 종료합니다");
          sc.close();
          return;

        default:
          System.out.println("잘못된 입력입니다");
          break;
      }

    }

  }

}
