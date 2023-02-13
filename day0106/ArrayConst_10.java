package day0106;

class Shop{
	private String sangpum;
	private int price;
	private String color;
	
	//3개 생성자
	public Shop(String sangpum, int price, String color) {
		this.sangpum=sangpum;
		this.price=price;
		this.color=color;
	}
	//제목 메서드
	public static void showTitle()
	{
		System.out.println("상품명\t단가\t색상");
	}
	//출력메서드(showSangpum)
	public void showSangpum() {
		
		System.out.printf("%s %d %s\n",sangpum, price, color);
	}
}
public class ArrayConst_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop [] stu = new Shop[4];
		
		stu[0] = new Shop("갤럭시폴더",  12000000, "화이트");
		stu[1] = new Shop("아이폰14",  14000000,  "그린");
		stu[2] = new Shop("아이폰13",  9500000,   "레드");
		stu[3] = new Shop("소니폰",    9200000,   "블랙");
		
		Shop.showTitle();
		System.out.println("===============================");
		for(int i=0; i<stu.length; i++)
		{
			stu[i].showSangpum();
		}
		
	}		

}
