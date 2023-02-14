package day0112;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExFileReadWrite_08 {

	static final String FILENAME = "C:\\sist1226\\file\\sungjuk.txt";
	FileReader fr;
	BufferedReader br;
	FileWriter fw;
	Scanner sc = new Scanner(System.in);
	
	
	
	//메뉴선택
	public int getMenu()
	{
		int num = 0;
		
		System.out.println("1. 추가 2. 전체출력 9. 종료");
		num=Integer.parseInt(sc.nextLine());
		
		return num;
	}
	
	
	
	
	
	
	//정보입력해서 파일에 저장
	public void sungjukIn()
	{
		//이름과 점수를 입력
		System.out.println("학생명을 입력하세요");
		String name = sc.nextLine();
		System.out.println("점수를 입력하세요");
		int score = Integer.parseInt(sc.nextLine());
		
		try {
			fw = new FileWriter(FILENAME, true);
			
			//입력한 내용 저장하기
			fw.write(name + "\n");
			fw.write(score + "\n");
			
			System.out.println("***학생정보 저장 완료***");
			
			
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
	
	//파일을 읽어서 출력
	public void fileRead()
	{
		//제목부터 출력
		System.out.println("\t**학생정보**");
		System.out.println("번호\t이름\t점수\t학점");
		System.out.println("==================================");
		
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			
			int num=0;
			
			while(true)
			{
				String name = br.readLine();
				
				if(name==null)
					break;
				
				int score = Integer.parseInt(br.readLine());
				
				char grade = getGrade(score);
				System.out.println(++num + "\t" + name + "\t" + score + "\t" + grade);
			}
			System.out.println("출력끝");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//점수에 대한 학점 변환하는 메서드
	public char getGrade(int score)
	{
		char ch;
		switch (score/10) {
		case 10:
		case 9:
			ch = 'A';
			break;
		case 8:
			ch = 'B';
			break;
		case 7:
			ch = 'C';
			break;
		case 6:
			ch = 'D';
			break;
		default:
			ch = 'F';
			break;
		}
		return ch;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExFileReadWrite_08 ex = new ExFileReadWrite_08();
		
		while(true)
		{
			int num = ex.getMenu();
			
			switch(num)
			{
			case 1:
				System.out.println("학생정보 입력");
				ex.sungjukIn();
				break;
				
			case 2:
				System.out.println("**전체 학생정보 출력**");
				ex.fileRead();
				break;
				
			case 9:
				System.out.println("프로그램 종료합니다.");
				System.exit(0);
				
			}
		}
	}

}
