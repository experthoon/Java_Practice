package day0111;

import java.util.Date;

public class NullPointExcep_11 {

	Date date;
	
	public void write()
	{
		int y,m,d;
		
		try {
		y=date.getYear()-1900;
		m=date.getMonth()+1;
		d=date.getDate();
		
		System.out.println(y + "년" + m + "월" + d + "일 입니다");
		}catch(NullPointerException e) {
			System.out.println("객체 생성을 안했어요" + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullPointExcep_11 nu = new NullPointExcep_11();
		nu.write();
		System.out.println("**정상 종료**");
	}

}
