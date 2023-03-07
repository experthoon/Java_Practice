package ch02;

public class VIPCustomer extends Customer { //멤버변수를 쓰려면 메모리가 있어야함
	
	double salesRatio;
	String agentID;
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
				
	}
	
	public String getAgentID() {
		return agentID;
	}
}
