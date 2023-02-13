package day0106;

public class MyDate_02 {
	
	//인스턴스 변수선언
	private int year;
	private int month;
	private int day;
	
	
	
	//명시적생성자를 만들면 디폴트생성자는 만들어지지 않는다
	public MyDate_02(int y, int m, int d) {
		// TODO Auto-generated constructor stub
		year = y;
		month = m;
		day = d;
	}
	
	//getter, setter
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	
}
