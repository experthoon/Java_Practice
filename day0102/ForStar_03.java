package day0102;

public class ForStar_03 {

	public static void star1() {
		System.out.println("***다중 for문으로 start(*)출력하기***");
		for(int i=1; i<=5; i++) { //행
			for(int j=1; j<=5; j++) { //열
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void star2() {
		System.out.println("***다중 for문으로 start(*)출력하기***");
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void star3() {
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//star1();
		star2();
		star3();
	}

}
