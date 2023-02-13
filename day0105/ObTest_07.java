package day0105;

class ObTestA{
	
	private int x;
	private static int y;
	//private이면 메서드로 접근가능..생성을 해도 참조변수로 변수에 접근이 안됨
	
	//멤버수정메서드
	//인스턴스 멤버메서드_this를 가지고 있으므로 따로 객체생성하지 않아도 멤버
	public void setX(int xx) {
		//this.x=xx;
		x=xx; //이름이 틀릴땐 this생략가능
	}
	
	//멤버출력메서드
	public void getX() {
		System.out.println("x="+this.x);
	}
	//y_static
	public static void setY(int yy) {
		//static은 this를 가지고있지않다
		//일반멤버변수 호출못함...static변수만 호출가능
		ObTestA.y=yy;
		//y=yy;
	}
	public static void getY() {
		System.out.println("y= " + ObTestA.y);
	}
}
public class ObTest_07 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//x 호출
		ObTestA ta1 = new ObTestA();
		ta1.setX(10); //수정
		ta1.getX();  //출력
		
		ObTestA ta2 = new ObTestA();
		ta2.setX(100); //수정
		ta2.getX();   //출력
		
		//y 호출
		//static메서드는 인스턴스로 호출하지않고 클래스명으로 호출
		ObTestA.setY(200);
		ObTestA.getY();
		
	}

}
