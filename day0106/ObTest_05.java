package day0106;

class Jungbo{
	private String name;
	private String address;
	private String hp;
	
	//각각의 setter,getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	//3개의 멤버 한버에 수정하는 메서드
	public void setMembers(String name, String address, String hp) {
		this.name=name;
		this.address=address;
		this.hp=hp;
	}
	
	//3개의 멤버 한번에 리턴하는 메서드
	public String getMembers() {
		String s = "name: " + name + "\naddress: " + address + "\nhp: " + hp;
		
		return s;
	}
}


public class ObTest_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 디폴트 생성.. 각각의 setter,getter출력
		Jungbo j = new Jungbo();
		
		j.setName("유재석");
		j.setAddress("서울시 강남구");
		j.setHp("010-0000-0000");
		System.out.println("1.값출력");
		System.out.println("이름: " + j.getName());
		System.out.println("주소: " + j.getAddress());
		System.out.println("나이: " + j.getHp());
		
		
		//2. 디폴트생성.. 3개멤버 한번에 수정하는, 한번에 출력하는 메서드
		System.out.println("**2. 3개의 값 한번에 출력");
		j.setMembers("이영자", "경기도 성남시", "010-0000-0001");
		System.out.println("2.값출력");
		System.out.println(j.getMembers());
	}

}
