package exam;
import java.util.Scanner;

public class ArrayInputEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int max = 0;
		
		System.out.println("숫자 입력");
		
		for(int i= 0; i<5; i++) {
			System.out.printf("num[%d] : ", i);
			num[i] = sc.nextInt();
		}
		System.out.println();
		
		
		System.out.print("입력된 값 : ");
		for (int i=0; i<5; i++) {
			System.out.printf("%d ", num[i]);
			if (num[i] > max) {
				max = num[i]; 
			}
			
			if (i == 4) {
				System.out.println();				
			}
		}
		
		
		System.out.println("최대값 : " + max);
		
	


	}

}
