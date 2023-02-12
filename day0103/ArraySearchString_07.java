package day0103;

import java.util.Scanner;

public class ArraySearchString_07 {

	public static void main(String[] args) {
		// 이름을 입력하여 있으면 몇번재에서 검색이 되는지 없으면 없다고 할것
		//q or Q 입력하면 종료
		Scanner sc = new Scanner(System.in);
		String [] data = {"김영돈","김희수","주하랑","이성희","이지민","권예지","김병훈","이우형"};
		boolean flag;
		String su;
		
		while(true)
		{
			System.out.println("검색할 이름 입력 ");
			su = sc.nextLine();
			
			//break
			if(su.equals("q")||su.equals("Q"))
			{
				System.out.println("종료");
				break;
			}
			flag = false;
			
			for(int i=0;i<data.length;i++)
			{
				if(su.equals(data[i]))
				{
					flag = true;
					System.out.println(i+1+"번째에서 검색됨");
				}
			}
				if(!flag)
					System.out.println(su + "데이터가 없음");
			
		}
	}

}
