package day0109;
//super

public class Emp_06 {
	
	String name;
	int salary;
	
	public Emp_06(String name, int sal) {
		this.name=name;
		this.salary=sal;
	}
	
	//메서드
	public String getEmployee()
	{
		return name + "," + salary;
	}
}
