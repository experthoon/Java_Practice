package day0104;

import java.util.Scanner;

public class ArraySearch_02 {

	public static void main(String[] args) {
		// 숫자를 입력하여 배열에 몇번째 있는지 출력하고 없을 경우 없습니다 라고 출력
		// 반복해서 입력하다가 0 입력시 종료
		int [] arr = {23, 45, 89, 111, 2, 3, 66, 99, 88, 54, 21, 100};
		boolean flag;
		Scanner sc = new Scanner(System.in);
		int su;
		
		while(true)
		{
			System.out.println("입력값: ");
			su = sc.nextInt();
			
			if(su==0) {
				System.out.println("종료합니다.");
				break;
			}
			flag = false;
			
			for(int i=0;i<arr.length;i++) //배열 갯수만큼 반복하면서 입력한 숫자 찾기(배열만큼 반복)
			{
				if(su==arr[i])
				{
					flag = true;
					System.out.println(i+1+"번째에 있어여!");
				}
			}
			if(!flag) //배열에 없으면 flag는 여전히 false
				System.out.println(su + "은 없습니다.");
		}
		
	}

}
