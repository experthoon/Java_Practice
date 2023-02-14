package day0112;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExFileWriter_07 {

	Scanner sc = new Scanner(System.in);
	FileWriter fw;
	static final String FILENAME = "C:\\sist1226\\file\\member.txt";
	
	public void datawrite()
	{
		try {
			fw = new FileWriter(FILENAME, true);
			
			
			//키보드로 이름,주소,핸드폰 입력후 파일에 저장
			System.out.println("이름입력: ");
			String name = sc.nextLine();
			
			System.out.println("주소입력: ");
			String addr = sc.nextLine();
			
			System.out.println("핸드폰입력: ");
			String hp = sc.nextLine();
			
			System.out.println("**파일저장!!**");
			System.out.println("파일을 확인하세요");
			
			//파일에 저장
			fw.write("회원명: " + name + "\n");
			fw.write("주소: " + addr + "\n");
			fw.write("핸드폰: " + hp + "\n---------------------\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	//추가모드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExFileWriter_07 fw = new ExFileWriter_07();
		fw.datawrite();
	}

}
