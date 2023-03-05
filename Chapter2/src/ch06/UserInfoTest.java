package ch06;

public class UserInfoTest {

	public static void main(String[] args) {
		UserInfo userKim = new UserInfo("B12345","ASD123","김병훈");
		System.out.println(userKim.showUserInfo());
		
		
		UserInfo userSeol = new UserInfo();  //인스턴스 생성
		userSeol.userId = "A12345";
		userSeol.userPassWord = "ASD567";
		userSeol.userName = "설인아";
		userSeol.phoneNumber = "010-1235-1236";
		userSeol.userAddress = "서울시 강남구";
		
		System.out.println(userSeol.showUserInfo());
	}

}
