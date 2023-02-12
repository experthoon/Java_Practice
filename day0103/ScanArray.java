package day0103;

import java.util.Scanner;

public class ScanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5개의 배열을 선언후 그 초기값들을 입력한후 출력해보자
		 * 
		 * 
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		int data[];
		int sum = 0;
		data = new int[5];
		
		
		//값 입력
		for(int i=0;i<data.length; i++)
		{
			System.out.println(i + 1 + "번째 값: ");
			data[i] = sc.nextInt();
			sum = sum + data[i];
		}
		
		//값 출력
		System.out.println("입력값 확인");
		for(int i=0; i<data.length; i++)
		{
			System.out.println(i + "==>" + data[i]);
		}
		System.out.println("총 합계는 : " + sum);
	}

}
