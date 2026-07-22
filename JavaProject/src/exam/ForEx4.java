package exam;
import java.util.Scanner;

public class ForEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, numCount1 = 0, numCount2 = 0, zeroCount = 0;
		
		for (int i=0; i<10; i++) {
			System.out.print("숫자" + (i+1) + " 입력 : ");
			num = sc.nextInt();
			if(num > 0) {
				numCount1++;
			} else if(num < 0) { 
				numCount2++;
			} else {
				zeroCount++;
			}

		}
	
		System.out.println("\n양수 개수 : " + numCount1);
		System.out.println("음수 개수 : " + numCount2);
		System.out.println("0의 개수 : " + zeroCount);
		
		
		

	}

}
