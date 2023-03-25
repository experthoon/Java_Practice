package ch15;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("로지1");
		bookQueue.enQueue("로지2");
		bookQueue.enQueue("로지3");
		bookQueue.enQueue("로지4");
		bookQueue.enQueue("로지5");
		
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		
		
	}

}
