package ch10;

public class CarTest {  //메서드 실행

	public static void main(String[] args) {
		
		Car aiCar = new AICar();
		aiCar.run();
		
		System.out.println("===========================");
		Car mCar = new ManualCar();
		mCar.run();
		
	}

}
