package ch19;

public class CarFactory {
	
	private static CarFactory instance = new CarFactory(); //private
	
	private CarFactory() {
		
	}
	
	public static CarFactory getInstance() { //public
		
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
		
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
