package day0111;

public class ArithExcep_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램시작");
		
		try {
		int num=3/0; //정수를 0으로 나누면 발생하는 오류
		}catch (ArithmeticException e) {
			//e.printStackTrace(); //자세한 예외정보 출력
		}
		System.out.println("프로그램종료");
	}

}
