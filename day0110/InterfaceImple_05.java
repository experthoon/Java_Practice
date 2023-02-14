package day0110;

interface InterA{
	public void write();
	public void draw();
}

/////////////////////////
interface InterB extends InterA{    //인터페이스 끼리는 EXTEND
	public void play();
}
//////////////////////// 2개의 interface를 구현한 클래스
class InterImp1 implements InterB{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("나는 숙제를 합니다");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("나는 그림을 그려요");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("나는 축구를 합니다");
	}

	
	
}

public class InterfaceImple_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.서브클래스를 이용하여 객체생성
		InterImp1 inter1 = new InterImp1();
		
		inter1.draw();
		inter1.write();
		inter1.play();
		System.out.println("-----------------------");
		//2.다형성호출
		
		InterA inA = new InterImp1();
		inA.draw();
		inA.write();
		
		InterB inB = new InterImp1();
		inB.play();
		
	}

}
