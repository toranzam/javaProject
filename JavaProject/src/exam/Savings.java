package exam;
import java.util.Scanner;

public class Savings {
	
	private String name;
	private int deposit;
	private int interest;
	private int balance;
	
	void setName(String name) {
		this.name = name;
	}
	
	void setBalance(int balance) {
		this.balance = balance;
	}
	
	String getName() {
		return this.name;
	}
	
	int getBalance() {
		return this.balance;
	}
	
	int getInterest() {
		return this.interest;
	}
	
	void inputDeposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("예금액 입력 : ");
		int deposit = sc.nextInt();
		 
		this.balance = deposit + balance;
		
		this.interest =  (int)(this.balance * 0.1);
		
	}

	public static void main(String[] args) {
		
		
		
		Savings s = new Savings();
		s.setName("홍길동");
		s.setBalance(10000);
		
		
		System.out.println("예금주 : " + s.getName());
		System.out.println("입금전 잔액 : " + s.getBalance());
		s.inputDeposit();
		System.out.println("이자 : " + s.getInterest());
		System.out.println("최종잔액 : " + s.getBalance());
		
		

	}

}
