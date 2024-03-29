package ch14;

public interface Calc { // 인터페이스는 상속이 아니라 구현한다라는 의미.

	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() { //디폴트 메서드
		System.out.println("정수의 사칙연산을 제공합니다.");
	}
	
	static int total(int[] arr) { //정적 메서드
		//정수 배열 합을 반환
		int total = 0;
		for(int num:arr) {
			total += num;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("myMethod");
	}
	
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
}
