package extendsex.instarray;

import java.util.Scanner;

public class Person {
  static Scanner s = new Scanner(System.in);

  String name;
  int age, height, weight;

  public void input() {
    System.out.print("\n 성명 입력 : ");
    this.name = s.next();
    System.out.print("\n 나이 입력 : ");
    this.age = s.nextInt();
    System.out.print("\n 키 입력(cm) : ");
    this.height = s.nextInt();
    System.out.print("\n 몸무게 입력(Kg) : ");
    this.weight = s.nextInt();
  }

  public void output() {
    System.out.print(name + " ");
    System.out.print(age + "살");
    System.out.print(height + "cm");
    System.out.print(weight + "kg");
    System.out.println();
  }
  
}
