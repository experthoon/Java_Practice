package day0102;

public class RandomTest_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 자바에서 난수를 구하는 방법 2가지
		 * 1.math.random() 메서드 이용 : 0.0 <= r < 1.0 ..0.0이상에서 1.0미만의 doulbe형 실수값을 반환
		 * 2.Random 이라는 클래스를 생성해서 구하는 방법
		 * 
		 * */
		//10개의 난수 발생
		System.out.println("10개의 난수 발생");
		for(int i=1; i<=10;i++) {
			double n = Math.random();
			System.out.println(n);
		}
		System.out.println("=============================");
		
		System.out.println("0~9사이의 난수 발생");
		for(int i =1; i<=10;i++) {
			int n = (int)(Math.random()*10);
			System.out.println(n);
		}
		System.out.println("=============================");
		
		System.out.println("0~10사이의 난수 발생");
		for(int i =1; i<=10;i++) {
			int n = (int)(Math.random()*10)+1;
			System.out.println(n);
		}
		System.out.println("=============================");
		
		System.out.println("1~45사이의 난수 발생");
		for(int i =1; i<=10;i++) {
			int n = (int)(Math.random()*45)+1;
			System.out.println(n);
		}
		System.out.println("=============================");
		
		System.out.println("65~90사이의 난수 발생");
		for(int i =1; i<=10;i++) {
			int n = (int)(Math.random()*26)+65;   //65가 시작
			System.out.println(n);
			//int n = (int)(Math.random()*m)+n;
			//n~(m+n-1)
		}
	}

}
