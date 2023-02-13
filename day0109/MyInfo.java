package day0109;

public class MyInfo extends Person_08 {
	
	int age;
	
	public MyInfo(String name, String buseo, int age) {
		this.name=name;
		this.buseo=buseo;
		this.age=age;
	}
	
	public void myInfo()
	{
		System.out.println("사원명은 " + this.name);
		System.out.println("부서는 " + this.age);
		System.out.println("나이는 " + this.age);
	}
	
	
	//오버라이딩
	/*@Override
	public void writeInfo() {
		// TODO Auto-generated method stub
		super.writeInfo();
		System.out.println("나이: " + this.age);
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInfo my1 = new MyInfo("이수지", "교육부", 29);
		my1.myInfo();
		
		System.out.println();
		System.out.println("**오버라이드 메서드 통한 출력**");
		my1.writeInfo();
	}

}
