package day0106;

//다른 패키지에서 클래스 만들경우(생성자포함) 접근지정자에따라 오류발생 확인
//패키지가 다를경우 생성자앞에 반드시 public이 있어야 접근 가능
//만약 protected나 private으로 만들경우에는 객체의 인스턴스를 얻을 수 있는 static 메소드를 구현한다
public class Test_03 {
	
	private Test_03() {
		System.out.println("디폴트 생성자");
	}
	
	//생성자 대신 인스턴스를 반환해주는 메소드
	public static Test_03 getInstance() {
		return new Test_03();
	}
	
	public void wrtieMessage() {
		System.out.println("안녕하세요!!");
	}
	
}
