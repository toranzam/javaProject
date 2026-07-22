package exam;
import java.util.Scanner;

public class WhileEx2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int studentCount;
		int studentScore;
		int scoreSum = 0;
		float scoreAvg;

		System.out.print("학생 수 입력 : ");
		studentCount = sc.nextInt();
		
		int i = 1;
		while(i<=studentCount) {
			System.out.print("학생" + i + " 점수 입력 : ");
			
			scoreSum += sc.nextInt();
			i++;
		}
		
		scoreAvg = (float)scoreSum / studentCount;
		
		System.out.println("평균 : " + scoreAvg);
	}

}
