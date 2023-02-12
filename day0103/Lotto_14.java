package day0103;

import java.util.Random;



public class Lotto_14

{

	public static void main(String[] args)
	{
		// 인스턴스 생성
		Random rd = new Random();
		// 주요 변수 선언
		int temp[] = new int[6];	// 수를 담을 변수
		boolean t = true;
		// 배열생성
		for (int i=0; i<5; i++)	//개행을 위한 포문
		{
			// 난수 발생
			for (int j=0; j<6; j++)	//앞에서부터 비교
			{
				//temp[j] = (int)Math.round(Math.random()*45);
				temp[j] = rd.nextInt(45)+1;
				for (int k=0; k<6; k++)	//뒷번호들과 비교
				{
					if (j==k)
						break;
					else if (temp[j]==temp[k])
					{
						temp[j] = rd.nextInt(45)+1;
						k=0;
					}
				}				
			}
			// 선택정렬
			for (int a=0; a<temp.length-1; a++)
			{
				for (int b=a+1; b<temp.length; b++)
				{
					if (temp[a]>temp[b])
					{
						temp[a] = temp[a]^temp[b];
						temp[b] = temp[b]^temp[a];
						temp[a] = temp[a]^temp[b];
					}
				}
			}
			// 결과 출력
			for (int n : temp)
				System.out.printf("%3d", n);
			System.out.println();
		}
	}//end main()
}