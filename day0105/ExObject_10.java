package day0105;

public class ExObject_10 {
	
	private String sangpum;
	int su;
	int dan;
	
	static String SHOPNAME = "이마트";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExObject_10 ex1 = new ExObject_10();
		ex1.sangpum = "텀블러";
		ex1.su = 5;
		ex1.dan = 5000;
		
		System.out.println("상점명: " + SHOPNAME);
		System.out.println("상품명: " + ex1.sangpum);
		System.out.println("수량: " + ex1.su);
		System.out.println("단가: " + ex1.dan);
		
		
	}

}
