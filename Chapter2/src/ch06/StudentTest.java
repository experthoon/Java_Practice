package ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); //����Ʈ ������ -> Ŭ������ �����ڰ� �ϳ��� ���� ���
		
		System.out.println(studentLee.showStduentInfo());
		
		Student studentKim = new Student(123456, "Kim", 3);
		System.out.println(studentKim.showStduentInfo());
		//�����ε� : �޼����� �̸��� �Ȱ��� �Ű������� �ٸ�
	}

}
