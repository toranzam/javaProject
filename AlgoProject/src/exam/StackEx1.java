package exam;

import java.util.Scanner;

import datastructure.stack.Stack;

public class StackEx1 {
  // 2 * (3 + 10)) - 1 + [(10 + 10 + {20 + 1})]
  // (3 + 10) * ((3) * 2 / 4) - 1 + [{(10 + 10 + {20 + 1})]

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("수식 입력 : ");

    String expression = scanner.nextLine();

    System.out.println(validation(expression));

  }

  public static boolean validation(String expression) {

    Stack stack = new Stack(expression.length());

    for (int i = 0; i < expression.length(); i++) {

      char ch = expression.charAt(i);
      if (ch == '(' || ch == '{' || ch == '[') {
        stack.push(ch);

      } else if (ch == ')' || ch == '}' || ch == ']') {
        if (stack.isEmpty()) {
          return false;
        }
        char open = stack.pop();
        if (ch == ')' && open != '(')
          return false;
        if (ch == '}' && open != '{')
          return false;
        if (ch == ']' && open != '[')
          return false;
      }
    }

    return stack.isEmpty();

  }

}