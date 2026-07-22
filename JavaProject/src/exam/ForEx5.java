package exam;
import java.util.Scanner;

public class ForEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int studentCount;
		int studentScore;
		int scoreSum = 0;
		float scoreAvg;

		System.out.print("학생 수 입력 : ");
		studentCount = sc.nextInt();
		
		for(int i=1; i<=studentCount; i++) {
			System.out.print("학생" + i + " 점수 입력 : ");
			
			scoreSum += sc.nextInt();
		}
		
		scoreAvg = (float)scoreSum / studentCount;
		
		System.out.println("평균 : " + scoreAvg);
		
		sc.close();
	}

}
