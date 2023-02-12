package day0103;

public class OrderChange_08 {

	public static void main(String[] args) {
		// 배열의 순서바꾸기 연습
		
		int a=10, b=20;
		System.out.println("a= "+a+", b="+b);
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a= "+a+", b="+b);
		
		
		System.out.println("**배열 순서 변경**");
		int [] a1 = {5, 7, 2};
		
		for(int n:a1)
			System.out.println(n+ " ");
		
		System.out.println("0번과 2번을 교환후 출력");
		int temp1 = a1[0];
		a1[0] = a1[2];
		a1[2] = temp1;
		
		for(int n:a1)
			System.out.println(n+ " ");
		
	}

}
