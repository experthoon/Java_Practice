package ch21;

public class ContinueTest {

	public static void main(String[] args) {
		int num;
		for(num=1;num<=100;num++)
		{
			if((num%3) !=0) continue; //코딩은 가독성 !!! 3의 배수만 출력
			{
				System.out.println(num);
			}
		}
	}

}
