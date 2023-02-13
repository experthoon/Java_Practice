package day0105;

public class MyCarMain_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCar_13 info = new MyCar_13();
		
		info.setData1("그랜져", 4000, "진주색");
		
		String carName = info.getData1();
		int price = info.getData2();
		String color = info.getData3();
		
		System.out.println("**나의 자동차 정보**");
		System.out.println("자동차명: " + carName);
		System.out.println("차량가격: " + price);
		System.out.println("차량색상: " + color);
		System.out.println();
		
		MyCar_13 info2 = new MyCar_13();
		info2.setData1("재네시스g80", 8000, "그레이");
		info2.showInfo();
		
	}

}



/*
 * MyCar_13 car = new MyCar_13();
 * c 
 * 
 * 
 * 
 * */
 