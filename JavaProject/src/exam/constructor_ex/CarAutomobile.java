package exam.constructor_ex;

import exam.constructor_ex.Car;

public class CarAutomobile {

	public static void main(String[] args) {
		Automobile car = new Automobile("01가 1234", "아반떼", "현대", 2022, "자동");
		
		System.out.println("차량 번호 : " + car.carNo);
		System.out.println("차종 : " + car.carName);
		System.out.println("제조사 : " + car.carMaker);
		System.out.println("연식 : " + car.carYaer);
		System.out.println("기어변속 : " + car.autoManual);
		

	}

}
