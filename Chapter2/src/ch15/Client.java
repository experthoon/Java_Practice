package ch15;

public class Client {
	String ClientName;
	int money;
	
	public Client(String ClientName, int money) {
		this.ClientName = ClientName;
		this.money = money;
	}
	
	public void takeTexi(Texi texi)
	{
		texi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo()
	{
		System.out.println(ClientName + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
}
