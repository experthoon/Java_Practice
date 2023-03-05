package ch02;

public class FunctionTest {
	
	public static int addNum(int num1, int num2) { // 매개변수와 반환 둘 다 있는 경우
		
		int result;    //지역변수
		result = num1 + num2;
		return result; //반환이되면 자동으로 없어진다.
		
	}
	
	public static void sayHello(String greeting) { // 반환값이 없는 경우
		
		System.out.println(greeting);
	
	}
	
	public static int calcSum() { //반환만 하고 매개변수가 없는 경우
	
		int sum = 0;
		int i;
		
		for(i=0; i<=100; i++) {
			sum += i;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		int n1 = 10; //지역변수
		int n2 = 20;
		
		int total = addNum(n1, n2); //함수를 호출하면 함수를 사용할 메모리 공간이 스택에 생성.
		System.out.println(total);
		
		sayHello("안녕하세요");
		
		total = calcSum();
		System.out.println(total);
	}

}
