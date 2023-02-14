package day0111;

abstract class AbstEx1{
	abstract public void dataAdd();
	abstract public void dataList();
}
//////////////////


public class AnnoyClass_07 {
	
	//익명내부클래스 형태
	AbstEx1 ab1 = new AbstEx1() {

		@Override
		public void dataAdd() {
			// TODO Auto-generated method stub
			System.out.println("데이터를 출력합니다.");
			
		}

		@Override
		public void dataList() {
			// TODO Auto-generated method stub
			System.out.println("데이터를 추가합니다.");
			
		}
		
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnoyClass_07 an = new AnnoyClass_07();
		an.ab1.dataAdd();
		an.ab1.dataList();
	}

}
