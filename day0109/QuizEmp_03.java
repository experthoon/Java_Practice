package day0109;

import java.util.Scanner;

class Emp{
	//변수선언
	private String name;
	private int famsu;
	private int pay;
	private int timesu;
	
	//setter&getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFamsu() {
		return famsu;
	}
	public void setFamsu(int famsu) {
		this.famsu = famsu;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getTimesu() {
		return timesu;
	}
	public void setTimesu(int timesu) {
		this.timesu = timesu;
	}
	
	//가족수당
	public int getFalmilySudang()
	{
		int n=0;
		if(famsu>=4)
			n=200000;
		else
			n=famsu*50000;
		
		return n;
	}
	//시간수당
	public int getTimeSudang()
	{
		int n=0;
		if(timesu>=10)
			n=300000;
		else
			n=timesu*30000;
		
		return n;
	}
	//총급여
	public int getTotalPay()
	{
		int n = pay + this.getFalmilySudang() + getTimeSudang();
		return n;
	}
	//제목
	public static void showTitle()
	{
		System.out.println("**우리회사 급여현황**");
		System.out.println();
		System.out.println("사원명\t급여\t가족수\t초과시간\t가족수당\t시간수당\t총급여");
		System.out.println("-----------------------------------------------------------");
	}
	
}


////////////////////////////////////////
public class QuizEmp_03 {
	
	public static void wrtieEmp(Emp[] emp)
	{
		//제목부터 출력
		Emp.showTitle();
		for(Emp e:emp)
			System.out.println(e.getName()+ "\t" + e.getPay() + "\t" + e.getFamsu() + "\t" + e.getTimesu() + "\t" + e.getFalmilySudang()
			+ "\t" + e.getTimeSudang() + "\t" + e.getTotalPay());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int inwon;
		Emp[] emp;
		System.out.println("입력할 직원수는 ? ");
		inwon = Integer.parseInt(sc.nextLine());
		
		//배열할당
		emp = new Emp[inwon];
		
		//인원수만큼 데이터 입력
		for(int i=0;i<inwon;i++)
		{
			emp[i] = new Emp();
			System.out.println("이름? ");
			String name = sc.nextLine();
			System.out.println("급여? ");
			int pay = Integer.parseInt(sc.nextLine());
			System.out.println("가족수 입력? ");
			int fs = Integer.parseInt(sc.nextLine());
			System.out.println("초과근무시간? ");
			int ts = Integer.parseInt(sc.nextLine());
			
			//setter로 emp 클래스에 데이터 넣기
			emp[i].setName(name);
			emp[i].setPay(pay);
			emp[i].setFamsu(fs);
			emp[i].setTimesu(ts);
			
			System.out.println();
		}
		
		//출력
		wrtieEmp(emp);
		
	}

}
