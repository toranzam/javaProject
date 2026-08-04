package exam.day8_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

  public static void main(String[] args) {

    List<String> strList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    System.out.print("단어를 입력하세요>>");
    strList.add(sc.next());

    System.out.print("단어를 입력하세요>>");
    strList.add(sc.next());

    System.out.print("단어를 입력하세요>>");
    strList.add(sc.next());

    System.out.print("단어를 입력하세요>>");
    strList.add(sc.next());

    System.out.println("----------------------------------");
    for (String string : strList) {
      System.out.print(string + " ");
    }

    String result = strList.stream()
        .max((a, b) -> Integer.compare(a.length(), b.length()))
        .orElse(null);

    System.out.println("가장 긴 단어는 : " + result);
    System.out.println("가장 긴 단어의 길이는 : " + result.length());

  }

}
