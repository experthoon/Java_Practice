package day0109;
/*클래스 생성시는 자동 부모 -> 자식순
 * 그래야 자식이 부모 멤버를 사용할 수 있기 떄문
 * 
 * 오버라이딩
 * 하위클래스에서 부모클래스의 메서드를 수정사용
 * 1. 상속이 전제 2. 메소드명 동일 3.메서드 리턴타입도 동일
 */
public class Point_07 {
	
	protected int x;
	protected int y;
	
	//디폴트 생성자
	public Point_07()
	{
		System.out.println("super_디폴트 생성자");
	}
	
	public Point_07(int x, int y) {
		// TODO Auto-generated constructor stub
		System.out.println("super_인자있는 생성자");
		this.x=x;
		this.y=y;
	}
	
	//메서드
	public void write()
	{
		System.out.println("x좌표는 = " + x + ", y좌표는 = " + y);
	}
}
