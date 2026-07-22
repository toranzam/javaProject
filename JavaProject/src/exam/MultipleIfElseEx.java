package exam;
import java.util.Scanner;

public class MultipleIfElseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("숫자1 입력 : ");
		num1 = sc.nextInt();
		
		System.out.println("숫자2 입력 : ");
		num2 = sc.nextInt();
		
		System.out.println("숫자3 입력 : ");
		num3 = sc.nextInt();
		
		
		if (num1 == num2 || num1 == num3 || num2 == num3) {
			System.out.println("숫자중 같은게 있으면 안됩니다.");
			return;
		}
		
		
		if (num1 > num2 && num1 > num3)
			printBiggestNumber(num1);
		else if (num2 > num1 && num2 > num3) 
			printBiggestNumber(num2);
		else if(num3 > num2 && num3 > num1)
			printBiggestNumber(num3);
		
		sc.close();
	}
	
	public static void printBiggestNumber(int number) {
		System.out.println("가장 큰 수 : " + number);
	}

}
