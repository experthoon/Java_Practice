package ch15;

public class Texi {
	String taxiName;
	int money;
	
	public Texi(String taxiName) {
		this.taxiName = taxiName;
		
		}
	public void take(int money) {
		this.money += money;
	}
	public void showTexiinfo() {
		System.out.println(taxiName + "������ " + money + "�� �Դϴ�.");
	}
}
