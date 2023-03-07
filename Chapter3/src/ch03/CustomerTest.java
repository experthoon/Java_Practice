package ch03;

public class CustomerTest {
//하위클래스가 생성될 때 항상 상위클래스가 먼저 생성된다.
	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010,"이순신");
		
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		Customer vc = new VIPCustomer(12345, "noname");
		
		
		
	}

}
