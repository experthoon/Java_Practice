package ch06;

public class UserInfoTest {

	public static void main(String[] args) {
		UserInfo userKim = new UserInfo("B12345","ASD123","�躴��");
		System.out.println(userKim.showUserInfo());
		
		
		UserInfo userSeol = new UserInfo();  //�ν��Ͻ� ����
		userSeol.userId = "A12345";
		userSeol.userPassWord = "ASD567";
		userSeol.userName = "���ξ�";
		userSeol.phoneNumber = "010-1235-1236";
		userSeol.userAddress = "����� ������";
		
		System.out.println(userSeol.showUserInfo());
	}

}
