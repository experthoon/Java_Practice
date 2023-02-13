package day0105;

class StuInfo{
	private String name;
	private String hp;
	public static final String ADDR = "Seoul";
	
	public void setX(String xx) {
		name = xx;
	}
	public void getX() {
		System.out.println("이름: " + name);
	}
	public void setY(String yy) {
		hp = yy;
	}
	public void getY() {
		System.out.println("연락처: " + hp);
	}
}

public class QuizObTest_12 {


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("지역: " + StuInfo.ADDR);
		
		StuInfo stu1 = new StuInfo();
		stu1.setX("김병훈");
		stu1.getX();
		
		StuInfo stu2 = new StuInfo();
		stu2.setY("010-5190-0000");
		stu2.getY();
		
	}

}
