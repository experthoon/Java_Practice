package day0103;

public class ArrayMax_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data = {2, 30, 91, 19, 25, 88, 56, 82, 99, 36};
		
		System.out.println("갯수: " + data.length);
		
		int max = data[0]; //첫데이터를 무조건 최댓값에 저장
		int min = data[0]; //첫데이터를 무조건 최솟값에 저장
		
		//두번째 데이터부터 끝까지 max와 비교
		for(int i=1;i<data.length;i++)
		{
			if(max<data[i])
				max = data[i];
			if(min>data[i])
				min = data[i];
		}
		System.out.println("최대값: " + max);
		System.out.println("최솟값: " + min);
	}

}
