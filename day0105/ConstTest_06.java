package day0105;

class Numb{
	int num; //0
	
	//디폴트 생성자, 인자없는 생성자 자동으로 만들어짐
	public Numb() {
		
		//num=10;
		System.out.println("디폴트 생성자 호출");
	}
	//인자있는 생성자
	public Numb(int num) {  //명시적으로 만드는 순간 디폴트 생성자는 없기 떄문에 따로 만들어줘야함
		//생성자에서 넘버값을 전달하려면
		this.num = num; //이름이 같으면 this를 무조건 붙여야함  , this는 인스턴스변수 자기자신을 의미
		System.out.println("인자있는 생성자호출");	
	}
	//메소드
	public int getNumber() {
		num=50;
		return num;
	}
}



public class ConstTest_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numb num1 = new Numb();// 인자를 전달받지않는 생성자
		System.out.println(num1.num);
		
		Numb num2 = new Numb(30);
		System.out.println(num2.num);
		
		Numb num3 = new Numb();
		System.out.println(num3.getNumber());
		
	}

}
