package ch09;

public abstract class Computer { //�߻�Ŭ������ ����� ���� ? turnon�̶� turnoff�� ���� ���� �׷����� ��� ���� ����Ŭ�������� Ÿ������ ��� ���� ��
	//�߻�Ŭ������ ����� ���� Ŭ����
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("������ �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�");
	}
}
