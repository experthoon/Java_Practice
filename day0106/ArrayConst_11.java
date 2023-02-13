package day0106;

class Info{
	//이름 혈액형 나이(private)
	private String name;
	private String bloodtype;
	private int age;
	//3개 생성자
	public Info(String name, String bloodtype, int age) {
		this.name=name;
		this.bloodtype=bloodtype;
		this.age=age;
	}
	//제목 메서드
	public static void showTitle() {
		System.out.println("총 3명 정보 출력");
		System.out.println("이름\t혈액형\t나이");
		System.out.println("-----------------------------");
	}
	//출력 메서드
	public void showInfo() {
		System.out.println(name + "\t" + bloodtype + "형\t" + age + "세");
	}
	
}

public class ArrayConst_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열로 생성_for문 출력
		
		Info [] fo = new Info[3];
		fo[0] = new Info("이효리","A",29);
		fo[1] = new Info("정우성","B",40);
		fo[2] = new Info("설인아","O",28);
		
		
		Info.showTitle();
		for(Info s:fo) {
			s.showInfo();
		}
	}

}
