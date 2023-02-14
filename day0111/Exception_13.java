package day0111;

import java.io.IOException;
import java.io.InputStream;

public class Exception_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = System.in; // 콘솔에서 입력받기위한 스트림
		
		int n = 0;
		System.out.println("한글자 입력");
		
		try {
			n = is.read(); //한바이트밖에 못읽어서 2바이트인 한글못읽는다.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("오류: " + e.getMessage());
		}
		System.out.println("**3초뒤에 출력합니다**");
		
		try {
			Thread.sleep(3000); //3초뒤
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("입력값: " + (char)n);
	}

}
