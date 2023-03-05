package ch10;

public class BirthDAY {
	private int day;   //디버깅 하기 편함  정보은닉->public 메서드 제어 가능
	private int month;
	private int year;
	
	private boolean isValid; //디폴트 값 false
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;	
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) { //메서드에서 제어 private 쓸데없는 데이터 오용을 막을 수 있음
		if(month < 1 || month > 12)
		{
			isValid = false;
		}else {
			isValid = true;
			this.month = month;
		}
			
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate()
	{
		if(isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		}else {
			System.out.println("유효하지 않는 날입니다.");
		}
			
	}
}
