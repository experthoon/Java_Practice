package ch06;

public class UserInfo {
	public String userId;
	public String userPassWord;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	public UserInfo() {} // 디폴트 생성자
	
	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	
	public String showUserInfo() {
		return userName + "님의 아이디는 " + userId + "이고, 비밀번호는 " + userPassWord + "입니다.";
	}
}
