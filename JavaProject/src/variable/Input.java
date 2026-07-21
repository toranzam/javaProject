package variable;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc;

		// 현재 사용중인 컴퓨터의 기본입력장치(키보드)를 통해 입력된 값을 전달
		sc = new Scanner(System.in); 

		int num1, num2;

		System.out.println("첫번째 숫자 입력 : ");
		// 사용자가 키보드로 입력하는 값(문자)을 받아 정수로 변환 후 반환 요청
		num1 = sc.nextInt(); 
		// 콘솔 커서 한칸 아래 이동
		System.out.println();
		System.out.println("입력한 숫자 : " + num1);


	}

}
