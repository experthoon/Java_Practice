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
		return "키가 " + height + "cm이고, 몸무게가 " + weight + "kg인 " + gender + "이 있습니다. 이름은 " + name + "이고, 나이는 " + age + "입니다.";
		
	}
}
