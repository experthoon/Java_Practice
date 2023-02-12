package day0104;

import java.util.Scanner;

public class ArraysSearchCnt_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {"김도희", "김병훈", "김영돈", "박종수", "권예지","이우형", "이지영", "서동익", "지성용", "서아랑"};
		
		String search;
		int cnt; //검색시마다 0으로 초기화되야 새로 cnt할 수 있다.
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("검색할 성을 입력: ");
			search = sc.nextLine();
			
			if(search.equals("종료"))
			{
				System.out.println("종료합니다!!!");
				break;
			}
			boolean find = false;
			cnt = 0; // 초기화
			
			for(int i=0;i<names.length;i++){
				if(names[i].startsWith(search)) //startsWith 무슨 성으로 시작하는지
				{
					cnt++;
					System.out.println((i+1)+ ":" + names[i]);
					find = true;
				}
			}
			if(find)
				System.out.println("\t총" + cnt + "명 검색");
			else
				System.out.println(search + "씨 성을 가진 사람은 없습니다.");
			System.out.println();
		}
	}

}
