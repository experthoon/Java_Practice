package day0105;


class TestA{
	String name = "이수진";
	static String MESSAGE = "HappyDay!!!";
	//TestA 생성자 숨어있음
}

public class ObTest_05 {
	
	int a; //자동변수
	static int b;
	//생성자 숨어있음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b=20;
		System.out.println("b=" + b);
		
		//일반멤버변수는 인스턴스가 있어야 접근가능
		//인스턴스변수는 생성해줄때 변수
		ObTest_05 ob1 = new ObTest_05();
		ObTest_05 ob2 = new ObTest_05();
		
		ob1.a=10;
		ob2.a=20;
		
		System.out.println("ob1.a= " + ob1.a);
		System.out.println("ob2.a= " + ob2.a);
		
		TestA ta = new TestA();
		System.out.println(ta.name);
		System.out.println(TestA.MESSAGE); //static은 공용
	}

}
