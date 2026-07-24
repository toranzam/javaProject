package exam;
import java.util.Scanner;

public class Product {
	
	String prdName;
	int prdPrice;
	int prdSold;
	int prdStock;
	
	void intputPrdInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("****상품 정보 입력****");
		System.out.print("상품명 : ");
		this.prdName = sc.nextLine().trim();
		System.out.print("가격 : ");
		this.prdPrice = sc.nextInt();
		System.out.print("판매 수량 : ");
		this.prdSold = sc.nextInt();
		System.out.print("재고 수량 : ");
		this.prdStock = sc.nextInt();	
	}
	
	void showPrdInfo() {
		System.out.println("\n****상품 정보 출력****");
		System.out.println("상품명 : " + this.prdName);
		System.out.println("가격 : " + this.prdPrice);
		System.out.println("판매 수량 : "+ this.prdSold);
		System.out.println("재고 수량 : " + this.prdStock);
		this.salesAmount();
		this.stockAmount();
	}
	
	void salesAmount() {
		int soldPrice = this.prdPrice * this.prdSold;
		System.out.println("매출액 : " + soldPrice);
	}
	
	void stockAmount() {
		int stockPrice = this.prdPrice * this.prdStock;
		System.out.println("재고액 : " + stockPrice);
	}
	
	

	public static void main(String[] args) {
		Product pd = new Product();
		pd.intputPrdInfo();
		pd.showPrdInfo();


	}

}


