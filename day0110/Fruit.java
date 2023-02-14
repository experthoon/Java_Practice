package day0110;

abstract public class Fruit {
	
	//추상클래스 
	//new로 생성 못함
	//abstract에서드는 abstract클래스에서만 존재할수있다.
	//abstract클래스 일반메서드와 추상메서드 둘다 포함 가능
	
	
	//상수선언.. final
	public static final String MESSAGE="오늘은 화요일";
	
	//일반메서드
	public void showTitle()
	{
		System.out.println("우리는 추상클래스를 공부중입니다. ");
	}
	//추상메서드(미완의 메서드.. 선언부만 있고 몸통이 없음!!, 오버라이딩이 목적)
	abstract public void showMessage();
}
