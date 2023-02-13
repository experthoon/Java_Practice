package day0105;

public class MyCar_13 {
	
	private String carName;
	private int price;
	private String color;
	
	public void setData1(String carName, int price, String color) {
		this.carName=carName;
		this.price=price;
		this.color=color;
	}
	
	public String getData1()
	{
		return carName;
	}
	public int getData2()
	{
		return price;
	}
	public String getData3()
	{
		return color;
	}
	public void showInfo() {
		System.out.println("**자동차명 변경후 출력**");
		System.out.println("자동차명: " + carName);
		System.out.println("차량가격: " + price);
		System.out.println("차량색상: " + color);
	}
}
