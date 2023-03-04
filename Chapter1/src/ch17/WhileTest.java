package ch17;

public class WhileTest {

	public static void main(String[] args) { //블록
		int num = 1;
		int sum = 0;     //지역변수 자동 초기화 x
		
		while(num<=10) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}//블록

}
