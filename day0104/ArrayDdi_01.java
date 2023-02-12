package day0104;

import java.util.Scanner;

public class ArrayDdi_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] ddi = {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
		String name;
		int year;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 연도와 이름을 입력: ");
		year = sc.nextInt();
		name = sc.nextLine();
		
		String myDdi = ddi[year%12];
		
		System.out.println(name + "님의 띠는" + myDdi + "띠 입니다.");
		
		
		
	}

}
