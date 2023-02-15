package day0113;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx_07 {
/*
 * key로 구분
 * 순서는 유지되지않는다
 * 키는 중복을 허용하지 않고 값은 중복허용된다
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("name", "슈가");
		map.put("age", "30");
		map.put("addr", "서울시 강남구");
		
		//같은키값으로 넣으면 먼저데이터는 없어짐
		map.put("name", "수지");
		
		System.out.println("size: " + map.size());
		
		System.out.println("키값을 알면 value값을 얻을 수 있다");
		
		System.out.println("이름 : " + map.get("name"));
		System.out.println("Age: " + map.get("age"));
		System.out.println("Addr: " + map.get("addr"));
		
		
		
		//map에 없는 키값으로 얻으면 널값으로 출력된다.
		System.out.println("Blood: " + map.get("blood"));
		
		
		System.out.println("키값을 먼저 한꺼번에 얻은후 값을 얻는방법");
		Set<String> keySet=map.keySet();
		
		System.out.println("방법1_출력");
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext())
		{
			String key = keyIter.next();
			System.out.println(key + "==>" + map.get(key));
		}
		
		System.out.println("방법2_출력");
		for(String key:keySet)
		{
			System.out.println(key + "==>" + map.get(key));
		}
		
		
		
		
	}

}
