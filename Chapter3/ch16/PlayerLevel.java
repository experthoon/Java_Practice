package ch16;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	//Player�� play() �߿� ������ �ִ� go(int count) ��� �޼��带 ȣ���ϸ� run() �ϰ� count Ƚ�� ��ŭ jump() �ϰ� turn() �մϴ�. 
	//���� Ŭ���� ���̾�׷��� �����Ͽ� �� �������� go() �� ȣ�� �ɶ� ������ ���� ���
	final public void go(int count) { 
		for(int i=0;i<count;i++) {
			jump();
		}
		turn();
	}
	
}
