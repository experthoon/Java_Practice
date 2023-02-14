package day0112;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ExFileReadArr_02 {

	public static void fileRead() {
		String fileName = "C:\\sist1226\\file\\info1.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			System.out.println("**파일읽기_학생정보**");
			System.out.println("이름\t학교\t학년");
			System.out.println("------------------------");
			
			while(true)
			{
				String s = br.readLine();
				
				//종료
				if(s==null)
					break;
				//split으로 분리하기
				//String [] data = s.split(","); //한줄로 읽어온것을 콤마로 자르기
				//배열개수만큼 반복해서 출력
				//System.out.println(data[0] + "\t" + data[1] + "\t" + data[2]);
				
				//이번에는 split대신 StringTokenezer를 이용해서 분리
				StringTokenizer st = new StringTokenizer(s, ",");
				System.out.println(st.nextToken() + "\t" + st.nextToken() + "\t" + st.nextToken() + "학년");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileRead();
	}

}
