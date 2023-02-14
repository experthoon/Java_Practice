package day0110;

abstract class Game{
	abstract void play();
	abstract void stop();
}
////////////////////
class Dohee extends Game{ //추상메서드이므로 무조건 오버라이딩

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("도희가 게임을 시작합니다.");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("도희가 게임을 중지합니다.");
	}
	
}
class Hoon extends Game{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("훈이가 게임을 시작합니다.");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("훈이가 게임을 중지합니다.");
	}
	
}
class YoundDon extends Game{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("영돈이가 게임을 시작합니다.");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("영돈이가 게임을 중지합니다.");
	}
	
}


public class InterInherit_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game [] ss = new Game[3];// 배열 선언 및 생성
		ss[0] = new Dohee();
		ss[1] = new Hoon();
		ss[2] = new YoundDon();
		
		for (int i = 0; i < ss.length; i++) {
			ss[i].play();
		}
		System.out.println("================");
		for(int i=ss.length-1;i>=0;i--) {
			ss[i].stop();
		}
	}

}
