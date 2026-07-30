package exam.game_project.game;

import java.util.Scanner;

public class Guess {

    public static void startGame(Scanner sc) {

        int answer = (int) (Math.random() * 10) + 1;
        int input;

        System.out.println("\t숫자 알아맞히기 게임");
        System.out.println("-----------------------------------------------------");
        System.out.println("어떤 숫자일까요? 알아 맞혀보세요^^ (1 ~ 10)");
        System.out.println("-----------------------------------------------------");

        while (true) {
            System.out.print("숫자 입력 : ");
            input = sc.nextInt();

            if (input < 1 || input > 10) {
                System.out.println("1~10 사이의 숫자를 입력하세요.");
                continue;
            }

            if (input == answer) {
                System.out.println("-----------------------------------------------------");
                System.out.println("드디어 맞혔습니다~ 나의 숫자는 "
                        + answer + "입니다.");
                System.out.println("*****************************************************");
                break;
            }

            System.out.println("-----------------------------------------------------");
            System.out.println("아닙니다. 다시 맞혀보세요^^");
        }
    }
}
