package exam;

public class Reservation {
	private String airplane;
	private String booker;
	private String departure;
	private String arrival;
	private int price;
	private String seatNumber; 
	
	protected Reservation(String airplane, String booker, String departure, String arrival, int price, String seatNumber) {
		this.airplane = airplane;
		this.booker = booker;
		this.departure = departure;
		this.arrival = arrival;
		this.price = price;
		this.seatNumber = seatNumber;	
	}

	protected void showRsvlnfo() {
		System.out.println("**항공권 예약 정보**");
		System.out.println("항공기 : " + this.airplane);
		System.out.println("예약자 : " + this.booker);
		System.out.println("출발지 : " + this.departure);
		System.out.println("도착지 : " + this.arrival);
		System.out.println("금액 : " + this.price);
		System.out.println("좌석번호 : " + this.seatNumber);
	}
}
