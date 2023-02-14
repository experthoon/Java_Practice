package day0110;

public class Sawon {
	private String sawonName;
	private int gibonPay, timeSu, familySu; //기본급, 시간외수당, 가족수당
	
	//명시적 생성자
	public Sawon(String sName, int gPay, int tSu, int fSu) {
		this.sawonName = sName;
		this.gibonPay = gPay;
		this.timeSu = tSu;
		this.familySu = fSu;
	}
	public String getSawonName() {
		return sawonName;
	}
	
	public int getGibonPay() {
		return gibonPay;
	}

	//가족수당은 3인미만은 5만원, 그 이상은 7만원
	public int getFamilySudnag()
	{

		if(familySu<3)
			return 50000;
		else
			return 70000;
	
	}
	//시간외 수당은 초과시간당 2만원(단 5시간 이상은 무조건 10만원)
	public int getTimeSudang()
	{
		if(timeSu>=5) {
			return 100000;
		}
		int overTimePay = timeSu*20000;
		return overTimePay;
	}
	//총급여 기본급과 수당을 더한것의 90%만 제공됨(10%는 세금공제)
	public int getTotalPay()
	{
		int totalMoney = gibonPay + getFamilySudnag() + getTimeSudang();
		totalMoney = (int) (totalMoney - (totalMoney * 0.1));
		return totalMoney;
	}
	
}
