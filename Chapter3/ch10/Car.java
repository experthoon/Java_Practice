package ch10;

public abstract class Car { 

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper(); //기능 추가
	
	
	public void starCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//abstract 메서드면 하위클래스에서 반드시 구현을 해야한다.
	
	public void washCar() { // 구현 내용이 없음 구현 안된건 아니다. // 훅 메서드
		
	}
	
	final public void run() { // 이 시나리오는 변하면 안된다. 재정의 되면 안되는 메서드를 final로 선언
		starCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
