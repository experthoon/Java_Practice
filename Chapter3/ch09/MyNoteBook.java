package ch09;

public class MyNoteBook extends Notebook {
//추상클래스는 new 할 수 없음
	@Override
	public void typing() {
		System.out.println("MyNoteBook typing");
	}

}
