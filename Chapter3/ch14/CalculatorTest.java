package ch14;

public class CalculatorTest {
//자바에서는 여러개의 클래스를 다중 상속 할 수 없음
//인터페이스는 다중 상속해도 모호성이 발생하지 않음
	public static void main(String[] args) {
		
		
		  int num1 = 10; int num2 = 2;
		  
		  Calc calc = new CompleteCalc();
		  
		  System.out.println(calc.add(num1, num2));
		  System.out.println(calc.substract(num1, num2));
		  System.out.println(calc.times(num1, num2));
		  System.out.println(calc.divide(num1, num2));
		  
		  calc.description();
		 
		
		  int[] arr = {1,2,3,4,5};
		  System.out.println(Calc.total(arr));
		
		
		/*
		 * CompleteCalc calc1 = new CompleteCalc(); 
		 * calc1.show();
		 */	
	}

}
