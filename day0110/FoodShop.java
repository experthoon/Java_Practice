package day0110;

public interface FoodShop {
	//인터페이스는 상수와 추상메서드만 선언가능하다
	//final,abstract는 생략
	
	String SHOPNAME = "쌍용식당"; //상수
	
	public void order(); //추상메서드만 올수있다
	public void beadal();
}
