package exam;
import java.util.Scanner;

public class VariableEX3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String name = sc.next();
		
		System.out.println("학년 입력 : ");
		int grade = sc.nextInt();
		
		System.out.println("점수 입력 : ");
		double score = sc.nextDouble();
		
		System.out.println("학점 입력 : ");
		char rating = sc.next().charAt(0);
		
		System.out.println("=====================");
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("점수 : " + score);
		System.out.println("학점 : " + rating);
		
		sc.close();
	}

}
