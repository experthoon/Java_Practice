package day0111;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * score.txt 를 읽고 총 몇개인지 구하기, 점수에대한 총점과 평균까지 출력
 * 
 */
public class FileException_16 {

	public static void scoreInput()throws IOException,FileNotFoundException
	{
		String fileName = "C:\\sist1226\\file\\score.txt";
		FileReader fr =null;
		BufferedReader br = null;
		int cnt = 0; //총개수
		int total = 0; //합계
		double avg = 0; //평균
		
		//파일읽기
		fr = new FileReader(fileName);
		System.out.println("파일 정상적으로 읽음!!");
		
		br = new BufferedReader(fr);
		
		while(true)
		{
			String s = br.readLine();   //한줄 한줄 읽음
			// 종료
			if(s==null)
				break;
			
			//문자열 점수를 int로 반환하여 합계랑 개수 구하기
			cnt++; //읽은개수
			total += Integer.parseInt(s); // 합계
		}
		//평균구하기
		avg=(double)total/cnt;
		
		System.out.println("총갯수: " + cnt);
		System.out.println("총합계: " + total);
		System.out.printf("평균:%.2f\n ", avg);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			scoreInput();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("정상종료");
	}

}
