package day0110;

//interface는 new로 생성안됨
interface Color{
	
	String INITCOLOR="white";// 상수
	public void showColor();   //추상메서드
}
///////////////////////
class Red implements Color{

	@Override
	public void showColor() {
		// TODO Auto-generated method stub
		System.out.println("Red-showColor");
		System.out.println("현재색상: "+INITCOLOR);
	}
	
}
/////////////////////////
class Blue implements Color{

	@Override
	public void showColor() {
		// TODO Auto-generated method stub
		System.out.println("Blue-ShowColor");
	}
	
}
//////////////////////
class Green implements Color{

	@Override
	public void showColor() {
		// TODO Auto-generated method stub
		System.out.println("Green-showColor");
	}
	
}
public class Inherit_07 {
	
	
	/*public static void show(Color color) {
		color.showColor();
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*show(new Red());
		show(new Blue());
		show(new Green());*/
		
		
		Color color;
		color = new Red();
		color.showColor();
		
		color = new Green();
		color.showColor();
		
		color = new Blue();
		color.showColor();
		
		
		
	}

}
