package day0110;

import java.util.Scanner;

public class SawonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사원명은? ");
		String name = sc.nextLine();
		System.out.println("기본급은? ");
		int gibonPay = Integer.parseInt(sc.nextLine());
		System.out.println("가족수는? ");
		int familySu = Integer.parseInt(sc.nextLine());
		System.out.println("초과근무시간은? ");
		int overTimeSu = Integer.parseInt(sc.nextLine());
		
		Sawon sawon = new Sawon(name, gibonPay, overTimeSu, familySu); //명시적 생성
		
		System.out.println("사원명\t기본급\t가족수당\t시간외수당\t실수령액");
		System.out.println("===========================================");
		System.out.println(sawon.getSawonName() + "\t" + sawon.getGibonPay() + 
	    "\t" + sawon.getFamilySudnag() + "\t" + sawon.getTimeSudang() + "\t" + sawon.getTotalPay());
		
		
	}

}


/*
사원명?  홍길동
기본급?  1000000
가족수? 3
초과근무시간?  30
사원명	기본급	    가족수당	시간외수당	실수령액
--------------------------------------
홍길동	1000000	70000	100000	1053000
 * 
 * 
 * 
 * 
 * */
