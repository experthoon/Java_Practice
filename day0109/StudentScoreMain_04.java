package day0109;

import java.util.Scanner;

public class StudentScoreMain_04 {

	public static void writeStu(StudentScore[] stu)
	{
		for(StudentScore su:stu)
			System.out.println(su.getName() + "\t" + su.getJava() + "\t" + su.getHtml() + "\t" + su.getTotal() + "\t" + su.getAverage() + "\t" + su.getPungga());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학교명을 입력하세요: ");
		String schoolname = sc.nextLine();
		
		int inwon;
		StudentScore[] stu;
		System.out.println("인원수: ");
		inwon = Integer.parseInt(sc.nextLine());
		
		
		
		stu = new StudentScore[inwon];
		for(int i=0; i<inwon;i++)
		{
			stu[i] = new StudentScore();
			System.out.println("이름 ");
			String name = sc.nextLine();
			System.out.println("JAVA ");
			int java = Integer.parseInt(sc.nextLine());
			System.out.println("HTML ");
			int html = Integer.parseInt(sc.nextLine());
			
			stu[i].setName(name);
			stu[i].setJava(java);
			stu[i].setHtml(html);
			
			System.out.println();
		}
		System.out.println("***결과출력***");
		System.out.println("학교명: " + schoolname);
		System.out.println("이름\tjava\thtml\t총점\t평균\t평가");
		System.out.println("-----------------------------------------------------------");
		writeStu(stu);
	}

}
