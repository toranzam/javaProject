package exam.instarray;

import static exam.instarray.Course.sc;

public class Customer {
  int id;
  String name;
  String phoneNumber;
  String job;
  String gender;
  int age;

  public Customer(int id, String name, String phoneNumber, String job, String gender, int age) {
    this.id = id;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.job = job;
    this.gender = gender;
    this.age = age;
  }


  void showCustomerInfo() {

  }
  

  public static void main(String[] args) {
    Customer[] arr = new Customer[3];

    System.out.println("**** 고객 정보 입력 ****");
    for (int i = 0; i < arr.length; i++) {

    System.out.print("\n고객번호 : ");
    this.subjectName = sc.next();
    
    System.out.print("고객명 : ");
    this.professor = sc.next();

    System.out.print("전화번호 : ");
    this.year = sc.nextInt();

    System.out.print("직업 : ");
    this.earnedCredits = sc.nextInt();

      arr[i] = new Customer();
    }    
    
    System.out.println("\n**** 고객 정보 출력 ****");
    for (int i = 0; i < arr.length; i++) {
      arr[i].showCustomerInfo();
    }
  }
}
