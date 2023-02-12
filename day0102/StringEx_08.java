package day0102;

public class StringEx_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String 객체에 대한 멤버 메서드 공부하기");
		
		String str1 = "apple";
		String str2 = "Apple";
		String str3 = "Have a Nice Day!!";
		String str4 = "    Happy Day   ";
		
		System.out.println("str3의 길이: " + str3.length());
		System.out.println("str4의 길이: " + str4.length());
		System.out.println("앞뒤 공백 제거후 str4의 길이: " + str4.trim().length());
		System.out.println("*" + str4 + "*");
		System.out.println("*" + str4.trim() + "*");
		
		System.out.println("str3에서 0번 문자: " + str3.charAt(0));
		System.out.println("str3에서 7번 문자: " + str3.charAt(7));
		
		System.out.println("str3에서 H의 인덱스: " + str3.indexOf('H'));
		System.out.println("str3에서 N의 인덱스: " + str3.indexOf('N'));
		
		System.out.println("str3에서 Nice추출: " + str3.substring(7, 11));
		System.out.println("str3에서 Have추출: " + str3.substring(0,4)); //0~3추출
		System.out.println(str3.substring(7));//해당 인덱스부터 끝까지 출력
		
		//equals는 같으면 true, false
		System.out.println("문자열 비교: " + str1.equals(str2));
		System.out.println("비교: "+str1.equalsIgnoreCase(str2));
		
		//a.compareTo(b)
		//a와 b가 같을경우 0
		//a가 작을경우 -값
		//a가 클경우 +
		
		System.out.println(str1.compareTo(str2)); //a:97 A:65
		System.out.println(str1.compareTo(str1));
		
		System.out.println("computer".compareTo("command"));
		System.out.println("apple".compareTo("banana"));
		System.out.println("김".compareTo("강"));
		
		//startWith.endsWith 
		System.out.println(str3.endsWith("Day!!!")); //true
		System.out.println(str3.endsWith("day!!!")); //false
		
		//문자열 분리하는 메서드 split
		String str5 = "red,blue,yellow,white,gray";
		System.out.println("str5를 컴마(,)로 분리하여 출력하기");
		String arr[] = str5.split(",");
		System.out.println("분리된 색상 갯수: " + arr.length);
		
		//int -> String
		String a = String.valueOf(100);
		
		String a2 = 100+ "";
		
		//double -> String
		String b = String.valueOf(12.4);
		String b2 = 12.5+ "";
		
		//문자열의 일부를 변경
		System.out.println(str3.replace('a', '*'));
	}

}
