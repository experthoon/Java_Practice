package day0110;

interface InterAA{
	public void order();
}
interface InterBB extends InterAA{ //같은 인터페이스끼리는 extends로 받음
	public void beadal();
	public void pungga();
}
class InterImpl2 implements InterAA, InterBB{

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("주문을 합니다");
	}

	@Override
	public void beadal() {
		// TODO Auto-generated method stub
		System.out.println("배달을 합니다");
	}

	@Override
	public void pungga() {
		// TODO Auto-generated method stub
		System.out.println("평가를 합니다");
	}
	
}

public class QuizInter_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//객체생성 #1
		InterImpl2 inter2 = new InterImpl2();
		inter2.beadal();
		inter2.pungga();
		inter2.order();
		
		System.out.println("-------------------------------");
		
		
		//객체생성 #2 다형성
		InterAA inA = new InterImpl2();
		inA.order();
		
		InterBB inB = new InterImpl2();
		inB.beadal();
		inB.pungga();
	}

}
