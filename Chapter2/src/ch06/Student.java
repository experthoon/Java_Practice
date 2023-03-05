package ch06;

public class Student {
	
	public int studentNumber; //멤버변수는 객체가 만들어질때 초기화됨
	public String studentName;
	public int grade;
	
	public Student() { //디폴트
		
	}
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber; //this를 써야 멤버변수가 지정된다.
		this.studentName =studentName;
		this.grade = grade;
	}
	
	public String showStduentInfo() { //지역변수는 자동으로 초기화 x 
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
	}
	
}
