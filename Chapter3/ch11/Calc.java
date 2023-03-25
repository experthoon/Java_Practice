package ch11;

public interface Calc { // 인터페이스는 상속이 아니라 구현한다라는 의미.

	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
