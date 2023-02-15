package day0113;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
 * 상품명? 마우스
 * 수량? 12
 * 단가? 20000
 * 
 * **상품재고현황**
 * No.	상품명		수량		단가		총금액
 * 1.	마우스		12		20000	240000
 */

public class ArrayListShop_09 {
	
	List<Shop> list = new Vector<>();
	
	public void inputData1() {
		Scanner sc = new Scanner(System.in);
		String sangpum;
		int su, dan;
		
		System.out.println("상품명: ");
		sangpum = sc.nextLine();
		System.out.println("수량: ");
		su = Integer.parseInt(sc.nextLine());
		System.out.println("단가: ");
		dan = Integer.parseInt(sc.nextLine());
		
		Shop shop = new Shop();
		shop.setSangpum(sangpum);
		shop.setDan(dan);
		shop.setSu(su);
		
		list.add(shop);
		System.out.println("현재상품입고: " + list.size() + "개");
		
	
	}
	public void writeData1()
	{
		System.out.println("**상품재고현황**");
		System.out.println("===================================");
		System.out.println("No.\t상품명\t상품가격\t수량\t총액");
		for(int i=0; i<list.size();i++)
		{
			Shop s = list.get(i);
			System.out.println(i+1 + "\t" + s.getSangpum() + "\t" + s.getDan() + "\t" + s.getSu() + "\t" + s.getTot());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListShop_09 as = new ArrayListShop_09();
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true)
		{
			System.out.println("1.추가  2.전체출력  9.종료");
			n = Integer.parseInt(sc.nextLine());
			
			if(n==1)
				as.inputData1();
			else if(n==2)
				as.writeData1();
			else if(n==9)
			{
				System.out.println("종료합니다");
				break;
			}
		}
	}

}
