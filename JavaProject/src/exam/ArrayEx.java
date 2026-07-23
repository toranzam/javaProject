package exam;
import java.util.Scanner; 

public class ArrayEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Score[] arr = new Score[5];
	
		String check;
		
		String name;
		int gram;
		int list;
		int read;
		
		
		System.out.println("*** 영어 시험 점수 입력 ***");
		for(int i=0; i<5; i++) {
			System.out.printf("%d번 성명 입력: ", i+1);
			name = sc.nextLine().trim();
			System.out.printf("%d번 문법 점수 입력: ", i+1);
			gram = sc.nextInt();
			System.out.printf("%d번 듣기 점수 입력: ", i+1);
			list = sc.nextInt();
			System.out.printf("%d번 독해 점수 입력: ", i+1);
			read = sc.nextInt();
			
			sc.nextLine();
			
			arr[i] = new Score(name, gram, list, read);
			
			System.out.println();
			System.out.printf("계속 입력하시겠습니까? (y입력하면 계속) : ");
			check = sc.nextLine().trim();
			if(!check.equals("y")) {
				break;
			}
		}
		
		System.out.println();
		System.out.println("*** 영어 시험 결과 ***");
		
		
		for (int i=0; i<arr.length; i++) {
			Score score = arr[i];
			if (score == null) {
				break;
			}
			
			int totalScore = score.getTotalScore();
			
			
			
			switch(totalScore / 100) {
				case 10:
				case 9:
				case 8:
					System.out.printf("%d번 %s %d 1등급\n", i+1, score.name, totalScore);
					break;
				case 6:
					System.out.printf("%d번 %s %d 2등급\n", i+1, score.name, totalScore);
					break;
				case 4:
					System.out.printf("%d번 %s %d 3등급\n", i+1, score.name, totalScore);
					break;
				default:
					System.out.printf("%d번 %s %d 4등급\n", i+1, score.name, totalScore);

			}
		
		}
		
		
		
	
	}


}

class Score {
	String name;
	int gram;
	int list;
	int read;
	
	int getTotalScore() {
		return gram + list + read;
	}
	
	Score (String name, int gram, int list, int read) {
		this.name = name;
		this.gram = gram;
		this.list = list;
		this.read = read;
	}
}
