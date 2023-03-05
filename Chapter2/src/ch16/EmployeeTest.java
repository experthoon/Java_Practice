package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신"); //지역변수 스택메모리에 생성
		
		System.out.println(employeeLee.serialNum); //인스턴스 생성과는 상관없이 사용 가능
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신"); //지역변수 스택메모리에 생성
		employeeKim.serialNum++;
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId()); //두개의 인스턴스가 하나의 메모리를 참조한다
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId());
	}

}
