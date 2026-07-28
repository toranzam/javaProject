package exam.constructor_ex;


public class Automobile extends Car{
	
	String autoManual;

	public Automobile(String carNo, String carName, String carMaker, int carYaer, String autoManual) {
		super(carNo, carName, carMaker, carYaer);
		this.autoManual = autoManual;
	}

}
