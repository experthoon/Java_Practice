package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("�̼���"); //�������� ���ø޸𸮿� ����
		
		System.out.println(employeeLee.serialNum); //�ν��Ͻ� �������� ������� ��� ����
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("������"); //�������� ���ø޸𸮿� ����
		employeeKim.serialNum++;
		
		System.out.println(employeeLee.getEmployeeName() + "���� ����� " + employeeLee.getEmployeeId()); //�ΰ��� �ν��Ͻ��� �ϳ��� �޸𸮸� �����Ѵ�
		System.out.println(employeeKim.getEmployeeName() + "���� ����� " + employeeKim.getEmployeeId());
	}

}
