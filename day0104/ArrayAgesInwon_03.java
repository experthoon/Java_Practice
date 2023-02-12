package day0104;

import java.util.Scanner;

public class ArrayAgesInwon_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] age = new int[10];
		int [] inwon = new int[5]; //10대인 경우 0번지 증가...
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<age.length;i++)
		{
			System.out.println("나이 입력: ");
			age[i] = sc.nextInt();
			
			if(age[i]<10 || age[i]>=60)
				continue;
			
			inwon[age[i]/10-1]++; 
		}
		
		//결과출력(나이)
		for(int i=0;i<age.length;i++)
		{
			System.out.printf("%5d",age[i]);
			if((i+1)%5==0)
				System.out.println();
		}
		//분포도
		System.out.println("***연령별 나이 분포***");
		for(int i=0;i<inwon.length;i++)
		{
			System.out.printf("%d대: %d명",(i+1)*10,inwon[i]);
		}
	}

}
