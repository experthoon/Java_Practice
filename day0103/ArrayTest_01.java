package day0103;

public class ArrayTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = new int[5];
		
		arr1[1] = 10;
		arr1[4] = 34;
		
		//출력
		for(int i =0; i<arr1.length; i++)
		System.out.println(arr1[i]);
		
		
		//for each
		System.out.println("==================");
		for(int a:arr1)
			System.out.println(a);
		
		
		
		System.out.println("==================");
		//선언과 동시에 초기화
		int [] arr2 = {23, 11, 22, 35, 26, 18};
		System.out.println("배열갯수: " + arr2.length);
		System.out.println("#1_출력");
		
		
		for(int i=0; i<arr2.length; i++)
			System.out.printf("%5d",arr2[i]);
			System.out.println();
		
		
		
		System.out.println("#2_출력");
		for(int s:arr2)
			System.out.printf("%4d",s);
	}

}
