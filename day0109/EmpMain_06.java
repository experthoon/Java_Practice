package day0109;



public class EmpMain_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager_06 sub = new Manager_06("이효리", 230, "디자인부");
		
		//재정의된 메서드가 호출된다
		System.out.println(sub.getEmployee());
	}

}
