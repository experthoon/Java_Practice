package day0109;
//부모클래스가 다른패키지에 있을경우 protected, public 변수는 접근 가능하다.
//같은패키지인 경우에는 private만 빼고 모두 접근가능
public class SuperObj_05 {
	
	protected String name;
	protected int age;
	
	
	
	//명시적 생성자
	public SuperObj_05(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
	}
	
}
