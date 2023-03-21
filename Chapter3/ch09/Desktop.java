package ch09;

public class Desktop extends Computer {
	//추상클래스가 없고 모든 클래스가 구현됨
	@Override
	public void display() {
			System.out.println("Desktop display");
	}

	@Override
	public void typing() {
			System.out.println("Desktop typing");
	}
	@Override
	public void turnOff() {
		System.out.println("Desktop turnOff");
	}
	
}	
