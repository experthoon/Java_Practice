package day0113;

public class Shop {

	private String sangpum;
	private int su;
	private int dan;
	
	//디폴트생성자
	public Shop() {
		
	}
	public Shop(String sangpum, int su, int dan) {
		this.sangpum=sangpum;
		this.su=su;
		this.dan=dan;
	}

	public String getSangpum() {
		return sangpum;
	}

	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}
	
	
	public int getTot()
	{
		return su*dan;
	}
	
}
