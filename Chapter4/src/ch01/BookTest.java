package ch01;
//��� Ŭ������ Object Ŭ������ ��� �޴´�.
class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	//����� ���ڰ� ������ �ϰ� ������ �������̵�
	@Override
	public String toString() {
		return title + "," + author;
	}
	
}

public class BookTest {

	public static void main(String[] args) {
		
		Book book = new Book("���̾�", "�츣�� �켼");
		
		System.out.println(book.toString());
		
		String str = new String("test");
		//toString() �޼��� : ��ü�� ������ String���� �ٲپ ����� �� ����, toString �̹� �����ǰ� ��
		System.out.println(str.toString());  
	}

}
