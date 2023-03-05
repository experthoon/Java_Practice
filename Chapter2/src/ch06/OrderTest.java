package ch06;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order firstorder = new Order("1","010-5555-3333","서울시 강남구 역삼동 땡땡타워 201호", "2월1일", "13시 55분", 28000, "후라이드 치킨");
		System.out.println(firstorder.showOrderInfo());
	}

}
