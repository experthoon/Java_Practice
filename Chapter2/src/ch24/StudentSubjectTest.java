package ch24;

public class StudentSubjectTest {

	public static void main(String[] args) {
		Student student1 = new Student(1001, "Lee");
		student1.addSubject("����", 100);
		student1.addSubject("����", 90);
		
		
		Student student2 = new Student(1002, "Kim");
		student2.addSubject("����", 80);
		student2.addSubject("����", 80);
		student2.addSubject("����", 80);
		
		student1.showScoreInfo();
		System.out.println("================================");
		student2.showScoreInfo();
	}

}
