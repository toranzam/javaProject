package exam;

public class ReservationEx {

	public static void main(String[] args) {
		Reservation rv = new Reservation(
					"KE1001",
					"홍길동",
					"인천",
					"뉴욕",
					1600000,
					"A38"
				);
		
		rv.showRsvlnfo();

	}

}
