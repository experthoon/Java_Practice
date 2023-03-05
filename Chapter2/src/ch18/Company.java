package ch18;

public class Company {

		private static Company instance = new Company(); //유일한 객체 //instance = private
		private Company() {  //생성자 생성
			
		}
		
		
		//접근을 하기위한 메서드를 생성 , 싱글톤 패턴
		public static Company getInstance() { //getinstance = public
			if(instance == null) {
				instance = new Company();
			}
			
			return instance;
		}
		
}
