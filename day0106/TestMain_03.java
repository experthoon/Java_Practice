package day0106;

import java.util.Calendar;

public class TestMain_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test_03 t1 = new Test_03(); 생성자가 private
		
		Test_03 t1 = Test_03.getInstance();
		t1.wrtieMessage();
		
		//Calendar cal = new Calendar(); //에러나는 이유는 protected
		Calendar cal = Calendar.getInstance();
		int y = cal.get(cal.YEAR);
		int m = cal.get(cal.MONTH)+1;
		int d = cal.get(cal.DATE);
		
		System.out.println(y + "년" + m + "월" + d + "일 입니다.");
	}

}
