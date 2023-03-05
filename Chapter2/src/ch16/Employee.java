package ch16;

public class Employee {
	
	public static int serialNum = 1000;
	
	private int employeeId; //멤버변수
	private String employeeName;
	private String department;
	
	public Employee()
	{
		serialNum++; 
		employeeId = serialNum; //멤버변수에다 증가
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
