package ch16;

public class UltraSuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("�ſ� ���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� ���� jump �մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("�ſ� ������ turn �մϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("************ �ʰ�� �����Դϴ�. ************");
	}

}
