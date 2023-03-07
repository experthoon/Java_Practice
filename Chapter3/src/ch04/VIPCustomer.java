package ch04; //하위 클래스

public class VIPCustomer extends Customer { //멤버변수를 쓰려면 메모리가 있어야함
	
	double salesRatio;
	String agentID;
	
	/*public VIPCustomer() {
		
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call");
				
	}*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}

	public String getAgentID() {
		
		return agentID;
	}
}
