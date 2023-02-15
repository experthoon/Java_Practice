package day0113;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set, Random 이용해서 난수발생(1~45) 6개출력
		Random r = new Random();
		
		Set<Integer> set = new HashSet<>();
		
		while(true)
		{
			int n = r.nextInt(45)+1;
			set.add(n);
			
			if(set.size()==6)
				break;
		}
		
		//출력
		System.out.println("출력1");
		
		for(int n:set)
			System.out.printf("%4d",n);
		System.out.println();
		
		
		System.out.println("출력2");
		Object [] ob = set.toArray();
		Arrays.sort(ob);
		
		for(int i=0;i<ob.length;i++) {
			System.out.printf("%4d", ob[i]);
		}
			
		
	}

}
