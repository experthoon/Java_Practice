package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		//버퍼는 계속 변화가 됨
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));
		
		String test = buffer.toString();
		System.out.println(test);
		
	}

}
