package exam;
import java.util.Scanner;

public class Aarray2DEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] arr = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"},
		};
		
		
		String answer;
		
		for (int i=0; i<arr.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? : ", i+1, arr[i][0]);
			answer = sc.nextLine().trim();
			if (answer.equals(arr[i][1])) {
				System.out.println("정답입니다.");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.\n", arr[i][1]);
			}
			System.out.println();
		}
		
		
		
		

	}

}
