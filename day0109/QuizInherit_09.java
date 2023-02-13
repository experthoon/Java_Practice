package day0109;

//super
class Shop{
	private String sangpum;
	private int su;
	
	public Shop() { //디폴트생성자
		sangpum = "딸기";
		su=5;
	}
	public Shop(String sangpum, int su) //명시적생성자
	{
		this.sangpum=sangpum;
		this.su=su;
	}
	
	public void writeShop() //출력 메서드
	{
		System.out.println("상품명: " + sangpum);
		System.out.println("수량: " + su);
	}
	
}

//sub
class MySangPum extends Shop{
	private int price;
	
	public MySangPum() { //디폴트생성자
		price = 1000;
	}
	public MySangPum(String sangpum, int su, int price) { //명시적생성자
		super(sangpum,su);
		this.price=price;
	}
	
	@Override //오버라이드 하위클래스에서 상위클래서의 메서드를 재정의하는 기능
	public void writeShop() {
		System.out.println("단가: " + price);
		super.writeShop();
	}
}


public class QuizInherit_09 {

	public static void main(String[] args) {
		
		MySangPum m1 = new MySangPum(); //객체1 생성
		m1.writeShop();
		
		MySangPum m2 = new MySangPum("망고", 5, 2000); //객체2 생성
		m2.writeShop();

	}

}
