package ch19;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		
		Car sonata = factory.createCar();
		Car avante = factory.createCar();
		
		System.out.println(sonata.getCarNum());
		System.out.println(avante.getCarNum());
		
	}

}
