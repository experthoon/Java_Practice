package ch15;

public class TakeTaxiTest {

	public static void main(String[] args) {
		Client client1 = new Client("Edward", 20000);
		Texi texi1 = new Texi("�� ������ ����ý�");
		client1.takeTexi(texi1);
		
		client1.showInfo();
		texi1.showTexiinfo();
	}

}
