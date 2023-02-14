package day0111;

class OuterClass{
	int a =10;
	static int b=20;
	
	
	//내부클래스에서 static을 선언하고 싶으면
	//내부클래스 타입을 static으로 주면된다
	//그럴경우에는 외부일반변수 접근안됨
	class InnerClass{   //내부 클래스에서는 static 자체가 선언이 안됨
		int c =30;
		//static int d=40;
		public void write() {
			System.out.println("외부변수 a = " + a);
			System.out.println("외부정적변수 b = " + b);
			System.out.println("내부변수 c = " + c);
		}
	}
}

public class InnerVar_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass.InnerClass oc = new OuterClass().new InnerClass();
		oc.write();
	}

}
