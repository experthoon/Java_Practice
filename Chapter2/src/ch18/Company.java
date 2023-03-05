package ch18;

public class Company {

		private static Company instance = new Company(); //������ ��ü //instance = private
		private Company() {  //������ ����
			
		}
		
		
		//������ �ϱ����� �޼��带 ���� , �̱��� ����
		public static Company getInstance() { //getinstance = public
			if(instance == null) {
				instance = new Company();
			}
			
			return instance;
		}
		
}
