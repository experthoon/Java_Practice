package ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); //디폴트 생성자 -> 클래스에 생성자가 하나도 없는 경우
		
		System.out.println(studentLee.showStduentInfo());
		
		Student studentKim = new Student(123456, "Kim", 3);
		System.out.println(studentKim.showStduentInfo());
		//오버로딩 : 메서드의 이름은 똑같고 매개변수만 다름
	}

}
