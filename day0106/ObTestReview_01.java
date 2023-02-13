package day0106;

public class ObTestReview_01 {

	String name;
	int age;
	
	public ObTestReview_01() { //디폴트 생성자
		
	}
	
	//생성자
	public ObTestReview_01(String name) {  //명시적 생성자
		// TODO Auto-generated constructor stub
		this(name,19);
	}
	
	public ObTestReview_01(String name, int age) { //명시적 생성자
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
	}
	
	//getter메서드
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObTestReview_01 ob = new ObTestReview_01("이영자",43);
		
		System.out.println("이름은 " + ob.getName() + "이고 나이는" + ob.getAge());
		
		
	}

}
