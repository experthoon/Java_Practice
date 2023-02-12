package day0103;

import java.util.Scanner;

public class ArraySearchInt_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 선언된 배열에서 숫자를 입력하여 그 숫가자 있는지 찾기
		 * 없으면 없다고, 있으면 몇번째 있는지 출력
		 * 0입력시 종료
		 */
		int [] data = {5, 12, 54, 23, 69, 99, 88, 77, 126, 4, 2, 5};
		boolean flag;
		Scanner sc = new Scanner(System.in);
		int su;
		
		while(true)
		{
			System.out.println("검색할 숫자 입력");
			su = sc.nextInt();
			
			//break
			if(su==0)
				break;
			
			flag = false; //못찾는걸 기본값으로 준다. 찾으면 true
			
			//값 찾기
			for(int i=0; i<data.length; i++)
			{
				if(su==data[i])
				{
					flag=true;
					System.out.println(i+1+"번째에서 검색됨");
				}
			}
			if(!flag)   //flag가 false 이면
				System.out.println(su + "는 데이터에 없음");
			
		}
	}

}
