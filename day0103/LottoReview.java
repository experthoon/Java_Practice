package day0103;

import java.util.Scanner;

public class LottoReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] lotto = new int[6];
		int money;
		
		System.out.println("로또 구입 금액을 입력하세요");
		money = sc.nextInt();
		
		if(money<1000)
		{
			System.out.println("금액 부족");
			return;
		}
		for(int n=0;n<money/1000;n++)
		{
			System.out.printf("%3d",n+1);
			for(int i=0;i<lotto.length;i++)
			{
				lotto[i] = (int)(Math.random()*45)+1; //임의의 난수
				//중복처리
				for(int j=0; j<i;j++)
				{
					if(lotto[i]==lotto[j])
					{
						i--;
						break;
					}
				}
			}
		}
		//오름차순 정렬
		for(int i=0; i<lotto.length-1;i++) //기준값
		{
			for(int j=0; j<lotto.length; j++)
			{
				if(lotto[i]>lotto[j])
				{
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		//출력
		for(int i =0; i<lotto.length; i++)
		{
			System.out.printf("%5d",lotto[i]);
		}
		System.out.println();
	}

}
