package day0106;
/*1.callByValue: 값만 전달받음
 *2.callByReference : 배열은 객체로 인식, 주소가 전달됨
 * 
 */
class Test1{
	String name = "lee";
	String addr = "seoul";
}


public class CallByEx_12 {
	
	//1.callByValue : 값만 전달받음, 메인의 a와 여기 n은 주소가 다릅니다.
	public static void changeInt(int n) {
		System.out.println("전달받은 정수값: " + n);
	}
	
	//2. callByReference
	public static void changeArray(int [] arr) {
		System.out.println("전달받은 배열출력");
		for(int a:arr)
			System.out.println(a);
		arr[2] = 90;
		
	}
	//3.callByReference.. Test1클래스
	public static void changeTest(Test1 t1) {
		System.out.println("전달받은 Test1객체 출력하기");
		System.out.println(t1.name + "," + t1.addr);
		
		//값을 변경
		t1.name = "이효리";
		t1.addr = "제주시";
	}
	//4.
	public static void changeString(String str) {
		System.out.println("전달받은 문자열: " + str);
		
		//문자열 변경
		str = "Happy Day";
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		int a=50;
		changeInt(a); //값만 전달
		System.out.println("a의값이 바뀔까? " + a);
		
		
		//2
		int [] arr2 = {10,20,30}; //객체로 인식, 레퍼런스 변수
		
		changeArray(arr2);
		
		System.out.println("메서드 호출후 배열값 확인하기");
		for(int ar : arr2)
			System.out.println(ar);
		
		//3 직접만든 클래스
		Test1 t1 = new Test1();
		changeTest(t1); //주소가 전달.. lee , seoul
		System.out.println(t1.name + "," + t1.addr);
		
		//4
		String str = "Nice";
		changeString(str); //String은 객체지만 값이 전달
		
		System.out.println("문자열변경확인: " + str); //변경안됨
	}

}
