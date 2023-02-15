package day0113;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1 = new HashSet<>();
		
		set1.add(5);
		set1.add(15);
		set1.add(45);
		set1.add(25);
		set1.add(35);
		
		System.out.println("갯수: " + set1.size());
		
		System.out.println("출력1");
		for(int n:set1)
			System.out.println(n);
		System.out.println();
		
		
		
		System.out.println("출력2");
		Iterator<Integer> iter = set1.iterator();
		while(iter.hasNext())
			System.out.printf("%5d",iter.next());
		System.out.println();
		
		System.out.println("출려3");
		Object [] ob = set1.toArray();
		for(int i=0;i<ob.length;i++)
			System.out.printf("%5d", ob[i]);
	}

}
