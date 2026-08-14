package exam;

import java.util.Scanner;

import datastructure.queue.MyQueueMove;

public class QueueParking {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("주차장을 구성합니다");
    System.out.print("주차면을 입력하세요 : ");
    int parkingSize = Integer.parseInt(sc.nextLine());
    MyQueueMove queue = new MyQueueMove(parkingSize);
    System.out.println(parkingSize + "대를 주차할 수 있는 주차장이 구성되었습니다");

    System.out.println("자동차 주차 프로그램 실행 완료");

    String input;
    char carNumber = 'A';

    while (true) {
      System.out.println("버튼을 눌러주세요");
      System.out.print("0. 주차여부 확인 1.자동차 주차 2. 자동차 출차 3. 만차여부 4.종료 : ");
      input = sc.nextLine();

      switch (input) {

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
            System.out.println(carNumber + " 자동차 주차 완료");
            System.out.println();
            carNumber++;
          }

          break;
        case "2":
          if (queue.isEmpty()) {
            System.out.println("주차장에 차가 없습니다 ");
          } else {
            char outCar = queue.dequeue();
            System.out.println(outCar + " 자동차 출차 완료");
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
          System.exit(0);
          break;

        default:
          System.out.println("잘못 입력하셨습니다. 다시 재실행 해주세요.");
          break;
      }
    }

  }
}
