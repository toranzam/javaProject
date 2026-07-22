package exam;
import java.util.Scanner;


public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		int num;
		
		
		Outter:while(true) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2.출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			num = sc.nextInt();
			
			switch(num) {
				case 1:
					System.out.print("예금액> ");
					num = sc.nextInt();
					balance += num;
					System.out.println();
					break;
					
				case 2:
					System.out.print("출금액> ");
					num = sc.nextInt();
					balance -= num;
					System.out.println();
					break;
				case 3:
					System.out.println("잔고> " + balance);
					System.out.println();
					break;
				case 4:
					System.out.println();
					break Outter;
				default: 
					System.out.println("올바른 숫자를 입력해주세요");
					System.out.println();
				
			}
			
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

}
