package ch06;

public class Order {
	
	public String orderNum;
	public String hp;
	public String addr;
	public String day;
	public String time;
	public int price;
	public String menuNum;
	
	public Order() {
		
	}
	
	public Order(String orderNum, String hp, String addr, String day, String time, int price, String menuNum)
	{
		this.orderNum = orderNum;
		this.hp = hp;
		this.addr = addr;
		this.day = day;
		this.time = time;
		this.price = price;
		this.menuNum = menuNum;
	}
	
	public String showOrderInfo()
	{
		return "주문 번호: " + orderNum + "\n핸드폰 번호: " + hp + "\n주소: " + addr + "\n주문일: " + day + "\n주문시간: " + time + "\n가격: " + price + "\n주문메뉴: " + menuNum; 
				
	}
}
