package day0105;

class StuInfo1{
	
	private String name;
	private String hp;
	public static final String ADDR = "Seoul";
	
	//setter
	public void setName(String name) {
		this.name=name;
	}
	public void setHp(String hp) {
		this.hp=hp;
	}
	
	public void setData(String name, String hp)
	{
		this.name=name;
		this.hp=hp;
	}
	//getter : 값을 반환하기 위해서 만들어줌
	public String getName() {
		return name;
	}
	public String getHp() {
		return hp;
	}
	
	
	//출력메서드 1
	public void write()
	{
		System.out.println("지역: " + ADDR);
		System.out.println("이름: " + this.name);
		System.out.println("연락처: " + hp);
	}
	//출력메서드 2
	public void showInfo() {
		System.out.println("이름: " + this.name + "연락처: " + this.hp);
	}
}

public class QuizObTestReview_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StuInfo1 info1 = new StuInfo1();
		info1.write();
		
		info1.setName("강호동");
		info1.setHp("010-5190-0000");
		info1.write();
		
		System.out.println("**출력_2**");
		System.out.println("이름: " + info1.getName());
		System.out.println("연락처: " + info1.getHp());
		
		//멤버값 동시수정
		StuInfo1 in2 = new StuInfo1();
		in2.setData("이동형", "0101-000-000");
		in2.showInfo();
		
	}

}
