package day0102;

import java.util.Scanner;

public class QuizForWhile_02 {
	
	public static void quiz1() {
		//두 수 x, y 를 입력후 x의 y승을 for문을 이용해서 구하기
		Scanner sc = new Scanner(System.in);
		int x,y,z;
		int i=1;
		
		System.out.println("x의 값을 입력하세요: ");
		x = sc.nextInt();
		System.out.println("y의 값을 입력하세요: ");
		y = sc.nextInt();
		
		for(z=1;z<=y;z++) {
			i = i*x;
		}
		System.out.println(x+ "의" + y + "승은" + i);
	}
	
	public static void quiz2() {
		
		//팩토리알을 구할 숫자를 입력하여 결과값을 구해보세요
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int fac = 1;
		
		System.out.println("팩토리얼 값을 입력하세요: ");
		x = sc.nextInt();
		
		for(int i = x; i>=1; i--) {
			fac = fac * i;
		}
		System.out.println(x + "!은" + fac);
		
	}

	public static void quiz3() {
		for(int i=1; i<=3; i++) {
			System.out.println(i + " .Hello");
			for(int j=1;j<=4;j++) {
				System.out.print("\t" + j + ":Java");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//quiz1();
		//quiz2();
		quiz3();
	}

}
