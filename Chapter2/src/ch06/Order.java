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
		return "�ֹ� ��ȣ: " + orderNum + "\n�ڵ��� ��ȣ: " + hp + "\n�ּ�: " + addr + "\n�ֹ���: " + day + "\n�ֹ��ð�: " + time + "\n����: " + price + "\n�ֹ��޴�: " + menuNum; 
				
	}
}
