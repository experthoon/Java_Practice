package ch06;

public class UserInfo {
	public String userId;
	public String userPassWord;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	public UserInfo() {} // ����Ʈ ������
	
	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	
	public String showUserInfo() {
		return userName + "���� ���̵�� " + userId + "�̰�, ��й�ȣ�� " + userPassWord + "�Դϴ�.";
	}
}
