package day0106;

public class MemberMain_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member_04 mm1 = new Member_04();
		Member_04 mm2 = new Member_04();
		Member_04 mm3 = new Member_04();
		
		
		mm1.setData("김병훈", "남자", "경기");
		mm2.setData("설인아", "여자", "경기");
		mm3.setData("김무열", "남자", "서울");
		
		Member_04.ban = "JAVA반";
		
		mm1.writeData();
		mm2.writeData();
		mm3.writeData();
		
	}

}
