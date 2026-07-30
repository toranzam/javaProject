package exam.game_project.game;

import java.util.Scanner;

public class GaBaBo {
  public void startGame(Scanner sc) {
    String answer;
    do {
      System.out.println("\t가위바위보 게임");
      System.out.println("가위 바위 보 게임 1. 가위, 2. 바위, 3. 보");
      System.out.println("==============================");

      System.out.print("번호 입력 : ");
      int user = sc.nextInt();

      int computer = (int) (Math.random() * 3) + 1;
      if (user == computer) {
        System.out.println("비겼습니다!");
      } else if ((user == 1 && computer == 3)
          || (user == 2 && computer == 1)
          || (user == 3 && computer == 2)) {
        System.out.println("당신이 이겼습니다^^");
      } else {
        System.out.println("당신이 졌습니다!");
      }

      if (computer == 1) {
        System.out.println("컴퓨터는 가위입니다.");
      } else if (computer == 2) {
        System.out.println("컴퓨터는 바위입니다.");
      } else {
        System.out.println("컴퓨터는 보입니다.");
      }

      System.out.print("계속하시겠습니까? (y) : ");
      answer = sc.next();
    } while (answer.equalsIgnoreCase("y"));

    System.out.println("게임을 종료합니다.");
    System.out.println("*****************************************************");
  }
}
