package exam.instarray;

import java.util.Scanner;

public class Customer {
  int id;
  String name;
  String phoneNumber;
  String job;
  String gender;
  int age;

  static Scanner sc = new Scanner(System.in);

  public Customer(int id, String name, String phoneNumber, String job, String gender, int age) {
    this.id = id;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.job = job;
    this.gender = gender;
    this.age = age;
  }


  void showCustomerInfo() {
    System.out.println(id + " " + name + " " + phoneNumber + " "
    + job + " " + gender + " " + age);
  }
  

  public static void main(String[] args) {
    Customer[] arr = new Customer[3];

    System.out.println("**** 고객 정보 입력 ****");
    for (int i = 0; i < arr.length; i++) {

      System.out.print("\n고객번호 : ");
      int id = sc.nextInt();

      System.out.print("고객명 : ");
      String name = sc.next();

      System.out.print("전화번호 : ");
      String phoneNumber = sc.next();

      System.out.print("직업 : ");
      String job = sc.next();

      System.out.print("성별 : ");
      String gender = sc.next();

      System.out.print("나이 : ");
      int age = sc.nextInt();

      arr[i] = new Customer(id, name, phoneNumber, job, gender, age);
    }    
    
    System.out.println("\n**** 고객 정보 출력 ****");
    for (int i = 0; i < arr.length; i++) {
      arr[i].showCustomerInfo();
    }
  }
}
