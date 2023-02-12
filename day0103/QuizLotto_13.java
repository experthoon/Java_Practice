package day0103;

import java.util.Scanner;

public class QuizLotto_13 {

	public static void main(String[] args) {
		/*
		 * 로또 구매금액(개수)을 입력한 후 출력하시오
		 * 로또 구매금액은?
		 * 5000
		 * 1회 : 4 20 22 26 38 45
		 * 2회 :
		 * 3회 :
		 * 4회 :
		 * 5회 :
		 */
		Scanner sc = new Scanner(System.in);
		int [] lotto = new int[6];
		int money;
		
		System.out.println("로또 구입금액을 입력해주세요");
		money = sc.nextInt();
		
		if(money<1000)
		{
			System.out.println("**금액이 부족합니다.**");
			return;   // 금액이 부족합니다 뜨고 빠져나감
		}
		for(int n=0; n<money/1000; n++)
		{
			System.out.printf("%3d회: ", n+1);
			
			//임의의 수를 로또변수에 발생시켜 넣어준다.
			for(int i=0; i<lotto.length;i++)
			{
				lotto[i] = (int)(Math.random()*45)+1; //임의의 난수 
				
				//중복처리
				for(int j=0;j<i;j++)
				{
					if(lotto[i]==lotto[j])
					{
						i--;
						break;   //자신이 속한 반복문을 빠져나간다.
					}
				}
			}
			
			//오름차순 정렬
			for(int i=0; i<lotto.length-1;i++)    //처음부터 끝에서 두번째까지 비교
			{
				for(int j=i+1;j<lotto.length;j++) //비교하는 값은 끝까지
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
			for(int i=0; i<lotto.length;i++)
			{
				System.out.printf("%5d",lotto[i]);
			}
			System.out.println();
		}
		
		
		
	}

}
