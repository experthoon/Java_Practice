package day0102;

public class ArrayString_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str; //선언
		str = new String[4]; //생성
		
		//초기화
		str[0] = "주땡";
		str[1] = "성떙";
		str[2] = "최떙";
		str[3] = "지땡";
		
		//출력_#1
		for(int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
		
		//츨력_#2
		for(String a:str)
		{
			System.out.println(a);
		}
		
		int[] arr = {7,12,34,99,23}; //5개 할당과 동시에 0~4번지까지 값 할당
		String[] colors = {"red","yellow","white","gray","black","cyan","pink"};
		
		//arr의 길이 출력 2가지
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int a: arr)
		{
			System.out.println(a);
		}
		for(int i=0;i<colors.length;i++)
		{
			System.out.print(" " + colors[i]);
		}
		System.out.println();
		for(String a:colors)
		{
			System.out.print(" " + a);
		}
	}

}
