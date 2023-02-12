package day0102;

import java.util.Scanner;

public class ReviewForWhile_01 {
	
	public static void whileTest() {
		Scanner sc = new Scanner(System.in);
		int su;
		int cnt=0,sum=0;
		double avg;
		
		while(true) {
			System.out.println("점수 입력");
			su = sc.nextInt();
			
			//break
			if(su==0)
				break;
			
			//continue
			if(su<0 || su>100) {
				System.out.println("\t다시 입력해주세요");
				continue;
			}
			cnt++;
			sum+=su;
			
		}
		avg = (double)sum/cnt;
		System.out.println("총갯수: " + cnt);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
	}
	
	public static void forTest() {
		/*
		 * 총 5개의 점수를 입력받아 합계를 구하려고한다(반복문)
		 * 1~100이 아닐경우 다시 입력받으시오 (continue)
		 */
		Scanner sc = new Scanner(System.in);
		int score;
		int sum=0;
		
		for(int i=1;i<=5;i++) {
			System.out.println(i + "번 점수 입력");
			score = sc.nextInt();
			
			if(score<1 || score>100) {
				System.out.println("\t 다시 입력해주세요");
				continue;
			}
			sum = sum + score;
		}
		System.out.println("총점: " + sum);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
