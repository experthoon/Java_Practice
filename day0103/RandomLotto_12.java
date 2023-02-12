package day0103;

public class RandomLotto_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] lotto = new int[6];
		
		//임의의 수를 로또변수에 발생시켜서 넣어준다.
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45) + 1; //1부터 45까지의 숫자
			
			//중복처리
			for(int j=0;j<i;j++) {   //여기서 j는 반드시 i보다 작다
				if(lotto[i]==lotto[j]) {
					i--; //같은번지에 다시 값을 구하기 위해서
					break;  //자신이 속한 반복문을 빠져나온다 i++로 돌아간다
				}
			}
		}
		
		//오름차순 정렬 2중 for문
		for(int i=0; i<lotto.length-1;i++)
		{
			for(int j=i+1; j<lotto.length; j++)
			{
				if(lotto[i]>lotto[j])   //오름차순이 되어야 할 조건
				{
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		
		//출력
		for(int i=0;i<lotto.length;i++)
		{
			System.out.printf("%5d", lotto[i]);
		}
		System.out.println();
	}

}
