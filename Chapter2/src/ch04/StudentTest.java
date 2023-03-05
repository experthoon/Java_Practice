package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); //student 한명을 생성 , studentLee == 변수
		
		studentLee.studentID = 12345;   //studentLee 참조변수 : 메모리 위치를 나타냄
		studentLee.studentName ="Lee";
		studentLee.address = "서울시 강남구";   //인스턴스를 생성했고 멤버변수와 메서드를 이용해 값 세팅.
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();
		
		//인스턴스는 생성자를 호출해서 만들 수 있음.
		//객체 : 생성된 인스턴스
		//클래스 : 객체를 프로그래밍 하기위해 코드로 정의
		//인스턴스 : new키워드를 사용하여 클래스를 메모리에 생성
		
		
	}

}
