package day0104;

public class Array2Cha_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr;
		arr = new int[2][3];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		System.out.println("행의 개수: " + arr.length); //행의 개수
		System.out.println("0행의 열개수: " + arr[0].length);
		System.out.println("1행의 열개수: " + arr[1].length);
		
		System.out.println("**데이터 출력**");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				//System.out.print(arr[i][j]+ "\t");
				System.out.printf("%d %d=%2d\t",i,j,arr[i][j]);
			}
		}
	}

}
