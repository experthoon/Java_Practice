package day0105;

public class StudentMain_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**클래스 멤버값 출력**");
		Student_03.schoolName = "역삼고등학교";
		System.out.println("학교명: " + Student_03.schoolName);
		
		
		
		//인스턴스변수 생성
		System.out.println("**학생정보1**");
		Student_03 c1 = new Student_03();
		c1.name = "홍길동";
		c1.age = 17;
		System.out.println("이름: " + c1.name);
		System.out.println("나이: " + c1.age);
		
		System.out.println("**학생정보2**");
		Student_03 c2 = new Student_03();
		c2.name = "김나영";
		c2.age = 16;
		System.out.println("이름: " +c2.name);
		System.out.println("나이: " +c2.age);
		
	}

}
