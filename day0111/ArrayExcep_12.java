package day0111;

public class ArrayExcep_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] str = {"apple","banana","orange","peach","melon"};
		
		System.out.println("차례대로 출력");
		
		for(int i=0;i<=str.length;i++)
		{
			try {
			System.out.println(str[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열요구: " + e.getMessage());
			}
		}
		
		System.out.println("거꾸로 출력");
		for(int i = str.length-1;i>=0;i--) {
			System.out.println(str[i]);
		}
	}

}
