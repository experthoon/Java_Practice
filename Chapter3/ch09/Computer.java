package ch09;

public abstract class Computer { //추상클래스를 만드는 이유 ? turnon이랑 turnoff를 구현 가능 그렇지만 상속 받을 하위클래스들이 타이핑을 어떻게 할지 모름
	//추상클래스는 상속을 위한 클래스
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
}
