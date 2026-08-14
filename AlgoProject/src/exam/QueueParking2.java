package exam;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import datastructure.queue.MyQueueMove;

public class QueueParking2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("주차장을 구성합니다");
    System.out.print("주차면을 입력하세요 : ");
    int parkingSize = Integer.parseInt(sc.nextLine());

    MyQueueMove queue = new MyQueueMove(parkingSize);
    Map<Character, LocalDateTime> parkingTimes = new HashMap<>();
    char carNumber = 'A';

    System.out.println(parkingSize + "대를 주차할 수 있는 주차장이 구성되었습니다");
    System.out.println("자동차 주차 프로그램 실행 완료");

    while (true) {
      System.out.println("버튼을 눌러주세요");
      System.out.print("0. 주차여부 확인 1.자동차 주차 2. 자동차 출차 3. 만차여부 4.종료 : ");

      String menu = sc.nextLine();

      switch (menu) {
        case "0":
          System.out.println("현재 주차 대수: " + queue.size() + "대");
          System.out.print("주차된 자동차: ");
          queue.showQueue();
          System.out.println();
          break;

        case "1":
          if (queue.isFull()) {
            System.out.println("주차장이 만차입니다 ");
          } else {
            queue.enqueue(carNumber);
            parkingTimes.put(carNumber, LocalDateTime.now());
            System.out.println(carNumber + " 자동차 주차 완료");
            System.out.println();
            carNumber++;
          }
          break;

        case "2":
          if (queue.isEmpty()) {
            System.out.println("주차장에 차가 없습니다 ");
          } else {
            System.out.print("출차할 자동차 문자를 입력하세요 : ");
            char outCar = sc.nextLine().charAt(0);
            Duration parkingTime = Duration.between(parkingTimes.get(outCar), LocalDateTime.now());

            if (queue.peek() != outCar
                && parkingTime.toHours() < 1) {
              System.out.println("먼저 주차된 자동차가 있어 출차할 수 없습니다.");
              System.out.println("현재 주차시간: " + parkingTime.toMinutes() + "분");
              break;
            }

            int moveCount = 0;
            while (queue.peek() != outCar) {
              queue.enqueue(queue.dequeue());
              moveCount++;
            }

            queue.dequeue();
            parkingTimes.remove(outCar);
            System.out.println(outCar + " 자동차 출차 완료");
            if (moveCount > 0) {
              System.out.println("앞 차량들의 출차 순서가 뒤로 밀렸습니다.");
            }
            System.out.println();
          }
          break;

        case "3":
          if (queue.isFull()) {
            System.out.println("만차여서 주차 불가");
          } else {
            System.out.println("현재 주차장에 자동차 " + queue.size() + "대가 주차되어있습니다. 여유공간이 존재합니다.");
          }
          System.out.println();
          break;

        case "4":
          System.out.println("프로그램 종료");
          sc.close();
          return;

        default:
          System.out.println("잘못 입력하셨습니다. 다시 재실행 해주세요.");
          break;
      }
    }

  }
}
