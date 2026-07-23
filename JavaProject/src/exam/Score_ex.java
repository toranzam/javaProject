package exam;

import java.util.Scanner;

public class Score_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scores = {};
		int balance = 0;
		int num;
		
		
		Outter:while(true) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택> ");
			num = sc.nextInt();
			
			switch(num) {
				case 1:
					System.out.print("학생수> ");
					num = sc.nextInt();
					scores = new int[num];
					System.out.println();
					break;
					
				case 2:
					for(int i=0; i< scores.length; i++) {
						System.out.printf("scores[%d]: ", i);
						num = sc.nextInt();
						scores[i] = num;
					}
					System.out.println();
					break;
				case 3:
					for(int i=0; i< scores.length; i++) {
						System.out.printf("scores[%d]: %d\n", i,scores[i]);
					}
					System.out.println();
					break;
				case 4:
					int max = scores[0];
					int sum = 0;
					float avg;
					
					for(int number : scores) {
						if (number > max) {
							max = number;
						}
						sum += number;
					}
					
					avg = (float)sum / scores.length;
					
					System.out.println("최고 점수: " + max);
					System.out.printf("평균 점수: %.1f \n", avg);
					
					break;
				case 5:
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
