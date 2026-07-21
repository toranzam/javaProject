package exam;
import java.util.Scanner;

public class IfElseEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) 
			System.out.println("짝수");
		else 
			System.out.println("홀수");
		
	

	}

}
