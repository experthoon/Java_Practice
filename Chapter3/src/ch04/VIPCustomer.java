package ch04; //���� Ŭ����

public class VIPCustomer extends Customer { //��������� ������ �޸𸮰� �־����
	
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
