package day0111;

import day0111.OuterObj.InnerObj;

class OuterObj{
	
	
	class InnerObj{  //클래스지만 멤버처럼 사용 가능
		
		public void write() {
			System.out.println("내부클래스의 메서드");
		}
	}
	
	public void disp() {
		System.out.println("외부클래스의 메서드");
		System.out.println("외부에서 내부클래스의 메서드를 호출");
		
		InnerObj inObj = new InnerObj(); //객체 생성
		inObj.write();
	}
}




public class InnerClassTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterObj outObj = new OuterObj(); //객체 생성
		outObj.disp();
		
		
		//내부클래스의 메서드에 접근 -> 외부를 통해서만 가능
		//OuterObj.InnerObj obj = new OuterObj().new InnerObj();
		OuterObj.InnerObj obj = outObj.new InnerObj();
		
		obj.write();
		
	}

}
