package exam;

import java.util.Scanner;

public class ExceptionEx {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a, b;

    System.out.print("정수1 입력 : ");
    a = sc.nextInt();
    System.out.print("정수2 입력 : ");
    b = sc.nextInt();

    try {
      System.out.println("나누기 결과 : " + a / b);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
      System.out.println(e.getMessage());
      e.printStackTrace();
    }

  }

}
