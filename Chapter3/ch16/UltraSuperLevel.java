package ch16;

public class UltraSuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("매우 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("완저 높이 jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("매우 빠르게 turn 합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("************ 초고수 레벨입니다. ************");
	}

}
