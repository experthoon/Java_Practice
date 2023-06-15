package ch10;

public class Member {
	
	private int memberId; //회원아이디
	private String memberName; //회원 이름
	
	public Member(int memberId, String memberName) { //생성자
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() { //toString 메소드 오버로딩
		//오버로딩의 정의는 자바의 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메소드가 있더라도 매개변수의 개수 또는 타입이 다르면, 
		//같은 이름을 사용해서 메소드를 정의할 수 있다.
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
	
}
