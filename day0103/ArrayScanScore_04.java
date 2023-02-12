package day0103;

import java.util.Scanner;

public class ArrayScanScore_04 {

	public static void main(String[] args) {
		/*
		 * 먼저 인원수를 입력후 이름, 점수 등을 입력후 출력해보자
		 * 전체 합계와 평균을 구해보자
		 * 등수구하기
		 * 
		 * 
		 */
		int inwon;
		String []name;
		int [] score;
		int [] rank;
		int tot=0;
		double avg=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수를 입력하세요: ");
		inwon = Integer.parseInt(sc.nextLine()); //다음에 문자가 나오니 형변환을 해줘야 한다. 버퍼 때문
		
		//인원수 만큼 배열할당
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];
		
		//인원수 만큼 데이터가 입력
		for(int i=0;i<inwon;i++)
		{
			System.out.println(i + "번지 이름 : ");
			name[i] = sc.nextLine();
			System.out.println(i + "번지 점수 : ");
			score[i] = Integer.parseInt(sc.nextLine());
			
			tot = tot + score[i];
		}
		//등수구하기(다중 for문)
		for(int i=0;i<inwon;i++) 
		{
			rank[i]=1;
			for(int j=0;j<inwon;j++)
			{
				//비교되는 대상이 점수가 더높으면 i번지 등수를 1증가시킨다
				if(score[i]<score[j])
					rank[i]++;
			}
		}
	
		
		avg = (double)tot/inwon;
		
		System.out.println("번호\t이름\t점수\t등수");
		System.out.println("----------------------------");
		for(int i =0; i<inwon;i++)
		{
			System.out.println(i+1 + "\t" + name[i] + "\t" + score[i] + "\t" + rank[i]);
		}
		System.out.println("-----------------------------");
		System.out.println("총점: " + tot);
		System.out.println("평균: " + avg);
		//번호     이름      점수
		//1      홍길동     88 
		
	}

}
