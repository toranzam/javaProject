package variable;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;
		double radius = 10;
		double circleArea = 0;
		
		circleArea = radius * radius * PI;
		radius = 20.0; // 변수값 변경 가능
		// PI - 3.14; 상수 변경 불가능
		// The final local variable PI cannot be assigned. It must be blank and
		
		// println 메소드는 문자열을 파라미터로 전달 받음
		// 아래 코드는 circleArea 변수의 값이 문자열 형변환되어서 파라미터로 전달 
		// 파라미터 전달 전 문자열 결합연산(+) 사용 가능 
		System.out.println(circleArea);

	}

}
