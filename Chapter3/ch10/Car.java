package ch10;

public abstract class Car { 

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper(); //��� �߰�
	
	
	public void starCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	//abstract �޼���� ����Ŭ�������� �ݵ�� ������ �ؾ��Ѵ�.
	
	public void washCar() { // ���� ������ ���� ���� �ȵȰ� �ƴϴ�. // �� �޼���
		
	}
	
	final public void run() { // �� �ó������� ���ϸ� �ȵȴ�. ������ �Ǹ� �ȵǴ� �޼��带 final�� ����
		starCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
