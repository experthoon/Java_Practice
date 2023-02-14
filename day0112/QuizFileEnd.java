package day0112;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class QuizFileEnd {
	
	//파일에 저장
	
	//상품명과 수량 단가를 입력받아서 아이폰 14,2,1400000 이런식으로 파일에 저장
	//키보드 입력받아서 저장할것
	Scanner sc = new Scanner(System.in);
	static final String FILENAME = "C:\\sist1226\\file\\sangpum.txt";
	FileReader fr;
	BufferedReader br;
	FileWriter fw;
	
	//메뉴선택
	public int getMenu() {
		int num=0;
		System.out.println("**메뉴**");
		System.out.println("1.상품추가 ");
		System.out.println("2.전체상품추가 ");
		System.out.println("3.파일삭제");
		System.out.println("9.종료 ");
		num=Integer.parseInt(sc.nextLine());
		
		return num;
	}
	//저장
	public void sangpumAdd() {
		String sang;
		int su, dan;
		
		System.out.println("상품명 입력 ");
		sang = sc.nextLine();
		System.out.println("수량 입력 ");
		su = Integer.parseInt(sc.nextLine());
		System.out.println("단가 입력");
		dan = Integer.parseInt(sc.nextLine());
		
		try {
			fw = new FileWriter(FILENAME,true);
			fw.write(sang + "," + su + "," + dan + "\n");
			
			System.out.println("추가되었습니다.");
			
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
	
	//출력
	//번호	상품명		수량		단가		총금액
	public void fileAllDatas() {
		NumberFormat nf = NumberFormat.getInstance();
		
		int total=0;
		int num=0;
		
		//제목
		System.out.println("번호\t상품명\t수량\t단가\t총금액");
		System.out.println("======================================");
		
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			
			while(true)
			{
				String s = br.readLine();
				
				if(s==null)
					break;
				
				String [] data = s.split(",");
				String sang = data[0];
				int su = Integer.parseInt(data[1]);
				int dan = Integer.parseInt(data[2]);
				int sum = su * dan;
				
				//총금액에 추가
				total = total + sum;
				
				System.out.println(++num + "\t" + sang + "\t" + su + "\t" + nf.format(dan) + "\t" + nf.format(sum));
			}
			System.out.println("출력 끝");
			System.out.println("\t총금액은 = " + nf.format(total));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			
		}finally {
			try {
				br.close();
				fr.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//파일삭제
	public void deleteSangpum() {
		//파일삭제
		//파일객체생성
		File file = new File(FILENAME);
		//파일이 존재한다면 삭제한다
		if(file.exists())
			file.delete();
		
		System.out.println("**데이터가 삭제되었습니다**");
		
	}
	//메서드 최종처리하는 메서드
	public void process() {
		while(true)
		{
			int num = this.getMenu();
			
			switch(num) {
			case 1:
				System.out.println("상품정보 추가합니다");
				sangpumAdd();
				break;
			case 2:
				System.out.println("전체 상품을 출력합니다");
				fileAllDatas();
				break;
			case 3:
				System.out.println("상품정보를 삭제합니다");
				deleteSangpum();
				break;
			case 9:
				System.out.println("프로그램 종료합니다");
				System.exit(0);
			default:
				System.out.println("다시 번호 확인해주세요");
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizFileEnd qfe = new QuizFileEnd();
		qfe.process();
		//1. 상품추가  2. 전체상품출력  3.파일삭제  9. 종료
	}

}
