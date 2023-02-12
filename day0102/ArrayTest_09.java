package day0102;

public class ArrayTest_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열선언, 기본형배열은 객체인식
		//int []arr = new int[3];
		int [] arr,arr2; //배열선언
		arr = new int[3]; //메모리 할당
		arr2 = new int[5]; //초기값을 안주더라도 할당만 일단 하게되면 0으로 초기화됨
		
		//배열에 값을 넣는다_초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		//개수,출력
		System.out.println("배열 arr의 갯수: " + arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		//for ~ each
		for(int a:arr)
		{
			System.out.println(a);
		}
		
		//arr2에 초기화를 하지않고 출력해보기
		System.out.println("배열 arr2의 갯수: " + arr2.length);
		
		//출력_#for
		for(int i=0; i<arr2.length;i++)
		{
			System.out.println(i+ "==>" + arr2[i]);
		}
		
		//출력_#for~each
		for(int a2:arr2)
		{
			System.out.println(a2);
		}
	}

}
