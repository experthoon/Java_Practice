package ch06;

public class Student {
	
	public int studentNumber; //��������� ��ü�� ��������� �ʱ�ȭ��
	public String studentName;
	public int grade;
	
	public Student() { //����Ʈ
		
	}
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber; //this�� ��� ��������� �����ȴ�.
		this.studentName =studentName;
		this.grade = grade;
	}
	
	public String showStduentInfo() { //���������� �ڵ����� �ʱ�ȭ x 
		return studentName + "�л��� �й��� " + studentNumber + "�̰�, " + grade + "�г� �Դϴ�.";
	}
	
}
