package exam.game_project.start;

import java.util.Scanner;

// import를 통해 다른 패키지에 있는 클래스 사용 가능
import exam.game_project.game.*;
import exam.game_project.game.GaBaBo;
import exam.game_project.game.Guess;

import exam.game_project.info.AppInfo;


public class AppStart {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] arg) {

		int menuNum;
		AppInfo appInfo = new AppInfo();
		GaBaBo gaBaBo = new GaBaBo();

		// 프로그램 시작과 끝 

		// 게임 웰컴문구
		System.out.println("*****************************************************");
		System.out.println("\t**게임에 오신 것을 환영합니다^^");
		System.out.println("*****************************************************");

		// 메뉴 출력
		// 1. 게임정보 2.가위바위보게임 3.숫자 알아맞히기 게임 4.종료
		while (true) {
			System.out.println("\t메뉴");
			System.out.println("-----------------------------------------------------");
			System.out.println("1. 애플리케이션 정보");
			System.out.println("2. 가위바위보 게임");
			System.out.println("3. 숫자 알아맞히기 게임");
			System.out.println("4. 종료");
			System.out.println("-----------------------------------------------------");

			System.out.print("메뉴 번호 입력 : ");
			menuNum = sc.nextInt();
			System.out.println("*****************************************************");

			switch (menuNum) {
				case 1:
					appInfo.showAppInfo();
					break;
				case 2:
					gaBaBo.startGame(sc);
					break;
				case 3:
					Guess.startGame(sc);
					break;
				case 4:
					System.out.println("종료합니다!");
          System.out.println("*****************************************************");
          sc.close();
					return;
				default:
					System.out.println("메뉴 번호를 잘못 입력했습니다.");
					System.out.println("1~4 사이의 번호를 입력해주세요.");
					System.out.println("*****************************************************");
			}
		}
		

		
		// 메뉴 선택 
		
		// 선택된 메뉴의 기능을 수행
		
		// 종료는 종료메뉴를 선택할 때 종료
		
	}

}
