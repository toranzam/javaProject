package exam;
import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start, end, sum = 0;
		
		System.out.print("start 입력 : ");
		start = sc.nextInt();
		
		System.out.print("end 입력 : ");
		end = sc.nextInt();
		
		
		for (; start+1 < end; start++) {
			sum += start;
		}
		
		System.out.println("2 ~ 4의 합 : 9");
		

		sc.close();
	}

}
