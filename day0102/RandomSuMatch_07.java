package day0102;

import java.util.Scanner;

public class RandomSuMatch_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*(
		 * 숫자를 입력하여 그숫자가 발생시킨 난수보다 작은지 큰지 조건을 주어서 숫자맞추기
		 */
		Scanner sc = new Scanner(System.in);
		//1~100사이의 난수발생
		int rnd=(int)(Math.random()*100)+1;
		
		int su; //랜덤수를 추측하여 입력할 숫자
		int cnt=0; //횟수
		
		while(true)
		{
			cnt++;
			System.out.println(cnt + "회차: ");
			su = sc.nextInt();
			
			if(su>rnd)
				System.out.println(su + "보다 작습니다.");
			else if(su<rnd)
				System.out.println(su + "보다 큽니다.");
			else
			{
				System.out.println("맞았습니다 정답은" + rnd + "입니다.");
				break;
			}
		}
	}

}
