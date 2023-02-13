package day0109;
//sub
public class Manager_06 extends Emp_06{
	
	String depart;
	
	public Manager_06(String name, int sal, String d) {
		super(name, sal); //부모생성자호출
		depart=d;
	}

	//부모메서드 재정의(오버라이딩)
	@Override
	public String getEmployee() {
		// TODO Auto-generated method stub
		return super.getEmployee() + "," + depart;
	}
	
}
