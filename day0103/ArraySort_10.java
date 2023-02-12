package day0103;

public class ArraySort_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//문자열 오름차순 정렬
		String [] data = {"이승기", "유재석", "하하", "신민아", "송혜교", "강호동", "노홍철"};
		
		System.out.println("정렬전 출력");
		for(int i=0;i<data.length;i++)
		{
			System.out.print(data[i] + " ");
		}
		//오름차순 출력
		for(int i=0;i<data.length-1;i++)
		{
			for(int j=i+1;j<data.length;j++)
			{
				if(data[i].compareTo(data[j])>0)  //a.compareto(b) 같으면 0반환, i>j 양수 i<j 음수
				{
					String temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}	
			}
		}
		System.out.println();
		System.out.println("정렬후 출력");
		for(int i=0;i<data.length;i++)
		{
			System.out.print(data[i] + " ");
		}
		
	}

}
