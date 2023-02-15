package day0113;

import java.util.List;
import java.util.Vector;

public class ListEx_05 {
	
	public static void write(String title, List<String> list)
	{
		System.out.println("**" + title + "**");
		for(int i=0; i<list.size(); i++)
			System.out.println(i + ":" + list.get(i));
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] data = {"장미", "국화", "후리지아", "제라늄"};
		
		
		//배열 데이터 list에 넣기
		List<String> list = new Vector<>();
		for(String s:data)
			list.add(s);
		
		write("초기데이터출력", list);
		System.out.println("1번 인덱스 삭제하기");
		list.remove(1);
		
		write("1번 삭제후 결과", list);
		
		System.out.println("안개꽃 추가하기");
		list.add("안개꽃");
		
		write("추가확인", list);
		
		System.out.println("장미를 rose로 변경");
		list.set(0, "rose");
		
		write("변경후 출력", list);
		
		//전체삭제후 size 확인
		
		System.out.println("전체삭제");
		list.clear();
		
		System.out.println("사이즈: " + list.size());
		
	}

}
