package ch06;

import java.util.ArrayList;

public class CustomerTest {
//����Ŭ������ ������ �� �׻� ����Ŭ������ ���� �����ȴ�.
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10010, "Tomas");
		Customer customerJ = new Customer(10020, "James");
		Customer customerE = new Customer(10030, "Edward");
		Customer customerP = new Customer(10040, "Tom");
		Customer customerK = new Customer(10050, "Kim");
		
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerK);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		for(Customer customer: customerList) {
			
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "����" + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "�Դϴ�.");
			
		}
		
	}

}
