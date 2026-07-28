package exam.instarray;

import java.util.Scanner;

public class Course {
  String subjectName;
  String professor;
  int year;
  int earnedCredits;
  static Scanner sc = new Scanner(System.in);

  void input() {
  
    System.out.print("\n과목명 : ");
    this.subjectName = sc.next();
    
    System.out.print("교수 : ");
    this.professor = sc.next();

    System.out.print("학년 : ");
    this.year = sc.nextInt();

    System.out.print("이수 학점 : ");
    this.earnedCredits = sc.nextInt();

  }

  void output() {
    System.out.println(subjectName + " " + professor + " " + year + "학년 " + earnedCredits + "학점");
  }

  public static void main(String[] args) {
    Course[] arr = new Course[3];

    System.out.println("**** 과목 정보 입력 ****");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = new Course();
      arr[i].input();
    }    
    
    System.out.println("\n**** 과목 정보 출력 ****");
    for (int i = 0; i < arr.length; i++) {
      arr[i].output();
    }
    
  }
  


  
}
