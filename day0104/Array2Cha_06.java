package day0104;

public class Array2Cha_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열선언, 할당과 동시에 초기값 설정
		int [][] arr = {{23,30},{1,5,8},{10,20,30,40}};
		
		System.out.println("총 행갯수: " + arr.length);
		System.out.println("0번행의 열갯수: " + arr[0].length);
		System.out.println("1번행의 열갯수: " + arr[1].length);
		System.out.println("2번행의 열갯수: " + arr[2].length);
		
		System.out.println("**데이터 출력**");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				//System.out.print(arr[i][j]+ "\t");
				System.out.printf("[%d][%d]=%d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
	}

}
