package day0113;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarketList {

	
	static final String FILENAME = "C:\\sist1226\\file\\market.txt";
	List<Market> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public MarketList() {
		// TODO Auto-generated constructor stub
		marketRead();
	}
	
	//파일쓰기
	public void marketWrite()
	{
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(FILENAME);
			//market클래스의 내용을 얻어서 출력
			for(Market market:list)
			{
				String s = market.getSangName() + ", " + market.getSu() + ", " + market.getDan() + "\n";
				fw.write(s);
			}
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
	//파일읽기
	public void marketRead()
	{
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			
			while(true)
			{
				String market = br.readLine();
				
				if(market==null)
					break;
				
				String [] d = market.split(",");
				
				String sang = d[0];
				int su = Integer.parseInt(d[1]);
				int dan = Integer.parseInt(d[2]);
				int total = su*dan;
				
				//Market클래스에 저장방법#1
				/*Market m = new Market(); //디폴트 생성후 setter에 넣는법
				m.setSangName(sang);
				m.setSu(su);
				m.setDan(dan);
				m.setTotal(total);*/
				
				//Market클래스에 저장방법#2
				Market m = new Market(sang, su, dan);
				
				//리스트에 추가
				list.add(m);
			}
			System.out.println("파일에서 총" + list.size() + "개의 상품목록을 가져옴");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("저장된 상품이 아직없습니다");
		
		}catch (IOException e) {
			// TODO: handle exception
		}finally {
			
				try {
					if(br!=null) br.close();
					if(fr!=null) fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	//market 정보 입력
	public void marketAdd() {
		System.out.println("추가할상품명은? ");
		String sang = sc.nextLine();
		System.out.println("수량은? ");
		int su = Integer.parseInt(sc.nextLine());
		System.out.println("단가는? ");
		int dan = Integer.parseInt(sc.nextLine());
		
		//market클래스 생성
		Market market = new Market(sang, su, dan);
		
		//리스트에 market을 추가
		list.add(market);
		System.out.println("상품정보가 추가되었습니다.");
	}
	//전체출력
	public void marketAllDatas() {
		if(list.size()==0) {
			System.out.println("**출력할 상품이 없습니다**");
			return; //현재 메서드 종료
		}
		
		System.out.println("**상품정보**");
		System.out.println("번호\t상품\t수량\t단가\t총금액");
		System.out.println("====================================");
		
		for(int i=0; i<list.size(); i++)
		{
			Market m = list.get(i);
			System.out.println((i+1) + "\t" + m.getSangName() + "\t" + m.getSu() + "\t" + m.getDan() + "\t" + m.getTotal());
		}
	}
	//메인 프로세스 메서드
	public void process() {
		int num=0;
		
		while(true)
		{
			System.out.println("1.상품추가 2.상품출력 9.종료");
			num=Integer.parseInt(sc.nextLine());
			
			if(num==1)
				this.marketAdd();
			else if(num==2)
				this.marketAllDatas();
			else if(num==9)
			{
				System.out.println("저장후 종료");
				this.marketWrite();
				System.exit(0);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarketList ml = new MarketList();
		ml.process();
	}

}
