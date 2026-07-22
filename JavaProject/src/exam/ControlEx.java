package exam;
import java.util.Scanner;

public class ControlEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		final int LAPTOP_PRICE = 1200000;
		final int CAMERA_PRICE = 400000;
		
		final String LAPTOP_NAME = "노트북";
		final String CAMERA_NAME = "디지털 카메라";
		
		
		System.out.println("******* 상품 정보 *******");
		System.out.println("1 노트북 : "+ LAPTOP_PRICE +" 원");
		System.out.println("2 디지털 카메라 : " + CAMERA_PRICE + " 원");
		System.out.println("*************************");
		
		System.out.println("상품번호 입력 : ");
		num = sc.nextInt();
		
		
		switch (num) {
			case 1:
				
				printOrderDetails(LAPTOP_NAME, LAPTOP_PRICE, sc);
//				System.out.println("주문 수량 입력 :");
//				amount = sc.nextInt();
//				
//				orderPrice = LAPTOP_PRICE * amount;
//				
//				if (orderPrice >= 1000000) {
//					discount = (int) (orderPrice * 0.1);
//				} else if (orderPrice >= 500000) {
//					discount = (int) (orderPrice * 0.05);
//				} else {
//					discount = 0;
//				}
//				
//				finalPrice = orderPrice - discount;
//				
//				System.out.println("******* 주문 내용 *******");
//				System.out.println("상품명 : 노트북");
//				System.out.println("가격 : " + LAPTOP_PRICE + " 원");
//				System.out.println("주문 수량 : " + amount + " 개");
//				System.out.println("주문액 : " + orderPrice + " 원");
//				System.out.println("할인  : " + discount + " 원");
//				System.out.println("총 지불액  : " + finalPrice + " 원");
				break;
			
				
			case 2:
				printOrderDetails(CAMERA_NAME, CAMERA_PRICE, sc);
				break;
				
			default: {
				System.out.println("잘못 입력하였습니다. 종료합니다.");
				break;
			}
				
		}
		
		sc.close();

	}
	
	static void printOrderDetails(String productName, int productPrice, Scanner sc) {
		
		int amount;
		int orderPrice;
		int discount;
		int finalPrice;
		
		System.out.println("주문 수량 입력 :");
		amount = sc.nextInt();
		
		orderPrice = productPrice * amount;
		
		if (orderPrice >= 1000000) {
			discount = (int) (orderPrice * 0.1);
		} else if (orderPrice >= 500000) {
			discount = (int) (orderPrice * 0.05);
		} else {
			discount = 0;
		}
		
		finalPrice = orderPrice - discount;
		
		System.out.println("******* 주문 내용 *******");
		System.out.println("상품명 : " + productName);
		System.out.println("가격 : " + productPrice + " 원");
		System.out.println("주문 수량 : " + amount + " 개");
		System.out.println("주문액 : " + orderPrice + " 원");
		System.out.println("할인 : " + discount + " 원");
		System.out.println("총 지불액 : " + finalPrice + " 원");
		
	}

}
