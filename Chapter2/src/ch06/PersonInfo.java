package ch06;

public class PersonInfo {

	public int height;
	public int weight;
	public String gender;
	public String name;
	public int age;
	
	public PersonInfo() {
		
	}
	public PersonInfo(int height, int weight, String gender, String name, int age ) {
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	public String showPersonInfo() {
		return "Ű�� " + height + "cm�̰�, �����԰� " + weight + "kg�� " + gender + "�� �ֽ��ϴ�. �̸��� " + name + "�̰�, ���̴� " + age + "�Դϴ�.";
		
	}
}
