package day0113;

import java.util.ArrayList;

public class ArrayList_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str = {"장미", "후리지아", "백합", "국화", "안개꽃", "다알리아"};
		
		//객체를 삽입,삭제,검색 할 수 있는 컨테이너클래스
		ArrayList<String> list = new ArrayList<>();
		
		//데이터 담기
		for(String s:str)
			list.add(s);
		//몇개출력
		System.out.println("size: " + list.size());
		//출력#1
		System.out.println("for출력");
		for(int i=0; i<list.size();i++)
		{
			String s = list.get(i);
			System.out.println(s);
		}
		
		System.out.println("for each 출력");
		for(String s:list)
			System.out.println(s);
	}

}
