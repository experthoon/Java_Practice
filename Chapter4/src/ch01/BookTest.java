package ch01;
//모든 클래스는 Object 클래스를 상속 받는다.
class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	//제목과 저자가 나오게 하고 싶으면 오버라이딩
	@Override
	public String toString() {
		return title + "," + author;
	}
	
}

public class BookTest {

	public static void main(String[] args) {
		
		Book book = new Book("데미안", "헤르만 헤세");
		
		System.out.println(book.toString());
		
		String str = new String("test");
		//toString() 메서드 : 객체의 정보를 String으로 바꾸어서 사용할 때 쓰임, toString 이미 재정의가 됨
		System.out.println(str.toString());  
	}

}
