package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); //student �Ѹ��� ���� , studentLee == ����
		
		studentLee.studentID = 12345;   //studentLee �������� : �޸� ��ġ�� ��Ÿ��
		studentLee.studentName ="Lee";
		studentLee.address = "����� ������";   //�ν��Ͻ��� �����߰� ��������� �޼��带 �̿��� �� ����.
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "��⵵ ������";
		
		studentKim.showStudentInfo();
		
		//�ν��Ͻ��� �����ڸ� ȣ���ؼ� ���� �� ����.
		//��ü : ������ �ν��Ͻ�
		//Ŭ���� : ��ü�� ���α׷��� �ϱ����� �ڵ�� ����
		//�ν��Ͻ� : newŰ���带 ����Ͽ� Ŭ������ �޸𸮿� ����
		
		
	}

}
