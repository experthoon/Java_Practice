package day0111;

class Server{
	int a = 100;
	static int b = 200;
	
	//내부클래스에서 static을 선언하고 싶으면 내부클래스 타입을 static으로 주면된다
	
	static class Client{
		int c = 300;
		static int d = 400;
		
		public void write()
		{
			System.out.println("외부일반변수 접근안됨");
			System.out.println("외부 static b = " + b);
			System.out.println("내부 static c = " + c);
			System.out.println("내부 static변수 d = " + d);
		}
		
		
	}
}

public class InnerVar_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server.Client cl = new Server.Client();
		cl.write();
	}

}
