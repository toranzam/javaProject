package exam.algo.parking;

import java.util.Scanner;

import datastructure.linkedlist.LinkedListCustom;

public class ParkingProgram {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    LinkedListCustom list = new LinkedListCustom(5);
    int menu;
    String carNumber;

    while (true) {
      System.out.println("0.주차여부 확인 1.자동차 주차 2.자동차 출차 3.만차여부 4.종료");
      menu = Integer.parseInt(sc.nextLine());

      switch (menu) {
        case 0:
          System.out.println("주차한 차 번호를 입력해주세요");
          carNumber = sc.nextLine();

          int carPosition = list.searchPosition(carNumber);

          if (carPosition == -1) {
            System.out.println(carNumber + " 차량은 주차되어 있지 않습니다");
          } else {
            System.out.println(carNumber + "차량은 " + carPosition + "번 위치에 주차되어 있습니다");
          }
          break;

        case 1:
          if (list.isFull()) {
            System.out.println("만차여서 주차 불가");
            break;
          }
          System.out.println("주차할 차량의 자동차 번호를 입력해주세요");
          carNumber = sc.nextLine();
          if (list.searchNode(carNumber) != null) {
            System.out.println("해당 차량은 이미 주차되어있습니다");
            break;
          }

          System.out.println("0. 마지막 위치에 주차 1. 원하는 위치에 주차");
          int parkingMenu = Integer.parseInt(sc.nextLine());

          switch (parkingMenu) {
            case 0:
              list.insertNode(carNumber);
              System.out.println("마지막 위치에 주차완료");
              break;

            case 1:
              System.out.println("주차 위치는 1번부터 " + list.getMaxSize() + "번 까지 입니다");
              System.out.println("주차위치를 입력해주세요 ");
              int position = Integer.parseInt(sc.nextLine());

              list.insertNode(position, carNumber);
              // System.out.println(position + "번 위치에 주차되었습니다");
              break;

            default:
              System.out.println("잘못 입력하셨습니다");
              break;
          }

          break;
        case 2:
          System.out.println("출차할 차량의 번호를 입력해주세요");
          carNumber = sc.nextLine();
          if (list.searchNode(carNumber) == null) {
            System.out.println("출차 처리 불가");
            System.out.println("주차되지 않은 차량 번호입니다");
          } else {
            list.deleteNode(carNumber);
            System.out.println(carNumber + "차량 출차 처리되었습니다");
          }

          break;
        case 3:
          list.checkSize();
          break;
        case 4:
          System.out.println("종료합니다");
          sc.close();
          System.exit(0);
          break;

        default:
          break;
      }
    }

  }

}
