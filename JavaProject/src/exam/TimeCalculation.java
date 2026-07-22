package exam;
import java.util.Scanner;

public class TimeCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time, hour, minute, second;
		
		System.out.println("시간 입력 (초) : ");
		time = sc.nextInt();
		
		
		hour = time / 3600;
		minute = (time % 3600) / 60;
		second = (time % 3600) % 60;
		
		System.out.println(time + "초는 " + hour + "시간, " + minute + "분, " + second + "초입니다.");
		
		
		sc.close();

	}

}
